package com.example.planshare.Database.CalanderDatabase;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;


@Entity(tableName = "calander_dates")
public class CalanderDates {

    @ColumnInfo(name="date_id")
    private int DateId;

    @ColumnInfo(name="date")
    private int Date;

    @ColumnInfo(name="date_command")
    private String DateCommand;

    @ColumnInfo(name="title")
    private String Title;

    @ColumnInfo(name="prioritylevel")
    private int PriorityLevel;

    @ColumnInfo(name="description")
    private String Description;

    // Getters



    // Setters
}
