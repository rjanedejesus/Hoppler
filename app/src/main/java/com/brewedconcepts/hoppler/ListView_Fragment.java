package com.brewedconcepts.hoppler;


import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;

/**
 * Created by RoseJane on 6/25/2015.
 */
public class ListView_Fragment extends Fragment {
    private String[] stringArray;

    // Declaring our tabs and the corresponding fragments.
//    ActionBar.Tab sortTab, mapviewTab, photoviewTab;
//    Fragment sortFragmentTab = new SortFragmentTab();
//    Fragment mapviewFragmentTab = new MapViewFragmentTab();
//    Fragment photoviewFragmentTab = new PhotoViewFragmentTab();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ActionBar bar = ((ActionBarActivity) getActivity()).getSupportActionBar();
        bar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#007EFE")));
        View mRootView = inflater.inflate(R.layout.listview_main, container, false);

        // Creating ActionBar tabs.
//        bar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        // Setting custom tab icons.

//        sortTab = bar.newTab().setText("SORT");
//        mapviewTab = bar.newTab().setText("MAP VIEW");
//        photoviewTab = bar.newTab().setText("PHOTO VIEW");


        // Setting tab listeners.

//        sortTab.setTabListener(new TabListener(sortFragmentTab));
//        mapviewTab.setTabListener(new TabListener(mapviewFragmentTab));
//        photoviewTab.setTabListener(new TabListener(photoviewFragmentTab));

        // Adding tabs to the ActionBar.

//        bar.addTab(sortTab);
//        bar.addTab(mapviewTab);
//        bar.addTab(photoviewTab);

        stringArray = new String[0];
        for (int i = 0; i < stringArray.length; i++) {
            stringArray[i] = "String " + i;
        }

        ArrayList<User> arrayOfUsers = new ArrayList<User>();

        String results = "{\"count\": \"3720\",\"results\": [{\"id\": \"1257\",\"addreNo\": \"\",\"name\": \"Farol St.\",\"addreArea\": \"Urdaneta Village\",\"addreCity\": \"Makati\",\"addreRegion\": \"National Capital Region\", \"bathrooms\": \"3\", \"bedrooms\": \"4\",\"floorArea\": \"530\",\"rentalPrice\": \"230000\"},{\"id\": \"23822\",\"addreNo\": \"\",\"name\": \"Fairways Tower\",\"addreArea\": \"Bonifacio Global City\",\"addreCity\": \"Taguig\",\"addreRegion\": \"National Capital Region\", \"bathrooms\": \"2\", \"bedrooms\": \"1\",\"floorArea\": \"123\",\"rentalPrice\": \"123\"},{\"id\": \"1257\",\"addreNo\": \"\",\"name\": \"Farol St.\",\"addreArea\": \"Urdaneta Village\",\"addreCity\": \"Makati\",\"addreRegion\": \"National Capital Region\", \"bathrooms\": \"3\", \"bedrooms\": \"4\",\"floorArea\": \"530\",\"rentalPrice\": \"230000\"},{\"id\": \"23822\",\"addreNo\": \"\",\"name\": \"Fairways Tower\",\"addreArea\": \"Bonifacio Global City\",\"addreCity\": \"Taguig\",\"addreRegion\": \"National Capital Region\", \"bathrooms\": \"2\", \"bedrooms\": \"1\",\"floorArea\": \"123\",\"rentalPrice\": \"123\"},{\"id\": \"1257\",\"addreNo\": \"\",\"name\": \"Farol St.\",\"addreArea\": \"Urdaneta Village\",\"addreCity\": \"Makati\",\"addreRegion\": \"National Capital Region\", \"bathrooms\": \"3\", \"bedrooms\": \"4\",\"floorArea\": \"530\",\"rentalPrice\": \"230000\"}]}";

        JSONObject myobj = null;
        try {
            myobj = new JSONObject(results);
            JSONArray json = myobj.getJSONArray("results");

//            Log.v("MyTag","" + results);
            String house_address_j;
            String house_sqm_j;
            String house_br_j;
            String house_ba_j;
            String house_id_j;
            String house_price_j;

//            Log.v("MyTag_array","" + json.length());
            for (int i = 0; i < json.length(); i++) {

                house_sqm_j = json.getJSONObject(i).get("floorArea").toString() + "sqm";
                house_price_j = "₱ " + json.getJSONObject(i).get("rentalPrice").toString();
                house_address_j = json.getJSONObject(i).get("addreNo").toString() + " " + json.getJSONObject(i).get("name").toString() + " " + json.getJSONObject(i).get("addreArea").toString() + " " + json.getJSONObject(i).get("addreCity").toString() + " " + json.getJSONObject(i).get("addreRegion").toString();
                house_br_j = "BR" + json.getJSONObject(i).get("bedrooms").toString();
                house_ba_j = "BA" + json.getJSONObject(i).get("bathrooms").toString();
                house_id_j = "ID:" + json.getJSONObject(i).get("id").toString();
                User user1 = new User(house_address_j, house_sqm_j, house_br_j, house_ba_j, house_id_j, house_price_j);

                arrayOfUsers.add(user1);
//                Log.v("MyTag_array", "" + house_sqm_j);
            }
        } catch (JSONException e) {
            e.printStackTrace();
//            Log.v("MyTag_array", "" + e);
        }

//        User user1 = new User("Rm 43, One Central, Salcedo", "234sqm", "2BR", "1BA", "FQTR4");
//        User user2 = new User("35B Paseo Parkview Suits", "234sqm", "2BR", "1BA", "FQTR4");
//        User user3 = new User("7B Elisabeth Place, Salcedo", "234sqm", "2BR", "1BA", "FQTR4");
//        User user4 = new User("One Lafayette Square, Salcedo", "234sqm", "2BR", "1BA", "FQTR4");
//        User user5 = new User("One Lafayette Square, Salcedo", "234sqm", "2BR", "1BA", "FQTR4");
//
//        arrayOfUsers.add(user1);
//        arrayOfUsers.add(user2);
//        arrayOfUsers.add(user3);
//        arrayOfUsers.add(user4);
//        arrayOfUsers.add(user5);

        UsersAdapter adapter = new UsersAdapter(getActivity(), arrayOfUsers);
        // Attach the adapter to a ListView
        ListView listView = (ListView) mRootView.findViewById(R.id.listViewId);
        listView.setAdapter(adapter);

        return mRootView;
    }

    @Override
    public void onResume() {
        super.onResume();
        getActivity().setTitle("Listings Nearby");
    }
}

