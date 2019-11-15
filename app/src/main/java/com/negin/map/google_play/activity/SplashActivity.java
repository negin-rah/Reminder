package com.negin.map.google_play.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.negin.map.google_play.R;

/**
 * Created by morteza on 11/15/19.
 */

public class SplashActivity extends AppCompatActivity {

    private static final long SPLASH_TIME = 2_500;

    Runnable runnable ;

    private boolean flag = false;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash);

        runnable = new Runnable() {
            @Override
            public void run() {
                if(flag) {
                    startActivity(new Intent(SplashActivity.this, MainActivity.class));
                }
            }
        };

        flag = true;

        new Handler().postDelayed(runnable, SPLASH_TIME);

    }

    @Override
    protected void onPause() {
        super.onPause();
        flag = false;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        flag = false;
    }
}
