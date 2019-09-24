package com.example.planshare.Database.ToDoListDatabase;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "todolist_types")
public class ToDoListTypes {

    @PrimaryKey
    @ColumnInfo(name="type_id")
    private int TypeId;

    @ColumnInfo(name="type")
    private String Type;


    // Getters

    public int getTypeId() {
        return TypeId;
    }

    public String getType() {
        return Type;
    }

    // End Getters


    // Setters


    public void setTypeId(int typeId) {
        TypeId = typeId;
    }

    public void setType(String type) {
        Type = type;
    }

    // End setters
}
