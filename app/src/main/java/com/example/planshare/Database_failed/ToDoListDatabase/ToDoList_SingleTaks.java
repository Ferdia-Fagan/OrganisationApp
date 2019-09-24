package com.example.planshare.Database.ToDoListDatabase;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;


@Entity(tableName = "todolist_singletasks")
public class ToDoList_SingleTaks {

    @PrimaryKey
    @ColumnInfo(name="task_id")
    private int TaskId;

    @ColumnInfo(name="todolist_id")
    private int ScheduleId;

    @ColumnInfo(name="title")
    private String TaskTitle;

    @ColumnInfo(name="description")
    private String TaskDescription;

    // Getters

    public int getTaskId() {
        return TaskId;
    }

    public int getScheduleId() {
        return ScheduleId;
    }

    public String getTaskTitle() {
        return TaskTitle;
    }

    public String getTaskDescription() {
        return TaskDescription;
    }


    // Setters


    public void setTaskId(int taskId) {
        TaskId = taskId;
    }

    public void setScheduleId(int scheduleId) {
        ScheduleId = scheduleId;
    }

    public void setTaskTitle(String taskTitle) {
        TaskTitle = taskTitle;
    }

    public void setTaskDescription(String taskDescription) {
        TaskDescription = taskDescription;
    }
}
