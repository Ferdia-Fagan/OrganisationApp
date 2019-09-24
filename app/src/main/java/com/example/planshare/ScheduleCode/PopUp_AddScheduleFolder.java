package com.example.planshare.ScheduleCode;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.planshare.FileManager;
import com.example.planshare.R;

public class PopUp_AddScheduleFolder extends PopUp {

    // CONSTANTS
    private static final int REQUEST_CODE_GETPARENTFOLDER = 1009;

    // Components
    private Button SelectParentFolderButton;
    private EditText EnterNewFolderName;



    // End of components

    // VARIABLES

    private Integer ParentFolderId;
    private String NameOfNewFolder;


    // SET UP

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.popup_addscheduleorfolder);    // Set layout of the pop up

        this.SizePopUp(0.7, 0.5);   // Set the size of the pop up

        // ASSIGNE COMPONENTS

    }

    // END SET UP

    // METHODS

    // Button actions

    public void selectTheParentFolderForNewFolder(View v){
        // Open pop up to allow user select the parent folder of the new folder
        Intent intent = new Intent(getApplicationContext(), PopUp_PickParentFolder.class);
        startActivityForResult(intent,REQUEST_CODE_GETPARENTFOLDER);
        // Will get a result back from this pop up
    }

    public void createScheduleFolder(View v){
        // Get the parent folder and the name entered and create the folder

        NameOfNewFolder = ((TextInputLayout)(findViewById(R.id.popup_newfoldersname))).getEditText().getText().toString();

        if(ParentFolderId != null){
            // has a parent folder therefor create the folder
            // To Do: get the location of the parent folder through the database
            String locationOfNewFolder = "";
            FileManager.CreateScheduleFolder(locationOfNewFolder,NameOfNewFolder);
        }
    }


    // end of button actions



    // function methods


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (requestCode){
            case REQUEST_CODE_GETPARENTFOLDER:
                if(resultCode == Activity.RESULT_OK){
                    // Get the message
                    int parentFolderSelected_id = data.getIntExtra("parentfolder_id",-1);
                    String parentFolderSelected_name = data.getStringExtra("parentfolder_name");
                    // use it
                    if(parentFolderSelected_id != -1){
                        // parent folder has been selected and returned
                        // assigne parent folder id
                        ParentFolderId = parentFolderSelected_id;

                        // Make Parent folder button text this


                    }
                    else{
                        // No value was returned
                    }
                }

        }
    }
}
