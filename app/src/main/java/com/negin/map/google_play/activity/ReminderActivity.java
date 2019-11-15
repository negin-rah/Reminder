package com.negin.map.google_play.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.negin.map.google_play.R;
import com.negin.map.google_play.model.ReminderTypeOption;

/**
 * Created by morteza on 11/15/19.
 */

public class ReminderActivity extends AppCompatActivity {


    private int type;

    TextView txtTitle;

    ImageView imgAdd;

    ListView lstReminder;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_reminder);

        setType();

        findViews();

        initClick();


    }

    private void initClick() {

        imgAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ReminderActivity.this, AddReminderDescriptionActivity.class);
                intent.putExtra("type", type);
                startActivity(intent);
            }
        });
    }

    private void findViews() {
        txtTitle = findViewById(R.id.txtTitle);
        imgAdd = findViewById(R.id.imgAdd);
        lstReminder = findViewById(R.id.lst);

        txtTitle.setText(ReminderTypeOption.getById(type).getName());
    }

    private void setType() {
        type = getIntent().getExtras().getInt("type");
    }



}
