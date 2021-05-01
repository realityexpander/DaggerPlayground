package com.example.daggerplayground.DI;

import com.example.daggerplayground.MainActivity;
import com.example.daggerplayground.car.Car;

import dagger.Component;

@Component(modules = {WheelsModule.class, PetrolEngineModule.class  /* or */ /* DieselEngineModule.class */ })  // @Component defines the "modules" where to find the "@Provides" for the libraries that we don't have direct access to source-code.
public interface CarComponent {

    Car getCar();

    void inject(MainActivity mainActivity);
}
