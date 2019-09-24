package com.example.planshare.ScheduleCode;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.planshare.R;

public class SchedulesMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedules_main);
    }

    // BUTTON ACTIONS

    public void BackButtonPressed(View v){
        // Opens up schedules main finder/explorer
        super.onBackPressed();
        SchedulesMain.this.finish();
        System.out.println("hello");

    }

    public void AddButtonPressed(View v){
        // Opens up schedule pop up
        Intent i = new Intent(getApplicationContext(), PopUp_AddScheduleOrFolder.class);
        startActivity(i);
    }



    // END BUTTON ACTIONS

}
