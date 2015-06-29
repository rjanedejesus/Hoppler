package com.brewedconcepts.hoppler;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;

/**
 * Created by RoseJane on 6/29/2015.
 */
class MyTabsListener implements ActionBar.TabListener{
    private Fragment fragment;

    public MyTabsListener(Fragment fragment){
        this.fragment = fragment;
    }
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft){
//        ft.add(R.id.layout2, fragment, null);
    }
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {
    }
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {
        ft.remove(fragment);
    }
}
