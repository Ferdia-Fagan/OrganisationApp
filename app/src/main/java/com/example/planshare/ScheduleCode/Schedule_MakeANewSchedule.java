package com.example.planshare.ScheduleCode;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.planshare.Exceptions.UserDataNotEnteredCorrectly;
import com.example.planshare.R;

/*
Databases will work with:
Schedule_TimeFrameType
ScheduleFiles
ScheduleTypes

class Description:
Will create a basic schedule file

 */

public class Schedule_MakeANewSchedule extends AppCompatActivity {

    // Constants

    // SCHEDULE POP UP REQUEST CODES
    private static final int REQUESTCODE_ADDSCHEDULETYPE = 1;
    private static final int REQUESTCODE_CHOOSESCHEDULETIMEFRAMETYPE = 2;

    private static final int REQUESTCODE_CHOOSESCHEDULETIMEFRAME_DATETODATE = 3;    // still to be completed
    private static final int REQUESTCODE_CHOOSESCHEDULETIMEFRAME_DAYTODAY = 4;      // Still to be completed
    private static final int REQUESTCODE_CHOOSESCHEDULETIMEFRAME_NUMBEROFDAYS = 5;          // This is the only one that will work so far
    // END OF SCHEDULE POP UP REQUEST CODES

    // VARIABLES
    // Components
    private EditText UserData_NameOfSchedule;
    private EditText UserData_FolderOfSchedule;
    private EditText UserData_DetailsOfSchedule;

    private Button Btn_InheritFolderType;
    private Button Btn_AddType;

    private Button Btn_ChooseTimeFrameType;
    private Button Btn_ChooseTimeFrame;

    // End of Components

    private String ScheduleName;

    private int ScheduleFolder;

    private String ScheduleType;
    private int ScheduleType_Id;

    private int ScheduleTimeFrameType_Id;
    private String TimeFrame;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule__make_anew_schedule);

        // Sync components
        UserData_NameOfSchedule = (EditText) findViewById(R.id.NS_UD_NameOfSchedule);
        UserData_FolderOfSchedule = (EditText) findViewById(R.id.NS_UD_ParentFolder);
        UserData_DetailsOfSchedule = (EditText) findViewById(R.id.NS_UD_Description);

        Btn_InheritFolderType = (Button) findViewById(R.id.NS_btn_TakeFolderType);
        Btn_AddType = (Button) findViewById(R.id.NS_btn_AddType);
        Btn_ChooseTimeFrameType = (Button) findViewById(R.id.NS_btn_ChooseTimeFrameType);
        Btn_ChooseTimeFrame = (Button) findViewById(R.id.NS_btn_ChooseTimeFrame);

    }

    // Button actions

    // Cancel button pressed or back button pressed
    public void Cancel(View v){
        // exit
        finish();
    }

    // Done button pressed
    public void Done(View v){

        try {
            GetUserDataEntered();
        } catch (UserDataNotEnteredCorrectly userDataNotEnteredCorrectly) {
            Log.e("Missing user data", "Data missing for schedule file to be created");
        }

    }

    public void GetUserDataEntered() throws UserDataNotEnteredCorrectly {
        // Check all details enterd are valid

        // Extract all the data entered

        // Name
        ScheduleName = UserData_NameOfSchedule.getText().toString();
        // Possible errors: name already exists, or string is empty
        if(ScheduleName.equals("")){
            // Name not given
            throw new UserDataNotEnteredCorrectly();        // Exception
        }

        // Folder           (does not work just yet)        (presumed for now to always be main)
        int scheduleFolder_id = 0;


        // Type


        // Time frame type

        // Time Frame

        // Description

        // Create the schedule file
    }

    // BUTTON ACTIONS

    // Will open pop up, which will give options of existing types and aable to enter new type
    // when enter, Buttons word is adjusted to the type user picked
    public void Btn_GiveScheduleType(View v){
        // Adopts own type
        startActivityForResult(new Intent(), REQUESTCODE_ADDSCHEDULETYPE);     // Opens pop up and returns results entered(onActivityResult(...)
    }
    public void Btn_GiveScheduleParentFolderType(View v){
        // Adopts just the parent folders type
    }

    // Will open pop up to allow user to select between the schedule time frame types (constant).
    // When pressed, the button will then read of the type selected
    // and the TimeFrame choose button will be made active
    public void ChooseTimeFrameType_btn(View v){

    }

    // Can only be pressed when Time frame type is selected
    // Pop up will be opened and will take in the necessary formated details
    public void ChooseTimeFrame(View v){

    }


    // END BUTTON ACTIONS



    // End button actions

    // OTHER METHODS

    public void onActivityResult(int requestCode, int resultCode, Intent data){
        // RETURNS FROM SCHEDULE POP UPS

        // SCHEDULE TYPE
        if(requestCode == REQUESTCODE_ADDSCHEDULETYPE){
            if(resultCode == RESULT_OK){
                String returnedResult = data.getData().toString();  // The data returned from any one of the pop ups
                // To Do: Get rid of folder inheritence button and make text box visible and add selected type
            }
        }

        // TIME FRAME TYPE
        if(requestCode == REQUESTCODE_CHOOSESCHEDULETIMEFRAMETYPE){
            if(resultCode == RESULT_OK){
                String returnedResult = data.getData().toString();  // The data returned from any one of the pop ups
                // To Do: "choose : typechosen"
            }
        }

        // TIME FRAME DATE TO DATE             (still to be made)

        if(requestCode == REQUESTCODE_CHOOSESCHEDULETIMEFRAME_DATETODATE){
            if(resultCode == RESULT_OK){
                String returnedResult = data.getData().toString();  // The data returned from any one of the pop ups
                // To Do: "choose : timeframechosen"
            }
        }

        // TIME FRAME DAY TO DAY            (still to be made)

        if(requestCode == REQUESTCODE_CHOOSESCHEDULETIMEFRAME_DAYTODAY){
            if(resultCode == RESULT_OK){
                String returnedResult = data.getData().toString();  // The data returned from any one of the pop ups
                // To Do: "choose : timeframechosen"
            }
        }

        // TIME FRAME NUMBER OF DAYS            (works)

        if(requestCode == REQUESTCODE_CHOOSESCHEDULETIMEFRAME_NUMBEROFDAYS){
            if(resultCode == RESULT_OK){
                int returnedResult = Integer.parseInt(data.getData().toString());  // The data returned from any one of the pop ups
                // To Do: "choose : timeframechosen"

            }
        }
    }




    // END OF OTHER METHODS


}
