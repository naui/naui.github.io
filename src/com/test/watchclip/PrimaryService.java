package com.test.watchclip;

import android.content.Intent;
import android.os.*;
import android.app.*;
import android.util.Log;
import android.widget.Toast;
 
public class PrimaryService extends Service{
    public IBinder onBind(Intent arg0) {
        return null;
    }
 
    @Override
    public void onCreate() {
        super.onCreate();
        Toast.makeText(this, "Congrats! MyService Created", Toast.LENGTH_LONG).show();
        MyTimerTask myTask = new MyTimerTask();
        Timer myTimer = new Timer();
        myTimer.schedule(myTask, 3000, 1500);  
    }
 class MyTimerTask extends TimerTask {
	  public void run() {
Toast.makeText(this, "My Service timer", Toast.LENGTH_LONG).show();
	  }
	}
    @Override
    public void onStart(Intent intent, int startId) {
        Toast.makeText(this, "My Service Started", Toast.LENGTH_LONG).show();
        Log.d(TAG, "onStart");    
    }
 
    @Override
    public void onDestroy() {
        Toast.makeText(this, "MyService Stopped", Toast.LENGTH_LONG).show();
        Log.d(TAG, "onDestroy");
    }
}