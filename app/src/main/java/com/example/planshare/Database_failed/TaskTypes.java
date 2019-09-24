package com.example.planshare.Database;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "tasktypes")
public class TaskTypes {

    @ColumnInfo(name="tasktype_id")
    private int TaskTypeID;

    @ColumnInfo(name="type")
    private String  TaskType;


    // Getters

    public int getTaskTypeID() {
        return TaskTypeID;
    }

    public String getTaskType() {
        return TaskType;
    }


    // Setters


    public void setTaskTypeID(int taskTypeID) {
        TaskTypeID = taskTypeID;
    }

    public void setTaskType(String taskType) {
        TaskType = taskType;
    }
}
