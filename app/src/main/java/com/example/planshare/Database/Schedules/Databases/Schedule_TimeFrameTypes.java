package com.example.planshare.Database.Schedules.Databases;


import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "schedule_tasktypes")
public class Schedule_TimeFrameTypes {

    @PrimaryKey
    @ColumnInfo(name="id")
    private int TypeId;

    @ColumnInfo(name="type")
    private String Type;


    // Getters

    public int getId() {
        return TypeId;
    }

    public String getType() {
        return Type;
    }


    // Setters


    public void setId(int typeId) {
        TypeId = typeId;
    }

    public void setType(String type) {
        Type = type;
    }

}
