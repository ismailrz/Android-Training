package com.example.ismai.gridviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private GridView gridView;
    private  String[] countryName;

    private  int[] flags = {R.drawable.afghanistan, R.drawable.armenia, R.drawable.azerbaijan,R.drawable.bahrain,
            R.drawable.bangladesh, R.drawable.bhutan,R.drawable.brunei, R.drawable.cambodia,R.drawable.china};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView = findViewById(R.id.gridViewId);

        countryName = getResources().getStringArray(R.array.countryName);

       CustomAdapter adapter = new CustomAdapter(this,flags,countryName);

         gridView.setAdapter(adapter);

         gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
             @Override
             public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                 String value = countryName[position];

                 Toast.makeText(MainActivity.this,value,Toast.LENGTH_SHORT).show();
             }
         });

    }
}
