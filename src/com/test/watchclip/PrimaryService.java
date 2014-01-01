package com.test.watchclip;

import android.content.Intent;
import android.os.*;
import android.app.*;
import android.util.Log;
import android.widget.Toast;
import java.util.Timer;
import java.util.TimerTask;

public class PrimaryService extends Service
{
   public IBinder onBind(Intent arg0)
   {
      return null;
   }

   @Override
   public void onCreate()
   {
      super.onCreate();
      Toast.makeText(this, "Congrats! MyService Created", Toast.LENGTH_LONG).show();
      MyTimerTask myTask = new MyTimerTask();
      Timer myTimer = new Timer();
      myTimer.schedule(myTask, 3000, 1500);
   }

   class MyTimerTask extends TimerTask
   {
      public void run()
      {
          Activity_name.this.runOnUiThread(new Runnable() {
      @Override
      public void run() {
        Toast.makeText(Activity_name.this,
                  getResources().getString(R.string.st_toast_msg_stopped),
                  Toast.LENGTH_LONG).show();
      }
    });
      }
   }
   


   @Override
   public void onStart(Intent intent, int startId)
   {
      Toast.makeText(this, "My Service Started", Toast.LENGTH_LONG).show();
   }

   @Override
   public void onDestroy()
   {
      Toast.makeText(this, "MyService Stopped", Toast.LENGTH_LONG).show();
   }
}