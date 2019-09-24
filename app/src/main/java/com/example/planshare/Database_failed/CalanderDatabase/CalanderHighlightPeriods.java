package com.example.planshare.Database.CalanderDatabase;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;


@Entity(tableName = "calander_highlightperiods")
public class CalanderHighlightPeriods {

    @ColumnInfo(name="datehighlight_id")
    private int DateId;

    @ColumnInfo(name="highlight_startdate")
    private int StartDate;

    @ColumnInfo(name="highlight_enddate")
    private int EndDate;

    @ColumnInfo(name="title")
    private String Title;

    @ColumnInfo(name="details")
    private String Details;

    // Getters



    // Setters
}
