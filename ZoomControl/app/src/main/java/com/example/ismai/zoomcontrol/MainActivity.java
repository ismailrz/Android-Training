package com.example.ismai.zoomcontrol;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ZoomControls;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private ZoomControls zoomControls;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageViewId);
        zoomControls = findViewById(R.id.zoomControlId);

        zoomControls.setOnZoomInClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "Zoom In", Toast.LENGTH_SHORT).show();

                float x = imageView.getScaleX();
                float y = imageView.getScaleY();

                imageView.setScaleX((float) x+1);
                imageView.setScaleY((float) y+1);
            }
        });

        zoomControls.setOnZoomOutClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "Zoom Out", Toast.LENGTH_SHORT).show();

                float x = imageView.getScaleX();
                float y = imageView.getScaleY();

                if(x>1 && y>1){
                    imageView.setScaleX((float) x-1);
                    imageView.setScaleY((float) y-1);
                }
            }
        });

    }
}
