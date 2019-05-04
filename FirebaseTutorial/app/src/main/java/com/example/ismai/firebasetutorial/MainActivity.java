package com.example.ismai.firebasetutorial;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private Spinner spinner;
    private Button button;
    private ListView listView;
    DatabaseReference databaseStudent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        databaseStudent = FirebaseDatabase.getInstance().getReference("student");

        editText = findViewById(R.id.editTextId);
        spinner = findViewById(R.id.spinnerId);
        button = findViewById(R.id.buttonId);
        listView = findViewById(R.id.listViewId);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addStudentinfo();
            }
        });
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);

        databaseStudent.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        })
    }

    private void addStudentinfo() {

        String name = editText.getText().toString().trim();
        String department = spinner.getSelectedItem().toString().trim();

        if(!TextUtils.isEmpty(name)){

            String id = databaseStudent.push().getKey();
            Student student = new Student(id,name,department);

            databaseStudent.child(id).setValue(student);

            Toast.makeText(MainActivity.this, "Data add successfully",Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(MainActivity.this,"Please Enter valid name", Toast.LENGTH_SHORT).show();
        }
    }
}
