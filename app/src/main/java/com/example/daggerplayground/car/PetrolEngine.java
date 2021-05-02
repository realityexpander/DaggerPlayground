package com.example.daggerplayground.car;


import android.util.Log;
import javax.inject.Inject;
import javax.inject.Named;

public class PetrolEngine implements Engine {
    private static final String TAG = "Car";

    private int horsePower;
    private int cylinders;

    @Inject
    public PetrolEngine(@Named("horsePower") int horsePower,
                        @Named("cylinders") int cylinders) {
        Log.d(TAG, "PetrolEngine: engine created");
        this.horsePower = horsePower;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        Log.d(TAG, "startEngine: PetrolEngine, horsePower =" + horsePower + ", cylinders=" + cylinders);
    }
}
