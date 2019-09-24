package com.example.planshare.Database.ToDoListDatabase;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;


@Entity(tableName = "todolist_tasks")
public class ToDoList_Tasks {

    @PrimaryKey
    @ColumnInfo(name="task_id")
    private int TaskId;

    @ColumnInfo(name="type_id")
    private int TypeId;

    @ColumnInfo(name="task_commandcall")
    private int CommandCall;

    @ColumnInfo(name="task_prioritylevel")
    private int TaskPriorityLevel;

    @ColumnInfo(name="task_completion")
    private boolean IsTaskComplete;

    @ColumnInfo(name="schedule_description")
    private String ScheduleDescription;

    // Getters

    public int getTaskId() {
        return TaskId;
    }

    public int getTypeId() {
        return TypeId;
    }

    public int getCommandCall() {
        return CommandCall;
    }

    public int getTaskPriorityLevel() {
        return TaskPriorityLevel;
    }

    public String getScheduleDescription() {
        return ScheduleDescription;
    }


    // Setters


    public void setTaskId(int taskId) {
        TaskId = taskId;
    }

    public void setTypeId(int typeId) {
        TypeId = typeId;
    }

    public void setCommandCall(int commandCall) {
        CommandCall = commandCall;
    }

    public void setTaskPriorityLevel(int taskPriorityLevel) {
        TaskPriorityLevel = taskPriorityLevel;
    }

    public void setScheduleDescription(String scheduleDescription) {
        ScheduleDescription = scheduleDescription;
    }
}
