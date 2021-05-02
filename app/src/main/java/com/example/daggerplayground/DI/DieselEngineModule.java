package com.example.daggerplayground.DI;

import com.example.daggerplayground.car.DieselEngine;
import com.example.daggerplayground.car.Engine;

import dagger.Module;
import dagger.Provides;


// using @Provides

@Module
public class DieselEngineModule {

    private int horsePower;

    public DieselEngineModule(int horsePower) {
        this.horsePower = horsePower;
    }

    @Provides
    Engine provideEngine(DieselEngine engine) { // ok to use static, bc no need to instantiate DieselEngineModule object; also horsePower is provided below
        return engine;
    }

////     Works the same as above, but allows parameters to be passed in to the engine (horsePower)
//    @Provides
//    Engine provideEngine() {       // cant be static, bc it depends on a object instance var (horsePower), also no need to provide the engine, since we are instantiating the engine here
//        Engine engine = new DieselEngine(this.horsePower);     // DieselEngine is a 3rd party library, so we have to "Provide" it indirectly
//        return engine;
//    }

    @Provides
    int provideHorsePower() {
        return this.horsePower;
    }
}



// using @Binds (shortcut to provide implementation of the interface)

//@Module
//public abstract class DieselEngineModule {
//
//    @Binds
//    abstract Engine bindEngine(DieselEngine engine);  // alternative to the @Provides (above), Dagger instantiates the PetrolEngine directly under the hood
//    // method signature accepts only a SINGLE implementation (DieselEngine) of the interface (Engine)
//
//    // NOTE: Can also add 'static' @Provides within this abstract class for other objects
//}