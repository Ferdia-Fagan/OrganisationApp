package com.example.planshare.Database.ScheduleDatabase;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "schedule_files")
public class ScheduleFiles {

    @PrimaryKey
    @ColumnInfo(name="schedule_id")
    private int ScheduleID;

    @ColumnInfo(name="parentfolder_id")
    private int ParentFolderID;

    @ColumnInfo(name="schedule_name")
    private String ScheduleName;

    @ColumnInfo(name="scheduletype_id")
    private int ScheduleTypeId;

    @ColumnInfo(name="schedule_description")
    private String ScheduleDescription;

    // Getters

    public int getScheduleID() {
        return ScheduleID;
    }

    public int getParentFolderID() {
        return ParentFolderID;
    }

    public String getScheduleName() {
        return ScheduleName;
    }

    public int getScheduleTypeId() {
        return ScheduleTypeId;
    }

    public String getScheduleDescription() {
        return ScheduleDescription;
    }


    // Setters


    public void setScheduleID(int scheduleID) {
        ScheduleID = scheduleID;
    }

    public void setParentFolderID(int parentFolderID) {
        ParentFolderID = parentFolderID;
    }

    public void setScheduleName(String scheduleName) {
        ScheduleName = scheduleName;
    }

    public void setScheduleTypeId(int scheduleTypeId) {
        ScheduleTypeId = scheduleTypeId;
    }

    public void setScheduleDescription(String scheduleDescription) {
        ScheduleDescription = scheduleDescription;
    }
}
