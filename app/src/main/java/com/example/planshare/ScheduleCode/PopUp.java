package com.example.planshare.ScheduleCode;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;

import com.example.planshare.R;

public class PopUp extends Activity {

    // Set up methods

    // Layout

    protected void SizePopUp(double widthWeight, double heightWeight){
        // Set up the popup size etc (the window and set up)
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;
        getWindow().setLayout((int)(width * widthWeight), (int)(height * heightWeight));
    }

    // END layout

    // Methods

    public void Cancel(View v){
        // Exit popup
        finish();
    }




    // End methods


}
