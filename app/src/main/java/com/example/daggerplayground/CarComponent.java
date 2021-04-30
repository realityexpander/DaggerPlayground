package com.example.daggerplayground;

import dagger.Component;

@Component(modules = WheelsModule.class)
public interface CarComponent {

    Car getCar();

    void inject(MainActivity mainActivity);
}
