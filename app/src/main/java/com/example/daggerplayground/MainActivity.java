package com.example.daggerplayground;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.daggerplayground.DI.ActivityComponent;
import com.example.daggerplayground.DI.DieselEngineModule;
import com.example.daggerplayground.DI.PetrolEngineModule;
import com.example.daggerplayground.car.Car;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    Car car1, car2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityComponent component = ((ExampleApp) getApplication()).getAppComponent()
                .getActivityComponent(new DieselEngineModule(500));
        component.inject(this);

        car1.drive();
        car2.drive();
    }
}