   package com.example.stopwatch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Chronometer;

public class MainActivity extends AppCompatActivity {
    private Chronometer Chronometer;
    private long pauseoffset;
    private boolean running;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Chronometer = findViewById(R.id.chr);
    }
    public void Startchr (View V)
    {
        if(!running){
                Chronometer.setBase(SystemClock.elapsedRealtime()-pauseoffset);
                 Chronometer.start();
                 running = true;

    }
}
public void Pausechr (View V){
    if(running){
        Chronometer.stop();
        pauseoffset= SystemClock.elapsedRealtime()-Chronometer.getBase();
        running=false;
    }

    }
    public void Resetchr(View v){
        Chronometer.setBase(SystemClock.elapsedRealtime());
        pauseoffset=0;
    }
}