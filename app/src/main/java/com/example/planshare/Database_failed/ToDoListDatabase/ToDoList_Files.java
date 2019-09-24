package com.example.planshare.Database.ToDoListDatabase;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;


@Entity(tableName = "todolist_files")
public class ToDoList_Files {

    @PrimaryKey
    @ColumnInfo(name="todolist_id")
    private int Id;

    @ColumnInfo(name="parentfolder_id")
    private int ParentFolderId;

    @ColumnInfo(name="name")
    private String Name;

    @ColumnInfo(name="todolisttype_id")
    private int ToDoListType_id;

    @ColumnInfo(name="priority_level")
    private int PriorityLevel;


    // Getters

    public int getId() {
        return Id;
    }

    public int getParentFolderId() {
        return ParentFolderId;
    }

    public String getName() {
        return Name;
    }

    public int getToDoListType_id() {
        return ToDoListType_id;
    }

    public int getPriorityLevel() {
        return PriorityLevel;
    }


    // Setters


    public void setId(int id) {
        Id = id;
    }

    public void setParentFolderId(int parentFolderId) {
        ParentFolderId = parentFolderId;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setToDoListType_id(int toDoListType_id) {
        ToDoListType_id = toDoListType_id;
    }

    public void setPriorityLevel(int priorityLevel) {
        PriorityLevel = priorityLevel;
    }
}
