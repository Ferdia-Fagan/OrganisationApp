package com.example.planshare.ScheduleCode;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.planshare.R;

public class PopUp_ChooseScheduleTimeFrameType extends PopUp {

    // Constants
    Button BTN_DATATODATE;
    Button BTN_DAYTODAY;
    Button BTN_NUMBEROFDAYS;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.popup_choosetimeframetype);    // Set layout of the pop up

        this.SizePopUp(0.7, 0.5);   // Set the size of the pop up

        // Snyc button with objs
        BTN_DATATODATE = (Button) findViewById(R.id.btn_choose_date_to_date);
        BTN_DAYTODAY = (Button) findViewById(R.id.btn_choose_day_to_day);
        BTN_NUMBEROFDAYS = (Button) findViewById(R.id.btn_choose_numberofdays);
    }

    // Set up methods

    // Layout


    // END layout

    // Button actions

    public void ChooseTimeFrameType(View v){
        // Choose from the three options, return the value selected
        Button theButtonPressed = (Button) v;

        // if date to date
        if(theButtonPressed.equals(BTN_DATATODATE)){
            Intent data = new Intent();
            int buttonPressed_id = 0;
        }
        // if day to day
        else if(theButtonPressed.equals(BTN_DAYTODAY)){
            Intent data = new Intent();
            int buttonPressed_id = 1;
        }
        // if number of days
        else if(theButtonPressed.equals(BTN_NUMBEROFDAYS)){
            Intent data = new Intent();
            int buttonPressed_id = 2;
        }
    }


    // End Button actions



    // End set up methods


}
