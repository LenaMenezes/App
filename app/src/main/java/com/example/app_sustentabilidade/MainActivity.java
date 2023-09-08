package com.example.app_sustentabilidade;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    final Thread timer = new Thread() {
        public void run() {
            try {
                sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                Intent openingSplash = new Intent(this, home.class);
                startActivity(openingSplash);
            }
        }
    };
        timer.sta   rt();

}