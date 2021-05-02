package com.example.daggerplayground.car;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class Driver {

    private static final String TAG = "Car";

    @Inject
    public Driver() {
        Log.d(TAG, "Driver: driver created: "+ this);
    }
}
