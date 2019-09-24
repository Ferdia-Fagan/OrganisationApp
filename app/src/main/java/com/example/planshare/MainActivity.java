package com.example.planshare;

import android.arch.persistence.room.Room;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;


import com.example.planshare.CalanderCode.CalanderView_Year;
import com.example.planshare.CalanderCode.Calander_AddADate;
import com.example.planshare.Database.Schedules.SchedulesDatabase;
import com.example.planshare.ScheduleCode.SchedulesMain;
import com.example.planshare.ScheduleCode.SchedulesView_Week;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    // CONSTANTS


    // VARIABLES




    // END OF FILE SYSTEM

    // SET UP

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //  Gets the root adress, where internal storage shall be saved
        String ROOT_ADDRESS = this.getFilesDir().toString();
        System.out.println(" the address " + ROOT_ADDRESS);
        Log.d("DONE", ROOT_ADDRESS);

        // initialise the file manager (files and databases)
        FileManager.InitialiseFileManager(ROOT_ADDRESS,getApplicationContext());

    }

    // File system

    // For initial set up of the app, and its Folder/file system
    /*
    public void SetUpRootFolders(){
        // Set up the schedules and to do list Main folders

        // If the folders are not create already, they will be created. Else nothing.
        // Schedule Main Folder setup
        File schedulesFolder = new File(ROOT_ADDRESS + "/" + "SchedulesFolder");
        if(!schedulesFolder.exists()){
            schedulesFolder.mkdir();
            Log.d("MadeFolder", "done");
        }

        // To Do Lists Main Folder setup
        File toDoListsFolder = new File(ROOT_ADDRESS + "/" + "ToDoListsFolders");
        if(!toDoListsFolder.exists()){
            toDoListsFolder.mkdir();
            Log.d("MadeFolder", "done");
        }

    }
    */

    // END OF SET UP




    // FUNCTION METHODS


    // Button presses

    public void ScheduleButtonPressed(View v){
        // Opens up schedules main finder/explorer
        Intent i = new Intent(getApplicationContext(), SchedulesMain.class);
        startActivity(i);

    }

    public void CurrentScheduleButtonPressed(View v){
        // Shows current schedule selected, but does not include calander points (unless its suppose to because its dated)
        Intent i = new Intent(getApplicationContext(), SchedulesView_Week.class);
        startActivity(i);
    }

    public void ToDoListButtonPressed(View v){
        // Opens up to do list main finder/explorer
        Intent i = new Intent(getApplicationContext(), ToDoListsMain.class);
        startActivity(i);
    }

    public void CurrentToDoListButtonPressed(View v){
        // Shows current to do list selected.
        Intent i = new Intent(getApplicationContext(), ToDoListView.class);
        startActivity(i);

    }

    public void CalanderButtonPressed(View v){
        // Shows calander view (From year and month)
        Intent i = new Intent(getApplicationContext(), CalanderView_Year.class);
        startActivity(i);
    }

    public void AddDateButtonPressed(View v){
        // New view
        Intent i = new Intent(getApplicationContext(), Calander_AddADate.class);
        startActivity(i);
    }

    public void SettingsButtonPressed(View v){
        // New view
        Intent i = new Intent(getApplicationContext(), Settings.class);
        startActivity(i);
    }

    public void QuickDiaryButtonPressed(View v){
        // Opens up current schedule, containing calander dates and all. (view all days)
        Intent i = new Intent(getApplicationContext(), QuickDiaryView_Week.class);
        startActivity(i);

    }
    public void TodayButtonPressed(View v){
        // Opens up current schedule, containing calander dates and tasks for today
        Intent i = new Intent(getApplicationContext(), QuickDiaryView_Day.class);
        startActivity(i);
    }
    public void WhatsOnNowButtonPressed(View v){
        // same as TodayButtonPressed but auto focus on now
        Intent i = new Intent(getApplicationContext(), QuickDiaryView_Day.class);
        startActivity(i);
    }


    public void QueryDiaryButtonPressed(View v){
        // Open up query page
        Intent i = new Intent(getApplicationContext(), QueryDiary.class);
        startActivity(i);
    }

    public void ImBoredButtonPressed(View v){

    }

    public void AccountButtonPressed(View v){

    }

    public void HelpButtonPressed(View v){

    }

    // End button presses
}
