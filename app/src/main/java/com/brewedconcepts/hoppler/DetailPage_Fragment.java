package com.brewedconcepts.hoppler;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by RoseJane on 7/1/2015.
 */


/**
 * Created by RoseJane on 6/19/2015.
 */
public class DetailPage_Fragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ActionBar bar3 = ((ActionBarActivity) getActivity()).getSupportActionBar();
        return inflater.inflate(R.layout.detailpage_each_item, container, false);
    }

    @Override
    public void onResume() {
        super.onResume();
        getActivity().setTitle("Detail Page");
    }
}
