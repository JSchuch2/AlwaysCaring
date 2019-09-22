package com.example.alwayscaring_demo_10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button mButtonNurse;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButtonNurse= (Button) findViewById(R.id.button_nurse);
        mButtonNurse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent SchedulePage= new Intent(MainActivity.this,ScheduleActivity.class);
                startActivity(SchedulePage);
            }
        });





    }
}
