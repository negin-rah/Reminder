package com.negin.map.google_play.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

import com.negin.map.google_play.R;
import com.negin.map.google_play.model.ReminderTypeOption;

public class MainActivity extends AppCompatActivity {


    ViewGroup layWork;
    ViewGroup layPriority;
    ViewGroup layUniversity;
    ViewGroup layCelebration;
    ViewGroup LayShopping;
    ViewGroup layPersonal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        findViews();

        initClick();

        //negin

    }

    private void initClick() {
        layWork.setOnClickListener(OnClickById(ReminderTypeOption.Work.getId()));
        layPriority.setOnClickListener(OnClickById(ReminderTypeOption.Priority.getId()));
        layUniversity.setOnClickListener(OnClickById(ReminderTypeOption.University.getId()));
        layCelebration.setOnClickListener(OnClickById(ReminderTypeOption.Celebration.getId()));
        LayShopping.setOnClickListener(OnClickById(ReminderTypeOption.Shopping.getId()));
        layPersonal.setOnClickListener(OnClickById(ReminderTypeOption.Personal.getId()));
    }

    private View.OnClickListener OnClickById(final int id) {
        return new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ReminderActivity.class);
                intent.putExtra("type", id);
                startActivity(intent);
            }
        };

    }

    private void findViews() {
        layWork         = findViewById(R.id.layWork);
        layPriority     = findViewById(R.id.layPriority);
        layUniversity   = findViewById(R.id.layUniversity);
        layCelebration  = findViewById(R.id.layCelebration);
        LayShopping     = findViewById(R.id.LayShopping);
        layPersonal     = findViewById(R.id.layPersonal);
    }
}
