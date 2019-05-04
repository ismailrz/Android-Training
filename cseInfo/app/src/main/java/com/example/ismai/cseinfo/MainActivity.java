package com.example.ismai.cseinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {
    private GridView gridView;
    int[] photo={R.drawable.alamin,R.drawable.alamin2,R.drawable.ismail,R.drawable.mamun,R.drawable.mukut,R.drawable.saddam,
            R.drawable.shaama,R.drawable.shuvo,R.drawable.sourav2,R.drawable.toufiq2,R.drawable.zunnun,R.drawable.riad2,
            R.drawable.hasan3,R.drawable.hasan2,R.drawable.noyon,R.drawable.noman,R.drawable.sohag,R.drawable.shahidul,
            R.drawable.shaon,R.drawable.shriful,R.drawable.muminul,R.drawable.nazmul,R.drawable.omar,R.drawable.mohim2};
    String[] namelist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView=(GridView)findViewById( R.id.gridViewId );
        //getSupportActionBar().hide();

        namelist=getResources().getStringArray( R.array.name );
        final CustomAdapter adapter=new CustomAdapter(this,photo,namelist);
        gridView.setAdapter( adapter );

    }
}
