package com.example.planshare.Database.Schedules.DAOS;

import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.example.planshare.Database.Schedules.Databases.ScheduleFolders;

public interface ScheduleFolders_DAO {

    /*
    To Do:
    getFolders in parent folder.
    get folders in folder
    get all folders within parent folder (1 layer deep)
     */

    @Insert
    public void insertFolders(ScheduleFolders... theNewFolder);

    @Update
    public void updateFolders(ScheduleFolders... theFolder);

    @Delete
    public void deleteFolders(ScheduleFolders... theFolder);

    //@Query("SELECT * FROM schedule_folders where schedule_folders.parentfolder_id=0")
    //public ScheduleFolders[] getAllScheduleFoldersInMain();

    // @Query("SELECT folder_id, folder_name, foldertype_id FROM schedule_folders where schedule_folders.parentfolder_id=:parentFolderId")
    @Query("SELECT * FROM schedule_folders where schedule_folders.parentfolder_id=:parentFolderId")
    public ScheduleFolders[] getScheduleFoldersInParentFolder(int parentFolderId);
}
