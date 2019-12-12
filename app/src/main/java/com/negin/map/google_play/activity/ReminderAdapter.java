package com.negin.map.google_play.activity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.negin.map.google_play.R;

import java.util.List;

public class ReminderAdapter<resource, context, row> extends ArrayAdapter<ReminderModel> {

    final List<ReminderModel> row;


    public ReminderAdapter(Context context, int resource, List<ReminderModel> row) {
        super(context, resource, row);
        this.row = row;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {

            LayoutInflater inf = LayoutInflater.from(getContext());
            convertView = inf.inflate(R.layout.activity_lst, null, false);

        }
        LinearLayout layRoot = convertView.findViewById(R.id.layRoot);
        TextView txtDate = convertView.findViewById(R.id.txtDate);
        TextView txtTime = convertView.findViewById(R.id.txtTime);
        TextView txtDescription = convertView.findViewById(R.id.txtDescription);


        ReminderModel reminder = row.get(position);
        txtDate.setText(reminder.fDate + " " + reminder.fDate);
        txtTime.setText(reminder.fTime + " " + reminder.fTime);
        txtDescription.setText(reminder.fDescription + " " + reminder.fDescription);
        ImageView imgAttention = null;
        imgAttention.setImageResource(reminder.attention);


    }


    }
