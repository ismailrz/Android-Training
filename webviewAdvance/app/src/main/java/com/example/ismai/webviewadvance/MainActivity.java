package com.example.ismai.webviewadvance;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

     private WebView webView;

     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = findViewById(R.id.webViewId);

        WebSettings webSettings = webView.getSettings();

        webSettings.setJavaScriptEnabled(true);

        webView.setWebViewClient(new WebViewClient());

       webView.loadUrl("http://www.hstu.ac.bd/");


        //webView.loadUrl("http://bdtutors.com/");

        //webView.loadUrl("http://localhost/design-bot/");


     }

    @Override
    public void onBackPressed() {
        if(webView.canGoBack()){
            webView.canGoBack();

        }

        else{
            super.onBackPressed();
        }
    }
}
