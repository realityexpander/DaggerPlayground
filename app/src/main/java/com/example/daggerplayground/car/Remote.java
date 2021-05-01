package com.example.daggerplayground.car;

import android.util.Log;

import javax.inject.Inject;

public class Remote {

    private static final String TAG = "Car";
    
    @Inject
    public Remote() {
        Log.d(TAG, "Remote: remote created");
    }
    
    public void setListener(Car car) {
        Log.d(TAG, "setListener: Remote connected");
    }
    
}
