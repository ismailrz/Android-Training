package com.example.ismai.rzchat;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class RegisterActivitytest extends AppCompatActivity {
    private EditText nDisplayName;
    private EditText nEmail;
    private  EditText nPassword;
    private Button nCreatebtn;

    //toolbar
    private Toolbar mToolbar;


    //progress
    private ProgressDialog nRegProgress;

    // firebase - auth
     private FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_activitytest);

        //firebase auth
         mAuth = FirebaseAuth.getInstance();

        mToolbar = findViewById(R.id.appBarId);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setTitle("Creat Account");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //progress
        nRegProgress = new ProgressDialog(this);



        //find id register
        nDisplayName = findViewById(R.id.reg_display_name);
        nEmail = findViewById(R.id.reg_email_id);
        nPassword = findViewById(R.id.reg_password_id);
        nCreatebtn = findViewById(R.id.reg_create_btn);

       // String display_name = nDisplayName.getText().toString();
       //  String email  = nEmail.getText().toString();
       // String password = nPassword.getText().toString();



        String display_name = "Bangladesh 2";
        String email = "ismailcse114@gmail.com";
        String password = "ismail";

        if(!TextUtils.isEmpty(display_name ) || !TextUtils.isEmpty(email) || !TextUtils.isEmpty(password)){

            nRegProgress.setTitle("Registering Users");
            nRegProgress.setMessage("Please wait when we create your account!");
            nRegProgress.setCanceledOnTouchOutside(false);
            nRegProgress.show();


            register_user(display_name,email,password);
        }


    }
      private void register_user(String display_name, String email, String password) {
         mAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener( new OnCompleteListener<AuthResult>() {
     @Override
       public void onComplete(@NonNull Task<AuthResult> task) {
           if(task.isSuccessful()){

           nRegProgress.dismiss();
          Intent mainIntent = new Intent(RegisterActivitytest.this, MainActivity.class);
           startActivity(mainIntent);
          finish();
         }
         else{
               nRegProgress.hide();
         Toast.makeText(RegisterActivitytest.this, "Cannot sign in. Please check the form and try again." , Toast.LENGTH_LONG).show();
             }
        }
      });
    }
}
