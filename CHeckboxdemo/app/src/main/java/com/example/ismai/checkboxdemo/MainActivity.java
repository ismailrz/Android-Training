package com.example.ismai.checkboxdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private  CheckBox checkBox1, checkBox2,checkBox3, checkBox4;
    private  Button button;
    private  TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBox1 = findViewById(R.id.checkbox1);
        checkBox2 = findViewById(R.id.checkbox2);
        checkBox3 = findViewById(R.id.checkbox3);
        checkBox4 = findViewById(R.id.checkbox4);

        button = findViewById(R.id.buttonId);

        textView = findViewById(R.id.textId);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder stringBuilder = new StringBuilder();

                if(checkBox1.isChecked()){
                    String string = checkBox1.getText().toString();
                    stringBuilder.append(string +" is ordered \n");
                }
                if(checkBox2.isChecked()){
                    String string = checkBox2.getText().toString();
                    stringBuilder.append(string +" is ordered \n");
                }
                if(checkBox3.isChecked()){
                    String string = checkBox3.getText().toString();
                    stringBuilder.append(string +" is ordered \n");
                }
                if(checkBox4.isChecked()){
                    String string = checkBox4.getText().toString();
                    stringBuilder.append(string +" is ordered \n");
                }
                textView.setText(stringBuilder);
            }
        });

    }
}
