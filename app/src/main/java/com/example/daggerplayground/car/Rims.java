package com.example.daggerplayground.car;

import android.util.Log;

public class Rims {
    // we don't own this class, so we can't annotate it with @Inject
    private static final String TAG = "Car";

    public Rims() {
        Log.d(TAG, "Rims: rims created");
    }
}
