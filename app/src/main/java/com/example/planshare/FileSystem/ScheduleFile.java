package com.example.planshare.FileSystem;

/*
    This script should help in createing a schedule file, opening a schedule file (storing its infomation)
 */

import android.os.Parcel;
import android.os.Parcelable;

import com.example.planshare.MainActivity;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;

/*
Creates, saves and opens schedule files
Each Day is stored in a class
Each Day is made up into time chunks



*/
public class ScheduleFile implements  Parcelable {

    // CONSTANTS
    private static final String SCHEDULE_ROOTFOLDERADDRESS = "/SchedulesFolder/";


    // VARIABLES

    private String ScheduleFileAddress;

    private FileOutputStream FOS;
    private FileInputStream FIS;

    private File scheduleFile;


    // The data of the file

    private int Data_Schedule_Id;        // PARCELABLE

    private String Data_ScheduleName;    // PARCELABLE
    private int Data_ParentFolder_Id;    // PARCELABLE

    private int Data_ScheduleType_Id;    // PARCELABLE

    private int Data_TimeFrameType_Id;   // PARCELABLE
    // The time frame will be stored in the extended class

    private String Data_ScheduleDescription; // PARCELABLE

    private Schedule_Day[] Data_Days;    // PARCELABLE







    // END The data of the file


    // END VARIABLES



    // METHODS VVV

    // Constructor
        /*
        To do:

         */
    ScheduleFile(){
        // Constructor

    }

    public static ScheduleFile CreateNewFile(String theFileAddressName){
        ScheduleFile theFile = new ScheduleFile();
        theFile.ScheduleFileAddress = theFileAddressName;

        // Create the file With address name in the schedules folder
        // For first test, will be called "test"
        theFile.scheduleFile = new File(MainActivity.ROOT_ADDRESS + SCHEDULE_ROOTFOLDERADDRESS, "test");
        return theFile;
    }

    // TBD
    public void SetUpBasicScheduleDetails_DateToDate(int schedule_Id, String scheduleName,int parentFolderId, int scheduleTypeId, int scheduleTimeFrameTypeId,
                                                     String scheduleDescription, String scheduleType){
        // Used after CreateNewFile is called/used.



    }

    // TBD
    public void SetUpBasicScheduleDetails_DayToDay(int schedule_Id, String scheduleName,int parentFolderId, int scheduleTypeId, int scheduleTimeFrameTypeId,
                                                   String scheduleDescription, String scheduleType){
        // Used after CreateNewFile is called/used.



    }

    public void SetUpBasicScheduleDetails_NumberOfDays(int schedule_Id, String scheduleName,int parentFolderId, int scheduleTypeId, int scheduleTimeFrameTypeId,
                                                       int numberOfDays, String scheduleDescription){
        // Used after CreateNewFile is called/used.
        this.Data_Schedule_Id = schedule_Id;
        this.Data_ScheduleName = scheduleName;
        this.Data_ParentFolder_Id = parentFolderId;
        this.Data_ScheduleType_Id = scheduleTypeId;
        this.Data_TimeFrameType_Id = scheduleTimeFrameTypeId;


    }

    public void LoadExistingFile(String theFileAddressName){
        ScheduleFileAddress = theFileAddressName;

        // Load file


        // Load basic details of the schedule


    }

    public void SetUp_FIS_And_FOS() throws FileNotFoundException {
        // Must be called once the file has been created/loaded
        FIS = new FileInputStream(scheduleFile);
        FOS = new FileOutputStream(scheduleFile);
        // Now can load data from the file, and save data to the file
    }

    // END CONSTRUCTOR

    // SET UP




    // END SET UP

    // New file methods
    public boolean IsNewFile(){
        // Returns if the files contents have not been set up
        return true;
    }

    public void SetUpNewFile(){
        // sets up a new file
    }

    // END NEW FILE METHODS


    // CURRENT FILE

    // Basic Details

    public void LoadBasicDetails(){

    }

    // Getters

    public String getScheduleName() {
        return Data_ScheduleName;
    }

    public String getScheduleDescription() {
        return Data_ScheduleDescription;
    }

    public int getScheduleType_Id() {
        return Data_ScheduleType_Id;
    }

    public int getParentFolder_Id() {
        return Data_ParentFolder_Id;
    }

    public String getScheduleFileAddress() {
        return ScheduleFileAddress;
    }

    // END GETTERS

    // Setters

    public void setScheduleName(String scheduleName) {
        Data_ScheduleName = scheduleName;
    }

    public void setScheduleDescription(String scheduleDescription) {
        Data_ScheduleDescription = scheduleDescription;
    }

    public void setScheduleType_Id(int scheduleType_Id) {
        Data_ScheduleType_Id = scheduleType_Id;
    }

    public void setParentFolder_Id(int folderId) {
        Data_ParentFolder_Id = folderId;
    }

    public void setScheduleFileAddress(String scheduleFileAddress) {
        ScheduleFileAddress = scheduleFileAddress;
    }

    // END SETTERS


    // End of basic details code




    // END OF CURRENT FILE CODE

    // Parcelable codE

    // Called from extended class

    public ScheduleFile(Parcel in) {
        // CREATE PARCEL WITH VARIABLES variables
        this.Data_Schedule_Id = in.readInt();
        this.Data_ScheduleName= in.readString();
        this.Data_ParentFolder_Id = in.readInt();
        this.Data_ScheduleType_Id= in.readInt();
        this.Data_TimeFrameType_Id = in.readInt();
        this.Data_ScheduleDescription= in.readString();
        this.Data_Days = (Schedule_Day[]) in.readParcelableArray(getClass().getClassLoader());      // Days
    }

    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel out, int flags) {
        // Save variables
        out.writeInt(this.Data_Schedule_Id);
        out.writeString(this.Data_ScheduleName);
        out.writeInt(this.Data_ParentFolder_Id);
        out.writeInt(this.Data_ScheduleType_Id);
        out.writeInt(this.Data_TimeFrameType_Id);
        out.writeString(this.Data_ScheduleDescription);
        out.writeParcelableArray(this.Data_Days,flags);
    }

    public static final Parcelable.Creator<ScheduleFile> CREATOR
            = new Parcelable.Creator<ScheduleFile>() {
        public ScheduleFile createFromParcel(Parcel in) {
            return new ScheduleFile(in);
        }

        public ScheduleFile[] newArray(int size) {
            return new ScheduleFile[size];
        }
    };

    // END OF PARCELABLE CODE

}







