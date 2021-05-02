package com.example.daggerplayground.car;

import android.util.Log;

import javax.inject.Inject;


public class DieselEngine implements Engine {
    private static final String TAG="Car";

    private int horsePower;

    @Inject
    public DieselEngine(int horsePower) {
        Log.d(TAG, "DieselEngine: engine created with horsePower=" + horsePower);
        this.horsePower = horsePower;
    }

    @Override
    public void startEngine() {
        Log.d(TAG, "startEngine: DieselEngine. Horsepower = " + horsePower );
    }
}
