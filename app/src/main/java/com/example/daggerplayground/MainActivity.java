package com.example.daggerplayground;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.daggerplayground.DI.ActivityComponent;
import com.example.daggerplayground.DI.DaggerActivityComponent;
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
        ActivityComponent component = DaggerActivityComponent.builder()
                .horsePower(500)
                .cylinders(8)
                .appComponent( ( (ExampleApp) getApplication()).getAppComponent() )
                .build();
        component.inject(this);

        car1.drive();
        car2.drive();
    }
}