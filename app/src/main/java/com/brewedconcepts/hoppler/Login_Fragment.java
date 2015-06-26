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

import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;

/**
 * Created by RoseJane on 6/18/2015.
 */
public class Login_Fragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ActionBar bar = ((ActionBarActivity) getActivity()).getSupportActionBar();
        bar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#007EFE")));
        View view =
                inflater.inflate(R.layout.login_layout, container, false);

        LoginButton loginButton = (LoginButton) view.findViewById(R.id.btn_login_facebook);
        loginButton.setReadPermissions("user_friends");
        // If using in a fragment
        loginButton.setFragment(this);
        // Other app specific specialization

        // Callback registration
        CallbackManager callbackManager = CallbackManager.Factory.create();;
        loginButton.registerCallback(callbackManager, new FacebookCallback<LoginResult>() {
            @Override
            public void onSuccess(LoginResult loginResult) {
                // App code
            }

            @Override
            public void onCancel() {
                // App code
            }

            @Override
            public void onError(FacebookException exception) {
                // App code
            }
        });



        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        getActivity().setTitle("Login");
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu items for use in the action bar
        MenuInflater inflater = getActivity().getMenuInflater();
        inflater.inflate(R.menu.login_activity_actions, menu);
        return true;
    }

    private View.OnClickListener onClickListener = new View.OnClickListener() {

        @Override
        public void onClick(final View v) {
            switch(v.getId()){
                case R.id.register:
                   ((MainActivity2Activity)getActivity()).setRegistrationToFragment();
                    break;
            }

        }
    };
}
