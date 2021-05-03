package com.example.daggerplayground.DI;

import com.example.daggerplayground.MainActivity;
import com.example.daggerplayground.car.Car;
import com.example.daggerplayground.car.Driver;

import javax.inject.Named;

import dagger.BindsInstance;
import dagger.Component;
import dagger.Subcomponent;

@PerActivity // (was Singleton), this PerActivity only retains objects for the Activity, it does not survive configuration changes
             // If any module objects has been marked as Singleton, the component must be marked as a Singleton as well (even though not every Provided object is a singleton)
@Subcomponent(modules = { WheelsModule.class, /* PetrolEngineModule.class */  /* or */ DieselEngineModule.class })  // @Component defines the "modules" where to find the "@Provides" for the libraries that we don't have direct access to source-code.
public interface ActivityComponent {

    Car getCar();

    void inject(MainActivity mainActivity);

//    @Component.Builder
//    interface Builder {
//
//        @BindsInstance
//        Builder horsePower(@Named("horsePower") int horsePower);        // parameter is passed into a @Provide object (PetrolEngine)
//
//        @BindsInstance
//        Builder cylinders(@Named("cylinders") int cylinders);           // parameter is passed into a @Provide object (PetrolEngine)
//
//        Builder appComponent(AppComponent component);
//
//        ActivityComponent build();
//
//    }
}
