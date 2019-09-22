package com.example.alwayscaring_demo_10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class FrankActivity extends AppCompatActivity {
    CheckBox task1,task2,task3;
    Button mButtoncheckin2;
    Button buttonSchedule;
    TextView mTextViewTask1,mTextViewTask2,mTextViewTask3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frank);
        task1= (CheckBox) findViewById(R.id.task_1);
        task2= (CheckBox) findViewById(R.id.task_2);
        task3= (CheckBox) findViewById(R.id.task_3);
        buttonSchedule= (Button) findViewById(R.id.button_schedule);
        mTextViewTask1= (TextView) findViewById(R.id.textview_task1);
        mTextViewTask2= (TextView) findViewById(R.id.textview_task2);
        mTextViewTask3= (TextView) findViewById(R.id.textview_task3);
        buttonSchedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent returnpg= new Intent(FrankActivity.this,ScheduleActivity.class);
                startActivity(returnpg);
            }
        });

    }
    public void onCheckboxClicked(View view) {
        Date time= Calendar.getInstance().getTime();
        DateFormat df= new SimpleDateFormat("h:mm a");
        final String currentTime= df.format(time.getTime());
        Calendar calendar= Calendar.getInstance();
        String currentDate= DateFormat.getDateInstance().format(calendar.getTime());
        boolean checked = ((CheckBox) view).isChecked();
        if(checked = true) {
            // Check which checkbox was clicked
            switch (view.getId()) {
                case R.id.task_1:
                    mTextViewTask1.setText(currentDate + ": Task 1 was completed @ " + currentTime);
                    task1.setEnabled(false);
                    break;
                case R.id.task_2:
                    mTextViewTask2.setText(currentDate + ": Task 2 was completed @ " + currentTime);
                    task2.setEnabled(false);
                    break;
                case R.id.task_3:
                    mTextViewTask3.setText(currentDate + ": Task 3 was completed @ " + currentTime);
                    task3.setEnabled(false);
                    break;

            }
        }
    }
}
