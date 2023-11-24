package com.mvaldiviezoutp.customcalenderviewwithevents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    CustomCalendarView customCalendarView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomCalendarView customCalendarView = (CustomCalendarView) findViewById(R.id.custom_calendar_view);
    }
}