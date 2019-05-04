package com.example.ismai.fontdemo;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView1,textView2;
    private Typeface typeface1,typeface2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView1 = findViewById(R.id.textView1Id);
        textView2 = findViewById(R.id.textView2Id);

        typeface1 = Typeface.createFromAsset(getAssets(),"font/melinda.ttf");
        textView1.setTypeface(typeface1);

        typeface2 = Typeface.createFromAsset(getAssets(),"font/melinda.otf");
        textView2.setTypeface(typeface2);


    }
}
