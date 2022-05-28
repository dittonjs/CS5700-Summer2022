package com.usu;

import java.util.ArrayList;
import java.util.HashMap;

public class Cache {
    // the instance
    private static HashMap<Context, Cache>

    // array list for the cached data

    private Cache() {

    }

    public ArrayList<String> getCachedData() {
        return new ArrayList<>();
    }

    public static synchronized Cache getInstance(Context context) {
        if (instance == null) {
            instance = new Cache(logger);
        }
        return instance;
    }
}
