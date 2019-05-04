package com.example.ismai.customadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private  String[] countryName;

    private  int[] flags = {R.drawable.afghanistan, R.drawable.armenia, R.drawable.azerbaijan,R.drawable.bahrain,
                            R.drawable.bangladesh, R.drawable.bhutan,R.drawable.brunei, R.drawable.cambodia,R.drawable.china};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       countryName = getResources().getStringArray(R.array.countryName);

       CustomAdapter adapter = new  CustomAdapter(this, countryName,flags);

        listView.setAdapter(adapter);
    }
}
