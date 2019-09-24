package com.example.planshare.Database.Schedules;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;
import android.support.annotation.NonNull;

import com.example.planshare.Database.Schedules.DAOS.ScheduleFolders_DAO;
import com.example.planshare.Database.Schedules.Databases.ScheduleFolders;

import java.util.concurrent.Executors;
//public class AppDatabase extends RoomDatabase {

/*
 databases:

 schedule: ScheduleFolders, ScheduleFileMap, ScheduleTypes, schedule tasks types,

 to do list: to do lists folders, to do list file maps, to do list task types,
*/

@Database(entities = {ScheduleFolders.class}
                        , version = 1)
public abstract class SchedulesDatabase extends RoomDatabase {

    // Variables
    private static SchedulesDatabase INSTANCE;

    // database DAOS
    public abstract ScheduleFolders_DAO ScheduleFoldersDAO();


    // END variables

    // Methods


    /*
    public synchronized static AppDatabase getInstance(Context context) {
        if (INSTANCE == null) {
            INSTANCE = buildDatabase(context);
        }
        return INSTANCE;
    }
    */




    public synchronized static SchedulesDatabase getInstance(final Context context) {
        if (INSTANCE == null) {
            synchronized (SchedulesDatabase.class) {
                if (INSTANCE == null) {
                    // Create database here
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            SchedulesDatabase.class, "schedules_database")
                            .build();
                }
            }
        }
        return INSTANCE;
    }

    // Build the database and initialise it on the first build with data
    private static SchedulesDatabase buildDatabase(final Context context) {
        return Room.databaseBuilder(context,
                SchedulesDatabase.class,
                "AppDatabase")
                .addCallback(new Callback() {

                    // Pre-load schedule types data
                    @Override
                    public void onCreate(@NonNull SupportSQLiteDatabase db) {
                        super.onCreate(db);
                        Executors.newSingleThreadScheduledExecutor().execute(new Runnable() {
                            @Override
                            public void run() {
                                // On create
                                getInstance(context).ScheduleFoldersDAO().insertFolders(ScheduleFolders.populateData());
                            }
                        });
                    }
                })
                .build();
    }



    // End methods


}
