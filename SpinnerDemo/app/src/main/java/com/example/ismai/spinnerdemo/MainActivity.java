package com.example.ismai.spinnerdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String[] countryName;
    Spinner spinner;
    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countryName = getResources().getStringArray(R.array.countryName);
        spinner = findViewById(R.id.spinnerId);
        button = findViewById(R.id.buttonId);
        textView = findViewById(R.id.textViewId);


        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,R.layout.simple_view,R.id.textsimpleViewId,countryName);
        spinner.setAdapter(arrayAdapter);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               String value =  spinner.getSelectedItem().toString();
                textView.setText(value);


            }
        });

    }
}
