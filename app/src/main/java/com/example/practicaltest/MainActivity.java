package com.example.practicaltest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnyellow, btnred, btngreen;
    TextView text;
    RelativeLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnyellow = findViewById(R.id.btnYellow);
        btnred = findViewById(R.id.btnRed);
        btngreen = findViewById(R.id.btnGreen);
        text = findViewById(R.id.Text);
        layout = findViewById(R.id.activity_main);

        btnyellow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                layout.setBackgroundColor(Color.YELLOW);
                text.setText(R.string.yellow_text);

            }
        });

        btnred.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout.setBackgroundColor(Color.RED);
                text.setText(R.string.red_text);
            }
        });
        btngreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout.setBackgroundColor(Color.GREEN);
                text.setText(R.string.green_text);

            }
        });
    }

}