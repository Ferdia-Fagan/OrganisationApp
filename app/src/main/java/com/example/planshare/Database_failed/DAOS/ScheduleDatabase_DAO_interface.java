package com.example.planshare.Database.DAOS;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

// Importing databases
import com.example.planshare.Database.ScheduleDatabase.ScheduleFileMap;
import com.example.planshare.Database.ScheduleDatabase.ScheduleFiles;
import com.example.planshare.Database.ScheduleDatabase.ScheduleFolders;
import com.example.planshare.Database.ScheduleDatabase.ScheduleTypes;
import com.example.planshare.Database.ScheduleDatabase.ScheduleFolderTypes;
import com.example.planshare.Database.ScheduleDatabase.Schedule_TaskTypes;
@Dao
public interface ScheduleDatabase_DAO_interface {

    // Schedule DAO
    // Insert, update and delete for each

    // SCHEDULE FOLDER
    /*
    To Do:
        getFolders in parent folder.
        get folders in folder
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


    // SCHEDULE FILES
    /*
    To Do:
        get files in folder
     */
    @Insert
    public void insertFiles(ScheduleFiles... theNewfiles);

    @Update
    public void updateFiles(ScheduleFiles... theFolder);

    @Delete
    public void deleteFiles(ScheduleFiles... theFolder);

    //@Query("SELECT schedule_id, schedule_name, scheduletype_id, schedule_description FROM schedule_files WHERE schedule_files.parentfolder_id =:parentFolderId")
    @Query("SELECT * FROM schedule_files WHERE schedule_files.parentfolder_id =:parentFolderId")
    public ScheduleFiles[] getFilesInFolder(int parentFolderId);



    // SCHEDULE TYPES
    /*
        To Do:

     */

    @Insert
    public void insertScheduleTypes(ScheduleTypes... newScheduleTypes);

    @Update
    public void updateScheduleTypes(ScheduleTypes... newScheduleTypes);

    @Delete
    public void deleteScheduleTypes(ScheduleTypes... deleteScheduleTypes);

    @Query("SELECT * FROM schedule_types")
    public ScheduleTypes[] getScheduleTypes();

    @Query("SELECT id FROM schedule_types where type=:theType")
    public int[] getScheduleTypes(String theType);



    // SCHEDULE Folder TYPES
    /*
        To Do:

     */

    @Insert
    public void insertFolderTypes(ScheduleFolderTypes... newFolderTypes);

    @Update
    public void updateFolderTypes(ScheduleFolderTypes... newFolderTypes);

    @Delete
    public void deleteFolderTypes(ScheduleFolderTypes... deleteFolderTypes);

    @Query("SELECT * FROM schedule_foldertypes")
    public ScheduleFolderTypes[] getScheduleFolderTypes();



    // SCHEDULE Task Types
    /*
        To Do:

     */

    @Insert
    public void insertTasksTypes(Schedule_TaskTypes... newTaskTypes);

    @Update
    public void updateTasksTypes(Schedule_TaskTypes... newTaskTypes);

    @Delete
    public void deleteTasksTypes(Schedule_TaskTypes... taskTypesToDelete);

    @Query("SELECT * FROM schedule_tasktypes")
    public Schedule_TaskTypes[] getScheduleTaskTypes();



    // SCHEDULE File map
    /*
        To Do:

     */

    @Insert
    public void insertFileMap(ScheduleFileMap... newTaskTypes);

    @Update
    public void updateFileMap(ScheduleFileMap... newTaskTypes);

    @Delete
    public void deleteFileMap(ScheduleFileMap... taskTypesToDelete);

    @Query("SELECT location FROM schedule_filemap where schedule_filemap.file_id=:file_id")
    public String getFileLocation(int file_id);




    // END SCHEDULES DAO
}
