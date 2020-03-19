package com.doctarhyf.cvd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.VideoView;

public class ActivityTut extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tut);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        VideoView videoview = (VideoView) findViewById(R.id.videoview);

        Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.covid_tut);

        videoview.setVideoURI(uri);
        videoview.start();
    }

    public void skipTut(View view) {
        Intent intent = new Intent(ActivityTut.this, MainActivity.class);
        startActivity(intent);
    }
}
