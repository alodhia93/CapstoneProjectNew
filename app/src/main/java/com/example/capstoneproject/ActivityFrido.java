package com.example.capstoneproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class ActivityFrido extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frido);

        int loading_time = 5000;
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent home = new Intent(ActivityFrido.this, MainActivity.class);
                startActivity(home);
                finish();
            }
        }, loading_time);
    }
}