package com.brewedconcepts.hoppler;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.brewedconcepts.hoppler.widget.Cache;

/**
 * Created by RoseJane on 6/8/2015.
 */
public class LoginScreen extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        cache = Cache.open(Cache.CACHE_USER);
        setContentView(R.layout.login_layout);
    }





}
