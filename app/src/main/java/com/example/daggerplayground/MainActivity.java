package com.example.daggerplayground;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.daggerplayground.DI.CarComponent;
import com.example.daggerplayground.DI.DaggerCarComponent;
import com.example.daggerplayground.DI.DieselEngineModule;
import com.example.daggerplayground.car.Car;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    Car car1, car2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        CarComponent component = DaggerCarComponent.create(); // only for components that take no parameters
        CarComponent component = DaggerCarComponent.builder()  // @Singleton only works within the same component, if another component is created, another set of singletons are created
//                .dieselEngineModule(new DieselEngineModule(500) ) // must use the builder to include parameters
                .horsePower(500)
                .cylinders(6) // for PetrolEngine
                .build();
        component.inject(this);

        car1.drive();
        car2.drive();
    }
}