package com.example.ismai.audioplay;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    MediaPlayer player;


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public  void play(View v){
        if(player == null){
            player = MediaPlayer.create(this, R.raw.islamic);
            player.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    stopPlayer();
                }
            });
        }
        player.start();

    }

    public  void pause(View v){
        if(player != null ){
            player.pause();
        }
    }
    public  void stop(View v){
        stopPlayer();
    }

    public void stopPlayer(){
        if(player != null){
            player.release();
            player = null;
            Toast.makeText(this, "Media Player Stop", Toast.LENGTH_SHORT).show();
        }

    }

    protected void onStop(){
        super.onStop();
        stopPlayer();
    }
}