package com.brewedconcepts.hoppler;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by RoseJane on 6/24/2015.
 */
public class ListViewActivity extends Activity {
    private ListView lv;
    private String[] stringArray ;
    private ArrayAdapter ItemArrayAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview_main);


        stringArray = new String[20];
        for(int i=0; i < stringArray.length; i++){
            stringArray[i] = "String " + i;
        }
        ItemArrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, stringArray);
        lv = (ListView) findViewById(R.id.listViewId);
        lv.setAdapter(ItemArrayAdapter);
    }


}
