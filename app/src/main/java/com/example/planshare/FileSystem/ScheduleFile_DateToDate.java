package com.example.planshare.FileSystem;

import java.util.ArrayList;
import java.util.Date;
import java.util.Dictionary;

public class ScheduleFile_DateToDate extends ScheduleFile  {

    // CONSTANTS


    // VARIABLES
    private Date StartDate;
    private Date EndDate;


    // The data of the file
    private Dictionary<Date, Schedule_Day> Days;        // Maps each date to a day




    // END The data of the file


    // END VARIABLES


    ScheduleFile_DateToDate(String theFileAddress) {
        //super(theFileAddress);
    }
}
