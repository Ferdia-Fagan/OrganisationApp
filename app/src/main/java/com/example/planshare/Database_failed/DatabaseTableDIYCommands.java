package com.example.planshare.Database;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;


@Entity(tableName = "tableDIYCommands")
public class DatabaseTableDIYCommands {

    @ColumnInfo(name="command")
    private int Command;

    @ColumnInfo(name="format")
    // the format that must follow the command
    private String Format;
    /*
        Command         Meaning
            SCHEDULE TIME LENGTHS
        1               DayToDay-expects:
        2               NumberOfDays-expects:
        3               DateToDate-expects:

            TO DO LISTS
        4               StartDate-To-Finnish-expects:
        5               StartDate-expects:
        6               FinishDate-expects:
        7               normalToDoList-expects:

            CALANDER
        8               startTimeToFinishTime-To-Finnish-expects:
        9               startTime-expects:
        10               finishTime-expects:
        11               noTimeConstraint-expects:
        12                legthOfTime- expects:
        4               assignedTaskToDate-expects:

        5               StartDate-expects:
        6               FinishDate-expects:
        7               normalToDoList-expects:


            TASK COMMAND
        4               OnDayNumber-expects:
        5               OnDay-expects:
        6               DayToDay-expects:
        7               DayToDay-expects:
        8               DayToDay-expects:
        9               DayToDay-expects:

                    QUERYING ANOTHER COMMANDS
        4               byNext_Day-expects: day
        4               next_Day-expects: day
        5               withinNumberOfDays-expects: number
        5               withinNumber-To-Number_OfDays-expects: number   number
        6               DateToDate-expects: date date
        7               ThisWeek-expects:   nothing
        8               nextWeek-expects:   number
        10              queryChunkOfFreeTime: string(long)
     */

    // Getters



    // Setters

}
