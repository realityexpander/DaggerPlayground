package com.example.daggerplayground.DI;

import com.example.daggerplayground.car.Engine;
import com.example.daggerplayground.car.PetrolEngine;

import dagger.Binds;
import dagger.Module;

// using @Provides

//@Module
//public class PetrolEngineModule {
//
//    @Provides
//    static Engine provideEngine(PetrolEngine engine) { // ok to use static, bc no need to instantiate PetrolEngineModule object
//        return engine;
//    }
//
//    // alternative works the same
////    @Provides
////    static Engine provideEngine() {       // ok to use static, bc no need to instantiate PetrolEngineModule object
////        Engine engine = new PetrolEngine(); // Tires is a 3rd party library, so we have to "Provide" it indirectly
////        return engine;
////    }
//}



// Using @Binds

@Module
public abstract class PetrolEngineModule {

    @Binds
    abstract Engine bindEngine(PetrolEngine engine);  // alternative to the @Provides (above), Dagger instantiates the PetrolEngine directly under the hood
                                                      // method signature accepts only a SINGLE implementation (PetrolEngine) of the interface (Engine)

    // NOTE: Can also add 'static' @Provides within this abstract class
}