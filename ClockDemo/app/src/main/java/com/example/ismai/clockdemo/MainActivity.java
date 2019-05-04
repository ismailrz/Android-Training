package com.example.ismai.clockdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AnalogClock;
import android.widget.DigitalClock;
import android.widget.TextClock;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private AnalogClock analogClock;
    private TextClock textClock;
    private DigitalClock digitalClock;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        analogClock = findViewById(R.id.analogclockId);
        textClock = findViewById(R.id.textclockId);
        digitalClock = findViewById(R.id.digitalclockId);

        analogClock.setOnClickListener(this);
        digitalClock.setOnClickListener(this);
        textClock.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.analogclockId){

            Toast.makeText(MainActivity.this, "This is anlaog clock",Toast.LENGTH_SHORT).show();
        }
        else if(v.getId() == R.id.textclockId){

            Toast.makeText(MainActivity.this, "This is Textclock clock",Toast.LENGTH_SHORT).show();
        }
        else if(v.getId() == R.id.digitalclockId){

            Toast.makeText(MainActivity.this, "This is digital  clock",Toast.LENGTH_SHORT).show();
        }

    }
}
