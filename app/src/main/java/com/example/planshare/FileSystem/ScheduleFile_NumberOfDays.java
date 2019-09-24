package com.example.planshare.FileSystem;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

public class ScheduleFile_NumberOfDays extends ScheduleFile {

    // CONSTANTS


    // VARIABLES
    private int Data_TimeFrame_NumberOfDays;     // PARCELABLE


    // The data of the file



    // END The data of the file


    // END VARIABLES


    // CONSTRUCTION/SETUP

    public void SetUpBasicScheduleDetails(int schedule_Id, String scheduleName,int parentFolderId, int scheduleTypeId, int scheduleTimeFrameTypeId,
                                          int numberOfDays, String scheduleDescription){
        this.Data_TimeFrame_NumberOfDays = numberOfDays; // Specific
        SetUpBasicScheduleDetails_NumberOfDays(schedule_Id, scheduleName, parentFolderId, scheduleTypeId, scheduleTimeFrameTypeId,Data_TimeFrame_NumberOfDays, scheduleDescription); // Super

    }



    // END CONSTRUCTION/SETUP

    // Methods








    // END OF METHODS

    // Parcelable codE


    private ScheduleFile_NumberOfDays(Parcel in) {
        // CREATE PARCEL WITH VARIABLES variables
        this.Data_TimeFrame_NumberOfDays = in.readInt();

        // Create with basic details
        new ScheduleFile(in);
    }

    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel out, int flags) {
        // Save variables
        out.writeInt(this.Data_TimeFrame_NumberOfDays);

        // Write basic details
        super.writeToParcel(out,flags);

    }

    public static final Parcelable.Creator<ScheduleFile_NumberOfDays> CREATOR
            = new Parcelable.Creator<ScheduleFile_NumberOfDays>() {
        public ScheduleFile_NumberOfDays createFromParcel(Parcel in) {
            return new ScheduleFile_NumberOfDays(in);
        }

        public ScheduleFile_NumberOfDays[] newArray(int size) {
            return new ScheduleFile_NumberOfDays[size];
        }
    };

    // END OF PARCELABLE CODE


}
