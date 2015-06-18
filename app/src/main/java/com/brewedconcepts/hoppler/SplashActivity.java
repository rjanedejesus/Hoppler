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

    private Handler handler;
    private Runnable callback;

   @Override
   protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_layout);

        final ImageView iv = (ImageView)findViewById(R.id.imageView);

       handler = new Handler();
       callback = new Runnable() {
           @Override
           public void run() {
               startActivity(new Intent(getApplicationContext(), MainActivity2Activity.class));
               finish();
               overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
           }
       };
       handler.postDelayed(callback, 1000);


   }

    @Override
    protected void onPause() {
        super.onPause();
        handler.removeCallbacks(callback);


   }
}