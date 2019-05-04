package com.example.ismai.timepickerdialog;

import android.app.TimePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


        private TextView textView;
        private Button button;
        private TimePickerDialog timePickerDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textViewId);
        button = findViewById(R.id.buttonId);

        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
            TimePicker timePicker = new TimePicker(this);


            int currentHour = timePicker.getCurrentHour();
          int currentMinute = timePicker.getCurrentMinute();

        timePickerDialog = new TimePickerDialog(this,

                new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        textView.setText(hourOfDay +":"+minute);
                    }
                },currentHour, currentMinute,true);

            timePickerDialog.show();

    }
}