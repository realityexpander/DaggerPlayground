package com.example.daggerplayground.car;

import android.util.Log;

import javax.inject.Inject;


public class DieselEngine implements Engine {
    private static final String TAG="Car";

    @Inject
    public DieselEngine() {
        Log.d(TAG, "DieselEngine: engine created");
    }

    @Override
    public void startEngine() {
        Log.d(TAG, "startEngine: DieselEngine");
    }
}
