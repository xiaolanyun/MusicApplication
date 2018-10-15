package com.example.a24075.musicapplication;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

public class MusicService extends Service {
    private MediaPlayer player;
    public IBinder onBind(Intent age0){
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }
    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        player = MediaPlayer.create(this,R.raw.test);
        player.start();
        return super.onStartCommand(intent, flags, startId);
    }
    public  void onDestroy(){
        super.onDestroy();

        player.stop();

    }

}
