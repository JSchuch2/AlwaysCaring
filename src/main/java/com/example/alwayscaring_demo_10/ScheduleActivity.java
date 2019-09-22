package com.example.alwayscaring_demo_10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ScheduleActivity extends AppCompatActivity {
    TextView mtextViewTime;
    Button mButtoncheckin,mButtoncheckin2,mButtoncheckin3;
    Button mButtonlogout;


    TextView mtextViewButton;

    Date time= Calendar.getInstance().getTime();
    DateFormat df= new SimpleDateFormat("h:mm a");
    final String currentTime= df.format(time.getTime());
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);
        mtextViewTime= (TextView) findViewById(R.id.textview_time);
        mButtoncheckin= (Button) findViewById(R.id.button_checkin);
        mButtoncheckin2= (Button) findViewById(R.id.button_checkin2);
        mButtoncheckin3= (Button) findViewById(R.id.button_checkin3);
        mButtonlogout= (Button) findViewById(R.id.button_logout);
        mButtoncheckin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent taskPage= new Intent(ScheduleActivity.this, TaskActivity.class);
                startActivity(taskPage);

            }
        });
        mButtoncheckin2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent taskPage= new Intent(ScheduleActivity.this, FrankActivity.class);
                startActivity(taskPage);

            }
        });
        mButtoncheckin3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent taskPage= new Intent(ScheduleActivity.this, StanLeeActivity.class);
                startActivity(taskPage);

            }
        });

        mButtonlogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homepage= new Intent(ScheduleActivity.this,MainActivity.class);
                startActivity(homepage);
            }
        });



    }
}
