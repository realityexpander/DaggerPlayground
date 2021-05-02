package com.example.daggerplayground.DI;

import com.example.daggerplayground.MainActivity;
import com.example.daggerplayground.car.Car;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;

@Component(modules = {WheelsModule.class, PetrolEngineModule.class  /* or */ /* DieselEngineModule.class */ })  // @Component defines the "modules" where to find the "@Provides" for the libraries that we don't have direct access to source-code.
public interface CarComponent {

    Car getCar();

    void inject(MainActivity mainActivity);

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder horsePower(@Named("horsePower") int horsePower);        // parameter is passed into a @Provide object (PetrolEngine)

        @BindsInstance
        Builder cylinders(@Named("cylinders") int cylinders);           // parameter is passed into a @Provide object (PetrolEngine)

        CarComponent build();

    }
}
