package com.brewedconcepts.hoppler;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;


/**
 * Created by RoseJane on 6/18/2015.
 */
public class Login_Fragment extends Fragment {

    private View mView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment

//       ------------ORIGINAL CONTENT IN OnCreate-------------------

        ActionBar bar = ((ActionBarActivity) getActivity()).getSupportActionBar();
        bar.setTitle("Login");
        bar.setHomeButtonEnabled(true);
        bar.setDisplayShowHomeEnabled(true);
//        bar.setIcon(R.drawable.btn_nav_menu);
        bar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#007EFE")));

//        -----------------------------------------------------------

        return inflater.inflate(R.layout.login_layout, container, false);

    }




//    FROM LOGIN ACTIVITY
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
//        ActionBar bar = getActionBar();
//        setContentView(R.layout.login_layout);
//        getActionBar().setHomeButtonEnabled(true);
//        getActionBar().setDisplayShowHomeEnabled(true);
//        getActionBar().setIcon(R.drawable.btn_nav_menu);
//        bar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#007EFE")));
//
//
//    }



    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu items for use in the action bar
        MenuInflater inflater = getActivity().getMenuInflater();
        inflater.inflate(R.menu.login_activity_actions, menu);
        return true;


    }
}
