package com.example.android.sunshine;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private static final String FORECAST_SHARE_HASHTAG = " #SunshineApp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // TODO (2) Display the weather forecast that was passed from MainActivity
        TextView tvWeather = (TextView) findViewById(R.id.tv_weather);
        Bundle extras = getIntent().getExtras();
        if (extras.containsKey(Intent.EXTRA_TEXT)) {
            tvWeather.setText(extras.getString(Intent.EXTRA_TEXT));
        }
    }
}