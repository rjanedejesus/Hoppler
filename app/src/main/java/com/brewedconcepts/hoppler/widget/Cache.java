package com.brewedconcepts.hoppler.widget;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import java.util.HashSet;
import java.util.Set;
/**
 * Created by RoseJane on 6/9/2015.
 */
public class Cache {
    private static Cache instance;
    private Context context;
    private SharedPreferences openCache;
    private SharedPreferences app;
    private SharedPreferences user;

    public static final String CACHE_USER = "user";

    public static final String INITIAL_RUN = "initial_run";
    public static final String SETTINGS_SELECTED_URL = "settings_selected_url";
    public static final String SETTINGS_BASE_URL = "settings_base_url";

    public static final int URL_PRODUCTION = 0;
    public static final int URL_DEVELOPMENT = URL_PRODUCTION + 1;

    public static final String PREFS_ENABLE_TUTORIAL = "pref_key_enable_tutorial";

    public static final String USER_ID = "user_id";
    public static final String USER_NAME = "user_name";
    public static final String USER_EMAIL = "user_email";
    public static final String USER_COMPANY = "user_company";
    public static final String USER_COMPANY_ID = "user_company_id";
    public static final String USER_MANAGER_ID = "user_manager_id";
    public static final String USER_ROLE = "user_role";

    public static final String IS_LOGIN = "is_login";

    public static final String MANAGER_ID = "manager_id";
    public static final String MANAGER_COMPANY_ID = "manager_company_id";
    public static final String MANAGER_USERNAME = "manager_username";
    public static final String MANAGER_STATUS = "manager_status";
    public static final String MANAGER_EMAIL = "manager_email";
    public static final String MANAGER_ROLE = "manager_role";
    public static final String MANAGER_LICENSE_KEY = "manager_license_key";

    public static final String VIDEO_IDS = "video_ids";

    private Cache(Context context) {
        this.context = context;
        app = PreferenceManager.getDefaultSharedPreferences(context);
        user = context.getSharedPreferences(CACHE_USER, 0);
    }

    public static Cache getInstance(Context context) {
        if (instance == null)
            instance = new Cache(context.getApplicationContext());
        instance.openCache = instance.app;
        return instance;
    }

    public static Cache open(String name) {
        if (instance == null)
            throw new IllegalStateException(
                    "Cache must be instantiated upon creation of Application.");
        if (Cache.CACHE_USER.equals(name))
            instance.openCache = instance.user;
        else
            instance.openCache = instance.app;
        return instance;
    }

    public static Cache open() {
        return open(null);
    }

    public void save(String key, int value) {
        app.edit().putInt(key, value).commit();
    }

    public void save(String key, long value) {
        app.edit().putLong(key, value).commit();
    }

    public void save(String key, boolean value) {
        app.edit().putBoolean(key, value).commit();
    }

    public void save(String key, String value) {
        if (value == null)
            app.edit().remove(key).commit();
        else
            app.edit().putString(key, value).commit();
    }

    public int getInt(String key) {
        return app.getInt(key, -1);
    }

    public long getLong(String key) {
        return app.getLong(key, -1);
    }

    public String getString(String key) {
        return app.getString(key, null);
    }

    public boolean getBoolean(String key) {
        return getBoolean(key, false);
    }

    public boolean getBoolean(String key, boolean defaultValue) {
        return app.getBoolean(key, defaultValue);
    }

    public void clear() {
        app.edit().clear().commit();
    }

    public void clearUser() {
        user.edit().clear().commit();
    }

    public void remove(String key) {
        app.edit().remove(key).commit();
    }

    public Set<String> getStringSet(String key) {
        Set<String> set = new HashSet<String>();
        return app.getStringSet(key,set);
    }

    public void save(String key, Set<String> value) {
        app.edit().putStringSet(key, value).commit();
    }

}
