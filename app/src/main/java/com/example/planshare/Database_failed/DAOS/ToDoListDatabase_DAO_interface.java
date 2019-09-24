package com.example.planshare.Database.DAOS;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;



// Importing databases
import com.example.planshare.Database.ToDoListDatabase.ToDoListFolders;
import com.example.planshare.Database.ToDoListDatabase.ToDoList_Files;
import com.example.planshare.Database.ToDoListDatabase.ToDoList_MultipleTasks;
import com.example.planshare.Database.ToDoListDatabase.ToDoList_SingleTaks;
import com.example.planshare.Database.ToDoListDatabase.ToDoList_Tasks;

@Dao
public interface ToDoListDatabase_DAO_interface {

    // TO DO LIST DAO

    // TO DO LIST FOLDERS
    @Insert
    public void insertFolders(ToDoListFolders... theNewFolders);

    @Update
    public void updateFolders(ToDoListFolders... theFolders);

    @Delete
    public void deleteFolders(ToDoListFolders... theFolders);

    @Query("SELECT * FROM todolistfolders where todolistfolders.parentfolder_id=0")
    public ToDoListFolders[] getAllToDoListFoldersInMain();

    @Query("SELECT * FROM todolistfolders where todolistfolders.parentfolder_id=:parentFolderId")
    public ToDoListFolders[] getAllToDoListFolderInParentFolder(int parentFolderId);


    // TO DO LIST FILES

    @Insert
    public void insertFiles(ToDoList_Files... theNewfiles);

    @Update
    public void updateFiles(ToDoList_Files... theFolder);

    @Delete
    public void deleteFiles(ToDoList_Files... theFolder);

    @Query("SELECT * FROM todolist_files WHERE todolist_files.parentfolder_id =:parentFolderId")
    public ToDoList_Files[] getAllSchedulesInFolder(int parentFolderId);



    // TO DO LIST TASKS

    @Insert
    public void insertTasks(ToDoList_Tasks... theNewScheduleTasks);

    @Update
    public void updateScheduleTasks(ToDoList_Tasks... theScheduleTasks);

    @Query("SELECT * FROM schedule_tasks where Schedule_Tasks.schedule_id=:scheduleId AND Schedule_Tasks.task_id=:listOfMultipleTasksOfIDs")
    public ToDoList_Tasks[] getTasksFrom_MultipleTasks(int scheduleId, int[] listOfMultipleTasksOfIDs);

    @Query("SELECT * FROM schedule_tasks where Schedule_Tasks.schedule_id=:scheduleId AND Schedule_Tasks.task_id=:listOfSingleTasksOfIDs")
    public ToDoList_Tasks[] getTasksFrom_SingleTasks(int scheduleId, int[] listOfSingleTasksOfIDs);



    // TO DO LIST MULTIPLE TASKS

    @Insert
    public void insertMultipleTask(ToDoList_MultipleTasks... theNewScheduleMultipleTasks);

    @Update
    public void updateMultipleTask(ToDoList_MultipleTasks... theScheduleMultipleTasks);

    @Delete
    public void deleteMultipleTask(ToDoList_MultipleTasks... theScheduleMultipleTasks);

    @Query("SELECT * FROM schedule_multipletasks where schedule_multipletasks.schedule_id=:scheduleID")
    public ToDoList_MultipleTasks[] getMultipleTasks(int scheduleID);




    // TO DO LIST SINGLE TASKS

    @Insert
    public void insertSingleTask(ToDoList_SingleTaks... theNewScheduleSingleTasks);

    @Update
    public void updateSingleTask(ToDoList_SingleTaks... theScheduleSingleTasks);

    @Delete
    public void deleteSingleTask(ToDoList_SingleTaks... theScheduleSingleTasks);

    @Query("SELECT * FROM schedule_singletasks where schedule_singletasks.schedule_id=:scheduleID")
    public ToDoList_SingleTaks[] getSingleTasks(int scheduleID);


}
