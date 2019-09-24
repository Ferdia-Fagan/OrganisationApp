package com.example.planshare.ScheduleCode;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.example.planshare.R;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PopUp_ChooseScheduleTimeFrame_Number extends PopUp {
    EditText UserData_NumberOfDays;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.popup_choosetimeframe_dates);    // Set layout of the pop up

        this.SizePopUp(0.7, 0.5);   // Set the size of the pop up

        // sync start date and end date editText objs
        UserData_NumberOfDays = (EditText) findViewById(R.id.userData_numberOfDays);

    }

    // Set up methods

    // Layout


    // END layout

    // Button actions

    public void SelectTimeFrame_NumberOfDays(View v){
        // Check that two dates have been given
        int numberOfDays = GetNumberOfDays();

        if(numberOfDays == 0){
            // Dates are not valid
            Log.d("UserData_notGiven", "number of days not properly entered");
        }

        else{
            // Dates are given
            // check if are acceptable (later... for now no exceptions needed)
            Intent data = new Intent();
            data.setData(Uri.parse("" + numberOfDays));
            setResult(RESULT_OK,data);
            finish();
        }



    }


    // End Button actions


    // End set up methods

    public int GetNumberOfDays(){
        // Rturns null if not entered properly

        int numberOfDays = 0;
        try {
            numberOfDays = (int)Integer.parseInt(UserData_NumberOfDays.getText().toString());
        } catch (NumberFormatException e) {
            return 0;
        }
        return  numberOfDays;
    }





    //  END OF METHODS
}
