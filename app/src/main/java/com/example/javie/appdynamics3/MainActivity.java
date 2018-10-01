package com.example.javie.appdynamics3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.appdynamics.eumagent.runtime.Instrumentation;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Instrumentation.start("AD-AAB-AAM-JTN", getApplicationContext());

        setContentView(R.layout.activity_main);
    }
}
