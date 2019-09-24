package com.example.planshare.Database.Schedules.Databases;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "schedule_filemap")
public class ScheduleFileMap {

    @PrimaryKey
    @ColumnInfo(name="file_id")
    private int FileId;

    @ColumnInfo(name="location")
    private String Location;


    // Getters

    public int getFileId() {
        return FileId;
    }

    public String getLocation() {
        return Location;
    }


    // Setters


    public void setFileId(int fileId) {
        FileId = fileId;
    }

    public void setLocation(String location) {
        Location = location;
    }
}
