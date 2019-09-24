package com.example.planshare.FileSystem;

import android.os.Parcel;
import android.os.Parcelable;

import java.sql.Time;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Timer;

public class Schedule_Day implements Parcelable {

    // CONSTANTS


    // VARIABLES
    private Time Data_StartTime = Time.valueOf("00:00");       // PARCELABLE
    private Time Data_FinishTime = Time.valueOf("23:59");// PARCELABLE

    // The data of the Day

    // TimeSlots_Codes will store 0 for free time, 1 for taken time for TimeSlots (in sync)
    private ArrayList<Integer> Data_TimeSlots_Codes;     // PARCELABLE
    private ArrayList<Integer> Data_TimeSlots_Free;      // PARCELABLE
    private ArrayList<Schedule_Day_ChunkOfTime> Data_TimeSlots;      // PARCELABLE


    // END The data of the Day


    // END VARIABLES


    // Constructors AND SET UP      vvv
    Schedule_Day(){

    }
    Schedule_Day(LocalTime startTime, LocalTime FinishTime){

    }

    // SET UP



    // END Constructors AND SET UP  ^^^

    // Checking the day     VVV

    public boolean IsTimeSlotFree(){
        return true;
    }


    // End Checking the day     ^^^

    //  EDITING THE DAY METHODS     VVV






    //  END OF EDITING THE DAY METHODS      ^^^

    // other methods


    // End the of the methods

    // Parcelable codE


    public Schedule_Day(Parcel in) {
        // CREATE PARCEL WITH VARIABLES
        this.Data_StartTime = (Time) in.readParcelable(getClass().getClassLoader());
        this.Data_FinishTimeTime = (Time) in.readParcelable(getClass().getClassLoader());

        this.Data_TimeSlots_Codes
        this.Data_TimeSlots_Free
        this.Data_TimeSlots
    }

    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel out, int flags) {
        // Save variables
    }

    public static final Parcelable.Creator<ScheduleFile> CREATOR
            = new Parcelable.Creator<ScheduleFile>() {
        public ScheduleFile createFromParcel(Parcel in) {
            return new ScheduleFile(in);
        }

        public ScheduleFile[] newArray(int size) {
            return new ScheduleFile[size];
        }
    };

    // END OF PARCELABLE CODE

}
