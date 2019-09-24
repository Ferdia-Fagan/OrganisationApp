package com.example.planshare.FileSystem;

import java.sql.Time;
import java.time.LocalTime;
import java.util.ArrayList;

public class Schedule_Day_ChunkOfTime {

    // CONSTANTS


    // VARIABLES


    // The data of the Chunk of time
    private int TypeOfTimeSlot;     // PARCELABLE: Is 0 for empty(free), 1 for taken

    private Time StartTime;       // PARCELABLE
    private Time FinishTime;       // PARCELABLE

    private Schedule_Task TheTask;      // PARCELABLE: Will be null if is empty/free




    // END The data of the Day


    // END VARIABLES



    // Methods

    // Constructors
    public Schedule_Day_ChunkOfTime(){
        // Make Full day
    }

    public Schedule_Day_ChunkOfTime(LocalTime startTime, LocalTime finishTime){
        // Set a "day"
        StartTime = startTime;
        FinishTime = finishTime;

    }

    // END Constructors

    // Set up

    public void SetTaskToTimeSlow(Schedule_Task theSingleTask){

    }


    //  EDITING THE DAY METHODS

}
