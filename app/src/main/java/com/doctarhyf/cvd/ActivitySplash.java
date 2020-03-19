package com.doctarhyf.cvd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.VideoView;

public class ActivitySplash extends AppCompatActivity {

    private static final long TIME_OUT = 3 * 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(ActivitySplash.this, ActivityTut.class);
                startActivity(i);
                finish();
            }
        }, TIME_OUT);
    }
}
