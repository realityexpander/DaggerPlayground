package com.example.daggerplayground.DI;

import com.example.daggerplayground.car.DieselEngine;
import com.example.daggerplayground.car.Engine;

import dagger.Module;
import dagger.Provides;


// using @Provides

@Module
public class DieselEngineModule {

    @Provides
    Engine provideEngine(DieselEngine engine) { // ok to use static, bc no need to instantiate DieselEngineModule object
        return engine;
    }

    // alternative works the same
//    @Provides
//    static Engine provideEngine() {       // ok to use static, bc no need to instantiate DieselEngineModule object
//        Engine engine = new DieselEngine(); // Tires is a 3rd party library, so we have to "Provide" it indirectly
//        return engine;
//    }
}



// using @Binds

//@Module
//public abstract class DieselEngineModule {
//
//    @Binds
//    abstract Engine bindEngine(DieselEngine engine);  // alternative to the @Provides (above), Dagger instantiates the PetrolEngine directly under the hood
//    // method signature accepts only a SINGLE implementation (DieselEngine) of the interface (Engine)
//
//    // NOTE: Can also add 'static' @Provides within this abstract class
//}