package com.example.daggerplayground.car;

import android.util.Log;

public class Wheels {
    // we don't own this class, so we can't annotate it with @Inject
    private static final String TAG = "Car";

    private Rims rims;
    private Tires tires;

    public Wheels(Rims rims, Tires tires) {
        this.rims = rims;
        this.tires = tires;
        Log.d(TAG, "Wheels: wheels created");
    }
}
