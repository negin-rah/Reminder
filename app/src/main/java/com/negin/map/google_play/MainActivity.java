package com.negin.map.google_play;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {


    private LinearLayout mLayPersonal;
    private LinearLayout mLayWork;
    private LinearLayout mLaySecret;
    private LinearLayout mLayUniversity;
    private LinearLayout mLayCelebration;
    private LinearLayout mLayShopping;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();


        mLayPersonal.setOnClickListener(new View.OnClickListener(){

        Intent personal = new Intent(MainActivity.this,CalenderActivity.class);

            @Override
            public void onClick(View v) {

            }
        });



        mLayWork.setOnClickListener(new View.OnClickListener(){

            Intent work = new Intent(MainActivity.this,CalenderActivity.class);

            @Override
            public void onClick(View v) {
                startActivity(work);

            }
        });


        mLaySecret.setOnClickListener(new View.OnClickListener(){

            Intent secret = new Intent(MainActivity.this,CalenderActivity.class);

            @Override
            public void onClick(View v) {

            }
        });
        mLayUniversity.setOnClickListener(new View.OnClickListener(){

            Intent university = new Intent(MainActivity.this,CalenderActivity.class);

            @Override
            public void onClick(View v) {

            }
        });

        mLayCelebration.setOnClickListener(new View.OnClickListener(){

            Intent celebration = new Intent(MainActivity.this,CalenderActivity.class);

            @Override
            public void onClick(View v) {

            }
        });

        mLayShopping.setOnClickListener(new View.OnClickListener(){

            Intent shopping = new Intent(MainActivity.this,CalenderActivity.class);

            @Override
            public void onClick(View v) {

            }
        });







    }

    private void initView() {
        mLayPersonal = (LinearLayout) findViewById(R.id.layPersonal);
        mLayWork = (LinearLayout) findViewById(R.id.layWork);
        mLaySecret = (LinearLayout) findViewById(R.id.laySecret);
        mLayUniversity = (LinearLayout) findViewById(R.id.layUniversity);
        mLayCelebration = (LinearLayout) findViewById(R.id.layCelebration);
        mLayShopping = (LinearLayout) findViewById(R.id.LayShopping);
    }
}
