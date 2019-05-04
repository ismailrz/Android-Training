package com.example.al_amin.event;

import android.Manifest;
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
import android.widget.ImageView;
import android.widget.TextView;

public class DeatailsActivity extends AppCompatActivity {
private ImageView imageView;
private TextView textView;
private Button callButton,smsButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_deatails );

        imageView=(ImageView)findViewById( R.id.detailImageId );
        textView=(TextView)findViewById( R.id.detaiTextId );
        callButton=(Button)findViewById( R.id.callButtonId );
        smsButton=(Button)findViewById( R.id.smsButtonId );

        getSupportActionBar().setDisplayHomeAsUpEnabled( true );
        getSupportActionBar().setDisplayShowHomeEnabled( true );

        final Bundle bundl=getIntent().getExtras();
        callButton.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number=bundl.getString( "number" );
                Intent intent = new Intent( Intent.ACTION_DIAL, Uri.fromParts("tel", number, null) );
                startActivity( intent );
                if(ActivityCompat.checkSelfPermission( DeatailsActivity.this, Manifest.permission.CALL_PHONE ) != PackageManager.PERMISSION_GRANTED){
                    return;
                }
                startActivity( intent );
            }
        } );

        smsButton.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number=bundl.getString( "number" );
                Intent intent = new Intent( Intent.ACTION_VIEW );
                intent.putExtra( "number2", number );
                startActivity( intent );
                intent.setType( "vnd.android-dir/mms-sms" );
                startActivity( intent );
            }
        } );

        Bundle bundle=getIntent().getExtras();
        if(bundle!=null){
            String value=bundle.getString( "name" );
            if(value.equals( "alamin" )){
                imageView.setImageResource( R.drawable.alamin );
                textView.setText( R.string.alamin );
            }
            if(value.equals( "alamin2" )){
                imageView.setImageResource( R.drawable.alamin2 );
                textView.setText( R.string.alamin2 );
            }
            if(value.equals( "ismail" )){
                imageView.setImageResource( R.drawable.ismail );
                textView.setText( R.string.ismail );
            }
            if(value.equals( "mamun" )){
                imageView.setImageResource( R.drawable.mamun );
                textView.setText( R.string.mamun );
            }
            if(value.equals( "mukut" )){
                imageView.setImageResource( R.drawable.mukut );
                textView.setText( R.string.mukut );
            }
            if(value.equals( "saddam" )){
                imageView.setImageResource( R.drawable.saddam );
                textView.setText( R.string.saddam );
            }
            if(value.equals( "shama" )){
                imageView.setImageResource( R.drawable.shaama );
                textView.setText( R.string.shama );
            }
            if(value.equals( "shuvo" )){
                imageView.setImageResource( R.drawable.shuvo );
                textView.setText( R.string.shovo );
            }
            if(value.equals( "sourav" )){
                imageView.setImageResource( R.drawable.sourav2 );
                textView.setText( R.string.sourav );
            }

            if(value.equals( "zunnun" )){
                imageView.setImageResource( R.drawable.zunnun );
                textView.setText( R.string.zunnun );
            }
            if(value.equals( "riad" )){
                imageView.setImageResource( R.drawable.riad2 );
                textView.setText( R.string.riad );
            }

            if(value.equals( "hasan2" )){
                imageView.setImageResource( R.drawable.hasan2 );
                textView.setText( R.string.hasan2 );
            }
            if(value.equals( "noyon" )){
                imageView.setImageResource( R.drawable.noyon );
                textView.setText( R.string.noyon );
            }
            if(value.equals( "noman" )){
                imageView.setImageResource( R.drawable.noman );
                textView.setText( R.string.noman );
            }
            if(value.equals( "shohag" )){
                imageView.setImageResource( R.drawable.sohag );
                textView.setText( R.string.shohag );
            }
            if(value.equals( "shahidul" )){
                imageView.setImageResource( R.drawable.shahidul );
                textView.setText( R.string.shahidul );
            }
            if(value.equals( "shaon" )){
                imageView.setImageResource( R.drawable.shaon );
                textView.setText( R.string.shaon );
            }
            if(value.equals( "shariful" )){
                imageView.setImageResource( R.drawable.shriful );
                textView.setText( R.string.shariful );
            }
            if(value.equals( "muminul" )){
                imageView.setImageResource( R.drawable.muminul );
                textView.setText( R.string.muminul );
            }
            if(value.equals( "nazmul" )){
                imageView.setImageResource( R.drawable.nazmul );
                textView.setText( R.string.nazmul );
            }

        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==android.R.id.home){
            this.finish();
        }
        return super.onOptionsItemSelected( item );
    }
}
