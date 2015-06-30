package com.brewedconcepts.hoppler;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by RoseJane on 6/24/2015.
 */
public class UsersAdapter_PhotoView extends ArrayAdapter<User_PhotoView> {
    public UsersAdapter_PhotoView(Context context, ArrayList<User_PhotoView> users) {
        super(context, 0, users);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        User_PhotoView user = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.photoview_layout, parent, false);
        }
        // Lookup view for data population
        TextView tv_house_address = (TextView) convertView.findViewById(R.id.house_address_pv);
        TextView tv_house_sqm = (TextView) convertView.findViewById(R.id.house_sqm_pv);
        TextView tv_house_br= (TextView) convertView.findViewById(R.id.house_br_pv);
        TextView tv_house_ba = (TextView) convertView.findViewById(R.id.house_ba_pv);
        TextView tv_house_id = (TextView) convertView.findViewById(R.id.house_id_pv);
        TextView tv_house_price = (TextView) convertView.findViewById(R.id.house_price_pv);

        // Populate the data into the template view using the data object
        tv_house_address.setText(user.house_address);
        tv_house_sqm.setText(user.house_sqm);
        tv_house_br.setText(user.house_br);
        tv_house_ba.setText(user.house_ba);
        tv_house_id.setText(user.house_id);
        tv_house_price.setText(user.house_price);
        // Return the completed view to render on screen
        return convertView;
    }
}
