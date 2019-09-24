package com.example.planshare.ScheduleCode;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.example.planshare.QuickDiaryView_Week;
import com.example.planshare.R;

import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;

public class PopUp_AddScheduleOrFolder extends PopUp {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.popup_addscheduleorfolder);    // Set layout of the pop up

        this.SizePopUp(0.7, 0.5);   // Set the size of the pop up
        SetUpButtonHandlers();
    }

    // Set up methods

    // Layout


    // END layout

    public void SetUpButtonHandlers(){

        ((Button)findViewById(R.id.option_folder)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                CreateFolderButtonPressed();
            }
        });

        ((Button)findViewById(R.id.option_schedule)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                CreateScheduleButtonPressed();
            }
        });
    }


    private void CreateScheduleButtonPressed(){
        // Open the create a schedule activity.
        // User can then create the schedule. It will be assumed that it is createing the schedule in the parent folder the user was currently exploring    (can change)
        Intent i = new Intent(getApplicationContext(), Schedule_MakeANewSchedule.class);
        startActivity(i);
    }

    private void CreateFolderButtonPressed(){
        // This should call another pop up window that allows the user to create the new folder within the current folder being explored,
        // or can change parent folder

        //Intent i = new Intent(getApplicationContext(), QuickDiaryView_Week.class);
        //startActivity(i);
    }
}
