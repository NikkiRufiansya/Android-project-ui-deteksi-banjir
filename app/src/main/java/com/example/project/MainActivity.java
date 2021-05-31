package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private SeekBar seekbar;
    private ProgressBar progressBar;
    private TextView persentase;
    private int value = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        seekbar = findViewById(R.id.simpleSeekBar);
        progressBar = findViewById(R.id.progressBar);
        persentase = findViewById(R.id.persentase);
        seekbar.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                return true;
            }
        });

        //set value level air
        seekbar.setMax(200);
        seekbar.setProgress(120);

        //set value level energi
        progressBar.setMax(100);
        progressBar.setProgress(48);
        value = progressBar.getProgress();
        persentase.setText(String.valueOf(value)+"%");

    }
}