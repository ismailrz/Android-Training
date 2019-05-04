package com.example.ismai.rzchat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    private EditText nEmail;
    private  EditText nPassword;
    private Button nLoginbtn;

    //toolbar
    private Toolbar mToolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        nEmail = findViewById(R.id.reg_email_id);
        nPassword = findViewById(R.id.reg_password_id);
        nLoginbtn = findViewById(R.id.reg_create_btn);
    }
}
