package com.brewedconcepts.hoppler;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;

import com.brewedconcepts.hoppler.widget.Cache;

/**
 * Created by RoseJane on 6/8/2015.
 */
public class LoginScreen extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActionBar bar = getActionBar();
        setContentView(R.layout.login_layout);
        getActionBar().setHomeButtonEnabled(true);
        getActionBar().setDisplayShowHomeEnabled(true);
        getActionBar().setIcon(R.drawable.btn_nav_menu);
        bar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#007EFE")));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu items for use in the action bar
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.login_activity_actions, menu);
        return true;
    }



}
