package com.example.planshare.Database.Schedules.Databases;


import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/*
    folder_id
    parentfolder_id
    folder_name
 */

@Entity(tableName = "schedule_folders")
public class ScheduleFolders {

    @PrimaryKey
    @ColumnInfo(name="folder_id")
    private int FolderId;

    @ColumnInfo(name="parentfolder_id")
    private int ParentFolderId;

    @ColumnInfo(name="folder_name")
    private String FolderName;

    // Constructor
    public ScheduleFolders(int FolderId, int ParentFolderId, String FolderName){
        this.FolderId = FolderId;
        this.ParentFolderId = ParentFolderId;
        this.FolderName = FolderName;
    }


    // Getters

    public int getFolderId() {
        return FolderId;
    }

    public int getParentFolderID() {
        return ParentFolderId;
    }

    public String getFolderName() {
        return FolderName;
    }


    // End getters


    // Setters

    public void setFolderId(int folderId) {
        this.FolderId = folderId;
    }

    public void setParentFolderID(int ParentFolderId) {
        this.ParentFolderId = ParentFolderId;
    }

    public void setFolderName(String folderName) {
        this.FolderName = folderName;
    }


    // End setters

    // Initialise data to table
    public static ScheduleFolders populateData() {
        return new ScheduleFolders(0,0,"schedule main");
    }
}
