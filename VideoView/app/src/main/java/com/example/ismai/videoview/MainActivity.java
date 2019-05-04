package com.example.ismai.videoview;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import java.net.URL;

public class MainActivity extends AppCompatActivity {

    private VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        videoView = findViewById(R.id.videoViewId);

       Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.videoviewtutorial);

       videoView.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);

        videoView.setMediaController(mediaController);

       videoView.start();


    }
}
