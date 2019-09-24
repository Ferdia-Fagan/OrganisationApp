package com.example.planshare.FileSystem;

//(DB replacement)
public class Constants {

    // Schedule  constants
    public static final String TimeFrameTypes[] =
    {
        "Number of days", "Date-to-Date", "Day-to-Day"
    };



    // To Do List constants
    public static final String ToDoListTypes[] = {
            "No Time Frame",
            "Has Time frame",   // Will have date to date time frame
            "Time Manager"      // This will be attached to a schedule (or not attached, but only works when active(ie quick diary),-which in that case it will be linked to the current schedule.
    };

    // Calander constants
    public static final String Months[] = {
            "January",
            "February",
            "March",
            "April",
            "May",
            "June",
            "July",
            "August",
            "September",
            "October",
            "November",
            "December",
    };

    public static final String DayOfWeek[] = {
            "Monday",
            "Tuesday",
            "Wednesday",
            "Thursday",
            "Friday",
            "Saturday",
            "Sunday",
    };
}
