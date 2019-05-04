package com.example.ismai.rzchat;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class RegisterActivity extends AppCompatActivity {

    private TextInputLayout nDisplayName;
    private TextInputLayout nEmail;
    private  TextInputLayout nPassword;
    private Button nCreatebtn;

    // firebase - auth
    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

       // firebase auth
        mAuth = FirebaseAuth.getInstance();


        //find id register
        nDisplayName = findViewById(R.id.reg_display_name);
        nEmail = findViewById(R.id.reg_email_id);
        nPassword = findViewById(R.id.reg_password_id);
        nCreatebtn = findViewById(R.id.reg_create_btn);

        String display_name = nDisplayName.getEditText().getText().toString();
        String email  = nEmail.getEditText().getText().toString();
        String password = nPassword.getEditText().getText().toString();

      register_user(display_name,email,password);

    }

    private void register_user(String display_name, String email, String password) {
      mAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener( new OnCompleteListener<AuthResult>() {
          @Override
         public void onComplete(@NonNull Task<AuthResult> task) {
              if(task.isSuccessful()){

                  Intent mainIntent = new Intent(RegisterActivity.this, MainActivity.class);
                  startActivity(mainIntent);
                  finish();
              }
              else{
                  Toast.makeText(RegisterActivity.this, "you got some error" , Toast.LENGTH_LONG).show();
              }
          }
      });
   }

}
