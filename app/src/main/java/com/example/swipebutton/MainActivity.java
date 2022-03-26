package com.example.swipebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Swipe_button swipe_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        swipe_button=findViewById(R.id.swipe_btn);

        swipe_button.setOnStateChangeListener(new OnStateChangeListener() {
            @Override
            public void onStateChange(boolean active) {
                Intent intent=new Intent(MainActivity.this,NextActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}