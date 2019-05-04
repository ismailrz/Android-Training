package com.example.ismai.feedbackdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Feedback_Activity extends AppCompatActivity  implements View.OnClickListener {

    private Button sendButton, clearButton;
    private EditText name, email, feedback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback_);

        sendButton = findViewById(R.id.sendBattonId);
        clearButton = findViewById(R.id.clearBattonId);

        name = findViewById(R.id.nameId);
        email = findViewById(R.id.emailId);
        feedback = findViewById(R.id.feedbackId);

        sendButton.setOnClickListener(this);
        clearButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

       // String nameString = name.getText().toString();
       // String emailString = email.getText().toString();
       // String feedbackString = feedback.getText().toString();


        try {
            if(view.getId() == R.id.sendBattonId){

               //Intent intent = new Intent(Intent.ACTION_SEND);
               // intent.setType("text/email");

               // intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"ismailcse14@gmail.com","alamincse039@gmail.com"});

              //  intent.putExtra(Intent.EXTRA_SUBJECT, "Feedback from App");
              //  intent.putExtra(Intent.EXTRA_TEXT, "name : " + nameString + "\n sendEmail : " + emailString + "\n Message : "+feedbackString );

               // startActivity(Intent.createChooser(intent,"Feedback with "));

                Toast.makeText(getApplicationContext(),"share is clicked",Toast.LENGTH_SHORT).show();




            }

            else  if(view.getId() == R.id.sendBattonId){
                name.setText("");
                email.setText("");
                feedback.setText("");

            }

        }
        catch (Exception e){

            Toast.makeText(getApplicationContext(), "Exception : "+e , Toast.LENGTH_SHORT).show();

        }
    }
}
