package com.example.planshare.ScheduleCode;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.planshare.Database.Schedules.Databases.ScheduleFolders;
import com.example.planshare.R;

/*



 */

public class FolderArrayAdapter_Item extends ArrayAdapter<ScheduleFolders> {

    Context mContext;
    int layoutResourceId;
    ScheduleFolders Folder_Data[] = null;

    public FolderArrayAdapter_Item(Context mContext, int layoutResourceId, ScheduleFolders[] data) {

        super(mContext, layoutResourceId, data);

        this.layoutResourceId = layoutResourceId;
        this.mContext = mContext;
        this.Folder_Data = data;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        /*
         * The convertView argument is essentially a "ScrapView" as described is Lucas post
         * http://lucasr.org/2012/04/05/performance-tips-for-androids-listview/
         * It will have a non-null value when ListView is asking you recycle the row layout.
         * So, when convertView is not null, you should simply update its contents instead of inflating a new row layout.
         */
        if(convertView==null){
            // inflate the layout
            LayoutInflater inflater = ((Activity) mContext).getLayoutInflater();
            convertView = inflater.inflate(layoutResourceId, parent, false);
        }

        // object item based on the position
        ScheduleFolders folder_item = Folder_Data[position];

        // get the TextView and then set the text (item name) and tag (item ID) values
        // getting id and name straight from database classes that are linked to the array adapter
        // and passed on to the actuall list view in its tag and the string saved in it
        TextView textViewItem = (TextView) convertView.findViewById(R.id.listview_folder_item);
        textViewItem.setTag("@+id/schedulefolder_item_" + folder_item.getFolderId());       // Set the tag of the list item so when press can bring to folder
        textViewItem.setText(folder_item.getFolderName());

        return convertView;

    }

}
