package com.example.android.sunshine.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forecast_detail);
//        getActionBar().setDisplayHomeAsUpEnabled(true);

        TextView mTextViewForecast = (TextView) findViewById(R.id.tvForecast);
        Intent intent = getIntent();
        if (intent != null) {
            mTextViewForecast.setText(intent.getStringExtra(Intent.EXTRA_TEXT));
        }
    }

}
