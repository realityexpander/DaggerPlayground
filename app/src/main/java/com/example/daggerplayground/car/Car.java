package com.example.daggerplayground.car;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    private static final String TAG = "Car";

    private Driver driver;
    private Engine engine;
    private Wheels wheels;

    @Inject
    public Car(Driver driver, Engine engine, Wheels wheels) {
        this.driver = driver;
        this.engine = engine;
        this.wheels = wheels;
    }

    @Inject
    public void enableRemote(Remote remote) {
        remote.setListener(this);
    }

    public void drive() {
        engine.startEngine();
        Log.d(TAG, "drive: " + driver + " drives " + this);
    }
}
