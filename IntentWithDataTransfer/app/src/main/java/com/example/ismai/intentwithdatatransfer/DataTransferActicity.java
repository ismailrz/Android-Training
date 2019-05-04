package com.example.ismai.intentwithdatatransfer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DataTransferActicity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_transfer_acticity);

        textView = findViewById(R.id.TextViewIdsecond);

        Bundle bundle = getIntent().getExtras();

        if(bundle != null){

            String string = bundle.getString("Message");

            textView.setText(string);

        }

    }
}
