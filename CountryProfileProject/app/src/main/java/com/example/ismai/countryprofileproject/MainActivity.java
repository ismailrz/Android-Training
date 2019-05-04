package com.example.ismai.countryprofileproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    private Button bangladeshButton,indiaButton,pakistanButton;

    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bangladeshButton = findViewById(R.id.bangladeshbuttonId);
        indiaButton = findViewById(R.id.indiabuttonId);

        pakistanButton = findViewById(R.id.pakistanbuttonId);

        bangladeshButton.setOnClickListener(this);
        indiaButton.setOnClickListener(this);
        pakistanButton.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.bangladeshbuttonId){


            intent = new Intent(MainActivity.this, CountryProfileActivity.class);
            intent.putExtra("name", "Bangladesh");
            startActivity(intent);
        }

         if(v.getId() == R.id.indiabuttonId){


             intent = new Intent(MainActivity.this, CountryProfileActivity.class);
             intent.putExtra("name", "India");
            startActivity(intent);
        }

         if(v.getId() == R.id.pakistanbuttonId){


             intent = new Intent(MainActivity.this, CountryProfileActivity.class);
             intent.putExtra("name", "Pakistan");
            startActivity(intent);
        }



    }
}
