package com.brewedconcepts.hoppler;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import com.brewedconcepts.hoppler.R;

/**
 * Created by RoseJane on 6/8/2015.
 */
public class SplashActivity extends Activity {

   @Override
   protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_layout);

        final ImageView iv = (ImageView)findViewById(R.id.imageView);

        Intent i = new Intent(this,MainActivity.class);
        startActivity(i);
   }
}