package com.brewedconcepts.hoppler;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by RoseJane on 6/29/2015.
 */
public class SortFragmentTab extends Fragment {

    @Override

    public View onCreateView(LayoutInflater inflater, ViewGroup container,

                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.sort_layout, container, false);

        return rootView;

    }

}
