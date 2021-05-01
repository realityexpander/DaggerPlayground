package com.example.daggerplayground.car;


import android.util.Log;
import javax.inject.Inject;

public class PetrolEngine implements Engine {
    private static final String TAG = "Car";

    @Inject
    public PetrolEngine() {
        Log.d(TAG, "PetrolEngine: engine created");
    }

    @Override
    public void startEngine() {
        Log.d(TAG, "startEngine: PetrolEngine");
    }
}
