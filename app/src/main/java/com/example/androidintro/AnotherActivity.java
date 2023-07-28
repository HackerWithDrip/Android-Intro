package com.example.androidintro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class AnotherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);
    }

    public void onLogInoClicked(View view) {
        Log.i("Custom Tag","Message to the Log.");

        for(int z = 0; z<5;z++){
            Log.d("Debugging","z = " + z);
            Log.i("Custom Tag","Message to the Log # " + z);
        }

        // Just testing git
    }
}