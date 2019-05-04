package com.example.ismai.firebase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

   
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        initeView();

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (name.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "please Enter Your Name", Toast.LENGTH_SHORT).show();
                } else if (email.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "please Enter Your email", Toast.LENGTH_SHORT).show();
                } else if (phone.getText().toString().isEmpty()) {
                    Toast.makeText(MainActivity.this, "please Enter Phone Number", Toast.LENGTH_SHORT).show();
                } else {
                    Model model = new Model(name.getText().toString(), email.getText().toString(), strImageUri, phone.getText().toString());
                    String key = mRef.push().getKey();
                    mRef.child(key).setValue(model);
                    Toast.makeText(MainActivity.this, "Insert Successfuly", Toast.LENGTH_SHORT).show();
                    clearText();
                }

            }
        });

        mRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                list = new ArrayList<Model>();
                for (DataSnapshot dataSnapshot1 : dataSnapshot.getChildren()) {

                    Model value = dataSnapshot1.getValue(Model.class);
                    Model model = new Model(name.getText().toString(), email.getText().toString(), strImageUri, phone.getText().toString());
                    String name = value.getName();
                    String email = value.getEmail();
                    String image = value.getImage();
                    String phone = value.getPhone();
                    model.setName(name);
                    model.setEmail(email);
                    model.setImage(image);
                    model.setPhone(phone);
                    list.add(model);
                }

            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                Log.w("Hello", "Failed to read value.", error.toException());
            }
        });


        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ViewAdapter adapter = new ViewAdapter(list, MainActivity.this);
                // RecyclerView.LayoutManager recyce = new GridLayoutManager(MainActivity.this, 1);
                //recycle.setLayoutManager(layoutManager);
                recycle.setItemAnimator(new DefaultItemAnimator());
                recycle.setAdapter(adapter);
                viewDetails();

            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewMain();
            }
        });

        browse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent gallery = new Intent(Intent.ACTION_PICK);
                gallery.setType("image/*");
                startActivityForResult(gallery, PICK_IMAGE);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == PICK_IMAGE && resultCode == RESULT_OK) {

            imageUri = data.getData();
            image.setImageURI(imageUri);
            progressDialog.setMessage("Loading....");
            progressDialog.show();

            final StorageReference filepath = mStorage.child("photos").child(imageUri.getLastPathSegment());
            filepath.putFile(imageUri).addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
                @Override
                public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                    filepath.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
                        @Override
                        public void onSuccess(Uri uri) {
                            Log.d("UPLOAD", "onSuccess: uri= " + uri.toString());
                            progressDialog.dismiss();
                            strImageUri = uri.toString();
                        }

                    });
                }
            });


        }


    }

    protected void clearText() {
        email.setText("");
        name.setText("");
        phone.setText("");
        image.setImageResource(R.drawable.ic_person);
    }

    protected void viewDetails() {
        layoutMain.setVisibility(View.GONE);
        back.setVisibility(View.VISIBLE);
        submit.setVisibility(View.GONE);
        view.setVisibility(View.GONE);
        recycle.setVisibility(View.VISIBLE);
    }

    protected void viewMain() {

        layoutMain.setVisibility(View.VISIBLE);
        back.setVisibility(View.GONE);
        submit.setVisibility(View.VISIBLE);
        view.setVisibility(View.VISIBLE);
        recycle.setVisibility(View.GONE);

    }

    protected void initeView() {
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.etname);
        email = findViewById(R.id.etemail);
        submit = findViewById(R.id.btnsubmit);
        view = findViewById(R.id.btnview);
        browse = findViewById(R.id.btnchoose);
        image = findViewById(R.id.imgUpload);
        recycle = findViewById(R.id.rcvView);
        phone = findViewById(R.id.etphone);
        layoutMain = findViewById(R.id.lytMain);
        back = findViewById(R.id.btnback);


        progressDialog = new ProgressDialog(this);
        mDatabase = FirebaseDatabase.getInstance();
        mRef = mDatabase.getReference("user");
        mStorage = FirebaseStorage.getInstance().getReference();



    }
}
