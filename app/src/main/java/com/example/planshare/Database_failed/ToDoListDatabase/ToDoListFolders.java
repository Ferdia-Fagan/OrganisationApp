package com.example.planshare.Database.ToDoListDatabase;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.view.autofill.AutofillValue;

@Entity(tableName = "todolistfolders")
public class ToDoListFolders {

    @PrimaryKey
    @ColumnInfo(name="folder_id")
    private int FolderId;

    @ColumnInfo(name="parentfolder_id")
    private int ParentFolderId;

    @ColumnInfo(name="folder_name")
    private String FolderName;

    @ColumnInfo(name="foldertype_id")
    private int FolderTypeId;



    // Getters

    public int getFolderId() {
        return FolderId;
    }

    public int getParentFolderId() {
        return ParentFolderId;
    }

    public String getFolderName() {
        return FolderName;
    }

    public int getFolderTypeId() {
        return FolderTypeId;
    }


    // Setters


    public void setFolderId(int folderId) {
        FolderId = folderId;
    }

    public void setParentFolderId(int parentFolderId) {
        ParentFolderId = parentFolderId;
    }

    public void setFolderName(String folderName) {
        FolderName = folderName;
    }

    public void setFolderTypeId(int folderTypeId) {
        FolderTypeId = folderTypeId;
    }
}
