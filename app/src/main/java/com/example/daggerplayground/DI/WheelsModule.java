package com.example.daggerplayground.DI;

import com.example.daggerplayground.car.Rims;
import com.example.daggerplayground.car.Tires;
import com.example.daggerplayground.car.Wheels;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class WheelsModule { // if all the methods are static, this Module class should be abstract

    @Provides
    static Rims provideRims() {         // ok to use static, bc no need to instantiate WheelsModule object
        return new Rims(); // Rims is a 3rd party library, so we have to "Provide" it indirectly
    }

    @Provides
    static Tires provideTires() {       // ok to use static, bc no need to instantiate WheelsModule object
        Tires tires = new Tires(); // Tires is a 3rd party library, so we have to "Provide" it indirectly
        tires.inflate(); // we can configure any third party library here
        return tires;
    }

    @Provides
    static Wheels provideWheels(Rims rims, Tires tires) {  // ok to use static, bc no need to instantiate WheelsModule object
        return new Wheels(rims, tires);
    }
}
