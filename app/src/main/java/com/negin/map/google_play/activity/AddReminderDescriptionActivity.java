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

import com.negin.map.google_play.R;

/**
 * Created by morteza on 11/15/19.
 */

public class AddReminderDescriptionActivity extends AppCompatActivity {


    private int type;

    ImageView imgBack;
    ImageView imgNext;
    EditText txtDescription;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_new_reminder);

        setType();

        findViews();

        initClicks();

    }

    private void initClicks() {
        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        imgNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String desc = txtDescription.getText().toString();

                if(desc.length() < 3){
                    Toast.makeText(AddReminderDescriptionActivity.this, "Please Fill Description.", Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent = new Intent(AddReminderDescriptionActivity.this, AddReminderCalendarActivity.class);
                    intent.putExtra("type", type);
                    intent.putExtra("title", desc);
                    startActivity(intent);
                }
            }
        });
    }

    private void findViews() {
        txtDescription =        findViewById(R.id.txtDescription);
        imgBack =       findViewById(R.id.imgBack);
        imgNext =       findViewById(R.id.imgNext);
    }


    private void setType() {
        type = getIntent().getExtras().getInt("type");
    }
}
