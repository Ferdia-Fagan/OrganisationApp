package com.example.planshare.ScheduleCode;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.planshare.Database.Schedules.Databases.ScheduleFolders;
import com.example.planshare.Database.Schedules.SchedulesDatabase;
import com.example.planshare.FileManager;
import com.example.planshare.MainActivity;
import com.example.planshare.R;

public class PopUp_PickParentFolder extends PopUp{
    // CONSTANTS

    // VARIABLES
    ListView FolderListView;


    // SET UP

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.popup_pickparentfolder);    // Set layout of the pop up

        this.SizePopUp(0.7, 0.5);   // Set the size of the pop up
        FillOutFolderList();
    }



    private void FillOutFolderList(){
        // FILL OUT THE LISTVIEW WITH FOLDERS from the parent
        FolderListView = (ListView)findViewById(R.id.popup_listofparentfolders);        // Get list view

        // get all folders in main (root)
        ScheduleFolders[] theScheduleFolders =
                        FileManager.TheSchedulesDatabase.ScheduleFoldersDAO().getScheduleFoldersInParentFolder(0);

        // Adapter
        FolderArrayAdapter_Item folderArrayAdapter = new FolderArrayAdapter_Item(this, android.R.layout.simple_list_item_1, theScheduleFolders);

        // Set click listeners for items
        FolderListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Get the exact one pressed
                TextView textViewItem = ((TextView) view.findViewById(R.id.listview_folder_item));
                // get the parent folder id number
                int parentFolder_IdNumber = Integer.parseInt(textViewItem.getTag().toString());
                String parentFolder_Name = textViewItem.getText().toString();

                // TO DO: Exit the activity and on exit return parentFolder_IdNumber with the Intent
                Intent intent = new Intent();
                intent.putExtra("parentfolder_id", parentFolder_IdNumber);
                intent.putExtra("parentfolder_name", parentFolder_Name);
                setResult(Activity.RESULT_OK, intent);
                finish();

            }
        });

        // put into list view
        FolderListView.setAdapter(folderArrayAdapter);
    }

    // END OF SET UP

    // FUNCTION METHODS






    // END OF FUNCTION METHODS

}
