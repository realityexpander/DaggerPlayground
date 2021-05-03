package com.example.daggerplayground;

import android.app.Application;

import com.example.daggerplayground.DI.ActivityComponent;
import com.example.daggerplayground.DI.AppComponent;
import com.example.daggerplayground.DI.DaggerAppComponent;

public class ExampleApp extends Application {

    private AppComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerAppComponent.create();
    }

    public AppComponent getAppComponent() {
        return component;
    }
}
