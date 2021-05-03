package com.example.daggerplayground.DI;

import com.example.daggerplayground.car.Driver;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class DriverModule {

    @Provides
    @Singleton // Application Scope is same as Singleton
    static Driver provideDriver() {
        return new Driver();
    }

}
