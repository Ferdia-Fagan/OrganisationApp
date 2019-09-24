package com.example.planshare.Database.Schedules.Databases;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "schedule_types")
public class ScheduleTypes {

    @PrimaryKey
    @ColumnInfo(name="id")
    private int Id;

    @ColumnInfo(name="type")
    private String Type;

    // Methods

    // Constructor

    public ScheduleTypes(int Id, String Type) {
        this.Id = Id;
        this.Type = Type;
    }


    // Getters

    public int getId() {
        return Id;
    }

    public String getType() {
        return Type;
    }


    // Setters

    public void setId(int id) {
        Id = id;
    }

    public void setType(String type) {
        Type = type;
    }


    // End of methods

    // Initialise data to table
    public static ScheduleTypes[] populateData() {
        return new ScheduleTypes[] {
                new ScheduleTypes(0,Constants.ScheduleTypes[0]),
                new ScheduleTypes(1,Constants.ScheduleTypes[1]),
                new ScheduleTypes(2,Constants.ScheduleTypes[2])
        };
    }


}
