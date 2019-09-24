package com.example.planshare.ScheduleCode;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.example.planshare.R;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PopUp_ChooseScheduleTimeFrame_Days extends PopUp {

    EditText UserData_StartDay;
    EditText UserData_EndDay;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.popup_choosetimeframe_dates);    // Set layout of the pop up

        this.SizePopUp(0.7, 0.5);   // Set the size of the pop up

        // sync start date and end date editText objs
        UserData_StartDay = (EditText) findViewById(R.id.chosen_StartDay);
        UserData_EndDay = (EditText) findViewById(R.id.chosen_EndDay);

    }

    // Set up methods

    // Layout


    // END layout

    // Button actions

    public void SelectTimeFrame_DayToDay(View v){
        // Check that two dates have been given
        String startDay = GetStartDay();
        String endDay = GetEndDay();

        if(startDay == null || endDay == null){
            // Dates are not valid
            Log.d("UserData_notGiven", "start and/or end date not given properly");
        }

        else{
            // Dates are given
            // check if are acceptable (later... for now no exceptions needed)

            Intent data = new Intent();
            data.putExtra("start_day", startDay);
            data.putExtra("end_day", endDay);

            setResult(RESULT_OK,data);
            finish();
        }



    }


    // End Button actions


    // End set up methods

    private String GetStartDay(){
        String startDay = UserData_StartDay.getText().toString();
        return GetDay(startDay);
    }

    private String GetEndDay(){
        String endDay = UserData_EndDay.getText().toString();
        return GetDay(endDay);
    }

    private String GetDay(String theDay){
        // Gets the day, or returns null if isnt entered properly
        return null;
    }





    //  END OF METHODS
}
