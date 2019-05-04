package com.example.ismai.slachscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ProgressBar;

public class slash_screan extends AppCompatActivity {
    int progress;
    private ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_slash_screan);

        progressBar = findViewById(R.id.progressId);
        final Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                doWork();

                startApp();
            }


        });
        thread.start();


    }
    public void doWork() {
        for(progress=10; progress<=100;progress+=10){

            try {
                Thread.sleep(1000);
                progressBar.setProgress(progress);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public  void startApp(){
        Intent intent = new Intent(slash_screan.this, MainActivity.class);
        startActivity(intent);
        finish();

    }
}
