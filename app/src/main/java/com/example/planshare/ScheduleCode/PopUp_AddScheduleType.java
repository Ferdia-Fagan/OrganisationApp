package com.example.planshare.ScheduleCode;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.planshare.R;

public class PopUp_AddScheduleType extends PopUp{

    EditText UserData_ScheduleType_TxtBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.popup_addscheduletype);    // Set layout of the pop up

        this.SizePopUp(0.7, 0.5);   // Set the size of the pop up

        // Get the text box user will use
        UserData_ScheduleType_TxtBox = (EditText)findViewById(R.id.userData_scheduleType);

    }

    // Set up methods

    // Layout


    // END layout

    // Button actions

    public void AddType(View v){
        // Add what user entered in the text box
        // Get the string entered in the text box
        String scheduleType = UserData_ScheduleType_TxtBox.getText().toString();

        // CHECK IF TYPE ALREADY EXISTS,
        // IF IT DOES, THEN RETURN THE TYPE ID

        // ELSE ADD IT TO THE DATABASE


        // Finnish the activity and return the type selected
        Intent data = new Intent();
        data.setData(Uri.parse(scheduleType));
        setResult(RESULT_OK, data);

        finish();
    }

    public void SelectType(){
        // Select a currently existing schedule type

    }








    // End Button actions



    // End set up methods


}
