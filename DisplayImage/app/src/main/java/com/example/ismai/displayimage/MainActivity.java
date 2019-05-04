package com.example.ismai.displayimage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{


    private ImageView imageView1, imageView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView1 = findViewById(R.id.image1);

        imageView2 = findViewById(R.id.image2);

        imageView1.setOnClickListener(this);
         imageView2.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.image1) {
            Toast.makeText(MainActivity.this,"Cover photo", Toast.LENGTH_LONG).show();
        }
        if(v.getId() == R.id.image2) {
            Toast.makeText(MainActivity.this, "Birthday wish" ,Toast.LENGTH_LONG).show();
        }

    }
}
