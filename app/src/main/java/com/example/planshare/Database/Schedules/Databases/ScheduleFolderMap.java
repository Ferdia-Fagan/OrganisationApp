package com.example.planshare.Database.Schedules.Databases;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "schedule_foldermap")
public class ScheduleFolderMap {

    @PrimaryKey
    @ColumnInfo(name="folder_id")
    private int FolderId;

    @ColumnInfo(name="location")
    private String Location;


    // Getters

    public int getFileId() {
        return FolderId;
    }

    public String getLocation() {
        return Location;
    }


    // Setters


    public void setFileId(int folderId) {
        FolderId = folderId;
    }

    public void setLocation(String location) {
        Location = location;
    }
}

