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

public class PopUp_ChooseScheduleTimeFrame_DateToDate extends PopUp {

    EditText UserData_StartDate;
    EditText UserData_EndDate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.popup_choosetimeframe_dates);    // Set layout of the pop up

        this.SizePopUp(0.7, 0.5);   // Set the size of the pop up

        // sync start date and end date editText objs
        UserData_StartDate = (EditText) findViewById(R.id.chosen_StartDate);
        UserData_StartDate = (EditText) findViewById(R.id.chosen_EndDate);

    }

    // Set up methods

    // Layout


    // END layout

    // Button actions

    public void SelectTimeFrame_DateToDate(View v){
        // Check that two dates have been given
        Date startDate = GetStartDate();
        Date endDate = GetEndDate();

        if(startDate == null || endDate == null){
            // Dates are not valid
            Log.d("UserData_notGiven", "start and/or end date not given properly");
        }

        else{
            // Dates are given
            // check if are acceptable (later... for now no exceptions needed)

            Intent data = new Intent();
                data.putExtra("start_date", startDate);
                data.putExtra("end_date", endDate);

            setResult(RESULT_OK,data);
            finish();
        }



    }


    // End Button actions


    // End set up methods

    public Date GetStartDate(){
        String startDate = UserData_StartDate.getText().toString();
        return GetDateFromString(startDate);
    }

    public Date GetEndDate(){
        String endDate = UserData_EndDate.getText().toString();
        return GetDateFromString(endDate);
    }

    private Date GetDateFromString(String theDate){
        DateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy");
        try {
            Date date = dateFormat.parse(theDate);
            return date;
        } catch (ParseException e) {
            return null;
        }
    }





    //  END OF METHODS
}
