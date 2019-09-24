package com.example.planshare;

import android.arch.persistence.room.Room;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Environment;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.widget.Toast;

import com.example.planshare.Database.Schedules.SchedulesDatabase;
import com.example.planshare.Exceptions.CreateScheduleFileError;
import com.example.planshare.Exceptions.CreateingScheduleFolderError;
import com.example.planshare.Exceptions.LoadScheduleFileError;

import java.io.File;

/*
This class will be "static". It will store its own instance and have public static methods
that will help operate the instance

is instantiated from the MainActivity and is kept around, although it does reduce
its contents (for storage) as user uses the app (for example, it

ApplicationContext is pa
 */
public class FileManager {

    // CONSTANTS
    private String ROOTADDRESS;
    private static final String Schedules_RootAddress = "schedules_main";
    private static String ToDoLists_RootAddress = "todolists_main";
    private static String Calanders_RootAddress = "calander_main";

    private static FileManager Initialisation;

    private Context ApplicationContext;

    // VARIABLES





    // TO DO WITH DATABASES
    // DATABASE NAMES
    private static final String SCHEDULES_DB = "schedules_database";
    private static final String TODOLISTS_DB = "todolists_database";

    // DATABASES
    public static SchedulesDatabase TheSchedulesDatabase;

    // END OF TO DO WITH DATABASES

    // SET UP

    public static boolean HasBeenInitialised(){
        // If file manager has already been initialised or not
        if(Initialisation != null){
            // has been initialised
            return true;
        }
        else{
            return false;
        }
    }

    public static void InitialiseFileManager(String rootAddress, Context theContext){
        // Initialise an instance
        Initialisation =  new FileManager(rootAddress);

        Initialisation.ApplicationContext = theContext;

        // SET UP DATABASES
        TheSchedulesDatabase = Room.databaseBuilder(Initialisation.ApplicationContext, SchedulesDatabase.class, SCHEDULES_DB).allowMainThreadQueries().build();


    }

    // Constructor
    public FileManager(String rootAddress){
        // create main folders if new
        // set up file system
        ROOTADDRESS = rootAddress;
        SetUpRootFolders();


    }

    public void SetUpRootFolders(){
        // Set up the schedules and to do list Main folders

        // If the folders are not create already, they will be created. Else nothing.
        // Schedule Main Folder setup
        File schedulesFolder = new File(ROOTADDRESS + "/" + "SchedulesFolder");
        if(!schedulesFolder.exists()){
            schedulesFolder.mkdir();
            Log.d("MadeFolder", "done");
        }

        // To Do Lists Main Folder setup
        File toDoListsFolder = new File(ROOTADDRESS + "/" + "ToDoListsFolders");
        if(!toDoListsFolder.exists()){
            toDoListsFolder.mkdir();
            Log.d("MadeFolder", "done");
        }

    }
    // END OF SET UP

    // Static helper methods (to call the function methods)

    public static void CreateScheduleFolder(String location, String nameOfFolder) throws CreateingScheduleFolderError{
        Initialisation.CreateScheduleFolder_(location, nameOfFolder);
    }

    public static void CreateScheduleFile(String theFile_SERIALISED, String location, String nameOfFile) throws CreateScheduleFileError{
        Initialisation.CreateScheduleFile_(theFile_SERIALISED, location, nameOfFile);
    }

    public static void LoadScheduleFile(String address){
        Initialisation.LoadScheduleFile_(address);
    }



    // END OF Static helper methods (to call the function methods)

    // FUNCTION METHODS

    // Create new folder

    // SCHEDULES
    private void CreateScheduleFolder_(String location, String nameOfFolder) throws CreateingScheduleFolderError {
        File newScheduleFolder = new File(ROOTADDRESS + "/" + Schedules_RootAddress + "/" + location + "/" + nameOfFolder + "/");
        if(!newScheduleFolder.exists()){
            newScheduleFolder.mkdir();
            Log.d("Made schedule Folder", "done");
        }
        else{
            // cant create
            throw new CreateingScheduleFolderError();
        }
    }

    private void CreateScheduleFile_(String theFile_SERIALISED, String location, String nameOfFile) throws CreateScheduleFileError{
        File newScheduleFolder = new File(ROOTADDRESS + "/" + Schedules_RootAddress + "/" + location + "/" + nameOfFile);
        if(!newScheduleFolder.exists()){
            newScheduleFolder.mkdir();
            Log.d("Made schedule file", "done");
        }
        else{
            // cant create - exit
            throw new CreateScheduleFileError();
        }

        // To Do: store in the file
    }

    private File LoadScheduleFile_(String address) throws LoadScheduleFileError{
        // return a schedule file if it extists, otherwise throw error
        File loadedScheduleFile = new File(ROOTADDRESS + "/" + Schedules_RootAddress + "/" + address);
        if(!loadedScheduleFile.exists()){
            // File exists and can be loaded
            Log.d("File exists and can be loaded", "done");
            return loadedScheduleFile;
        }
        else{
            // error
            throw new LoadScheduleFileError();
        }
    }

    // END OF SCHEDULE




    // END OF FUNCTION METHODS

}
