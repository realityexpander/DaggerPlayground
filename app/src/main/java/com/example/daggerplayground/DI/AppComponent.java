package com.example.daggerplayground.DI;

import com.example.daggerplayground.car.Driver;

import javax.inject.Singleton;

import dagger.Component;

@Singleton // same scope as Driver (Singleton, which is Application scope)
@Component(modules = DriverModule.class) // Uses a module, bc we don't have direct access to a Driver class to use @Inject on it
public interface AppComponent {
    ActivityComponent getActivityComponent(DieselEngineModule dieselEngineModule); // must pass modules that are not abstract and dont have a default constructor
}
