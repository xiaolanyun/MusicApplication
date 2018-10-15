package com.example.a24075.musicapplication;

import android.content.Intent;
import android.sax.StartElementListener;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button  start = null;
    private Button  stop = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        start = findViewById(R.id.start);
        start.setOnClickListener(new StartLinstener());
        stop = findViewById(R.id.stop);
        stop.setOnClickListener(new StopLinstener());
    }
    class StartLinstener implements View.OnClickListener{

        public void onClick(View v){
            Intent intent = new Intent(MainActivity.this,MusicService.class);
            stopService(intent);
            startService(intent);
        }

    }
    class StopLinstener implements View.OnClickListener{

        public void onClick(View v){
            Intent intent = new Intent(MainActivity.this,MusicService.class);
            stopService(intent);

        }
    }

}
