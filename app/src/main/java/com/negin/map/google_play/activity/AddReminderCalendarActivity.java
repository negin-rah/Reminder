package com.negin.map.google_play.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.borax12.materialdaterangepicker.date.DatePickerDialog;
import com.negin.map.google_play.R;

import java.util.Calendar;

/**
 * Created by morteza on 11/15/19.
 */

public class AddReminderCalendarActivity extends AppCompatActivity {


    private int type;
    private String title;

    ImageView imgBack;
    ImageView imgNext;
    TextView txtDescription;
    TextView txtDate;
    TextView txtTime;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_new_reminder_calender);

        setTypeAndTitle();

        findViews();

        initClicks();

    }

    private void initClicks() {
//        imgBack.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                finish();
//            }
//        });

        imgNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(AddReminderCalendarActivity.this, "Todo", Toast.LENGTH_SHORT).show();
            }
        });


        txtDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                selectDate();
            }
        });

        txtTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setTime();
            }
        });

    }

    private void setTime() {
        // TODO: 11/15/19  fill
    }

    private void selectDate() {
        Calendar now = Calendar.getInstance();
        DatePickerDialog.OnDateSetListener callBack = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePickerDialog view, int year, int monthOfYear, int dayOfMonth, int yearEnd, int monthOfYearEnd, int dayOfMonthEnd) {

            }
        };
        DatePickerDialog dpd = DatePickerDialog.newInstance(
                callBack,
                now.get(Calendar.YEAR),
                now.get(Calendar.MONTH),
                now.get(Calendar.DAY_OF_MONTH)
        );
        dpd.show(getFragmentManager(), "Datepickerdialog");

    }

    private void findViews() {
        txtDescription =        findViewById(R.id.txtDescription);
        txtDate =        findViewById(R.id.txtDate);
        txtTime =        findViewById(R.id.txtTime);
        imgBack =       findViewById(R.id.imgBack);
        imgNext =       findViewById(R.id.imgNext);

        txtDescription.setText(title);
    }


    private void setTypeAndTitle() {
        type = getIntent().getExtras().getInt("type");
        title = getIntent().getExtras().getString("title");
    }
}
