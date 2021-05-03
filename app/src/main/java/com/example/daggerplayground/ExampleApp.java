package com.example.daggerplayground;

import android.app.Application;

import com.example.daggerplayground.DI.CarComponent;
import com.example.daggerplayground.DI.DaggerCarComponent;

public class ExampleApp extends Application {

    private CarComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerCarComponent.builder()
                .horsePower(1500)
                .cylinders(8)
                .build();
    }

    public CarComponent getAppComponent() {
        return component;
    }
}
