package com.example.al_amin.event;

import android.Manifest;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Filter;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
   private int[] photo={R.drawable.alamin,R.drawable.alamin2,R.drawable.ismail,R.drawable.mamun,R.drawable.mukut,R.drawable.saddam,
          R.drawable.shaama,R.drawable.shuvo,R.drawable.sourav2,R.drawable.zunnun,R.drawable.riad2, R.drawable.hasan2,R.drawable.noyon,R.drawable.noman,R.drawable.sohag,R.drawable.shahidul,
         R.drawable.shaon,R.drawable.shriful,R.drawable.muminul,R.drawable.nazmul};

    private String[] namelist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        listView=findViewById( R.id.listViewId );
        //getSupportActionBar().hide();

        namelist=getResources().getStringArray(R.array.name);
        final CustomAdapter adapter=new CustomAdapter(this,photo,namelist);
        listView.setAdapter( adapter );


        listView.setOnItemClickListener( new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String value=namelist[position];
               if(position==0){
                   Intent intent=new Intent( MainActivity.this,DeatailsActivity.class );
                   intent.putExtra( "name","alamin" );
                   intent.putExtra( "number","01738088967" );
                   startActivity( intent );
               }
               else if(position==1){
                   Intent intent=new Intent( MainActivity.this,DeatailsActivity.class );
                   intent.putExtra( "name","alamin2" );
                   intent.putExtra( "number","01750829289" );
                   startActivity( intent );
               }
               else if(position==2){
                   Intent intent=new Intent( MainActivity.this,DeatailsActivity.class );
                   intent.putExtra( "name","ismail" );
                   intent.putExtra( "number","01743557172" );
                   startActivity( intent );
               }
               else if(position==3){
                   Intent intent=new Intent( MainActivity.this,DeatailsActivity.class );
                   intent.putExtra( "name","mamun" );
                   intent.putExtra( "number","01755339741" );
                   startActivity( intent );
               }
               else if(position==4){
                   Intent intent=new Intent( MainActivity.this,DeatailsActivity.class );
                   intent.putExtra( "name","mukut" );
                   intent.putExtra( "number","01786044933" );
                   startActivity( intent );
               }
               else if(position==5){
                   Intent intent=new Intent( MainActivity.this,DeatailsActivity.class );
                   intent.putExtra( "name","saddam" );
                   intent.putExtra( "number","01723706098" );
                   startActivity( intent );
               }
               else if(position==6){
                   Intent intent=new Intent( MainActivity.this,DeatailsActivity.class );
                   intent.putExtra( "name","shama" );
                   intent.putExtra( "number","01753027187" );
                   startActivity( intent );
               }
               else if(position==7){
                   Intent intent=new Intent( MainActivity.this,DeatailsActivity.class );
                   intent.putExtra( "name","shuvo" );
                   intent.putExtra( "number","01774415361" );
                   startActivity( intent );
               }
               else if(position==8){
                   Intent intent=new Intent( MainActivity.this,DeatailsActivity.class );
                   intent.putExtra( "name","sourav" );
                   intent.putExtra( "number","01740428659" );
                   startActivity( intent );
               }
               else if(position==9){
                   Intent intent=new Intent( MainActivity.this,DeatailsActivity.class );
                   intent.putExtra( "name","toufiq" );
                   intent.putExtra( "number","01521470348" );
                   startActivity( intent );
               }
               else if(position==10){
                   Intent intent=new Intent( MainActivity.this,DeatailsActivity.class );
                   intent.putExtra( "name","zunnun" );
                   intent.putExtra( "number","01765123122" );
                   startActivity( intent );
               }
               else if(position==11){
                   Intent intent=new Intent( MainActivity.this,DeatailsActivity.class );
                   intent.putExtra( "name","riad" );
                   intent.putExtra( "number","01849766406" );
                   startActivity( intent );
               }
               else if(position==12){
                   Intent intent=new Intent( MainActivity.this,DeatailsActivity.class );
                   intent.putExtra( "name","hasan3" );
                   intent.putExtra( "number","01742835323" );
                   startActivity( intent );
               }
               else if(position==13){
                   Intent intent=new Intent( MainActivity.this,DeatailsActivity.class );
                   intent.putExtra( "name","hasan2" );
                   intent.putExtra( "number","01760697423" );
                   startActivity( intent );
               }
               else if(position==14){
                   Intent intent=new Intent( MainActivity.this,DeatailsActivity.class );
                   intent.putExtra( "name","noyon" );
                   intent.putExtra( "number","01761376058" );
                   startActivity( intent );
               }
               else if(position==15){
                   Intent intent=new Intent( MainActivity.this,DeatailsActivity.class );
                   intent.putExtra( "name","noman" );
                   intent.putExtra( "number","01738148344" );
                   startActivity( intent );
               }
               else if(position==16){
                   Intent intent=new Intent( MainActivity.this,DeatailsActivity.class );
                   intent.putExtra( "name","shohag" );
                   intent.putExtra( "number","01740153311" );
                   startActivity( intent );
               }
               else if(position==17){
                   Intent intent=new Intent( MainActivity.this,DeatailsActivity.class );
                   intent.putExtra( "name","shahidul" );
                   intent.putExtra( "number","01765123122" );
                   startActivity( intent );
               }
               else if(position==18){
                   Intent intent=new Intent( MainActivity.this,DeatailsActivity.class );
                   intent.putExtra( "name","shaon" );
                   intent.putExtra( "number","01521470348" );
                   startActivity( intent );
               }
               else if(position==19){
                   Intent intent=new Intent( MainActivity.this,DeatailsActivity.class );
                   intent.putExtra( "name","shariful" );
                   intent.putExtra( "number","01780510023" );
                   startActivity( intent );
               }
               else if(position==20){
                   Intent intent=new Intent( MainActivity.this,DeatailsActivity.class );
                   intent.putExtra( "name","muminul" );
                   intent.putExtra( "number","01515256993" );
                   startActivity( intent );
               }
               else if(position==21){
                   Intent intent=new Intent( MainActivity.this,DeatailsActivity.class );
                   intent.putExtra( "name","nazmul" );
                   intent.putExtra( "number","01736586106" );
                   startActivity( intent );
               }
               else if(position==22){
                   Intent intent=new Intent( MainActivity.this,DeatailsActivity.class );
                   intent.putExtra( "name","omar" );
                   intent.putExtra( "number","01748705950" );
                   startActivity( intent );
               }
               else if(position==23){
                   Intent intent=new Intent( MainActivity.this,DeatailsActivity.class );
                   intent.putExtra( "name","muhim" );
                   intent.putExtra( "number","01754686599" );
                   startActivity( intent );
               }

            }
        } );

    }


    @Override
    public void onBackPressed() {
        AlertDialog.Builder alertDialog=new AlertDialog.Builder( MainActivity.this );
        alertDialog.setTitle( R.string.title );
        alertDialog.setMessage( R.string.AlertMessage );
        alertDialog.setCancelable( false );
        alertDialog.setPositiveButton( "Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        } );
        alertDialog.setNegativeButton( "No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        } );
        AlertDialog alert=alertDialog.create();
        alert.show();

    }
}
