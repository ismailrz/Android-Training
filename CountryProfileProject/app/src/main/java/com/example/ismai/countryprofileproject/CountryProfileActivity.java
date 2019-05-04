package com.example.ismai.countryprofileproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class CountryProfileActivity extends AppCompatActivity {

    private TextView textView;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country_profile);

        imageView = findViewById(R.id.imageViewId);

        textView = findViewById(R.id.textViewId);

        Bundle bundle = getIntent().getExtras();

        if(bundle != null){

            String CountryName = bundle.getString("name");
            ShowDetails(CountryName);
        }


    }

    void  ShowDetails(String CountryName){

        if(CountryName.equals( "Bangladesh")){

            imageView.setImageResource(R.drawable.parliamentofbangladesh);

            textView.setText(R.string.bangladesh_details);
        }
        if(CountryName.equals( "India")){

            imageView.setImageResource(R.drawable.victoriaofindia);

            textView.setText(R.string.indian_details);
        }
        if(CountryName.equals( "Pakistan")){

            imageView.setImageResource(R.drawable.islamabadofpakistan);

            textView.setText(R.string.pakistan_details);
        }



    }
}
