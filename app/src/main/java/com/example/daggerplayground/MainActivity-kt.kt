package com.example.daggerplayground

//import android.os.Bundle
//import androidx.appcompat.app.AppCompatActivity
//import com.example.daggerplayground.car.Car
//import com.example.daggerplayground.DI.CarComponent
//import com.example.daggerplayground.DaggerCarComponent
//import javax.inject.Inject

//public class MainActivity extends AppCompatActivity {
//    @Inject
//    Car car;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        CarComponent component = DaggerCarComponent.create();
//
//        component.inject(this);
//        car.drive();
//    }
//}


//public class MainActivity : AppCompatActivity() {
//    @Inject
//    var car: Car? = null
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        val component : CarComponent = DaggerCarComponent.create()
//        component.inject(this)
//
//        car!!.drive()
//    }
//}
