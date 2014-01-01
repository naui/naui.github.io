package com.test.watchclip;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.*;
import android.app.*;
import android.util.Log;
import android.widget.Toast;
import java.util.Timer;
import java.util.TimerTask;

public class PrimaryService extends Service
{
   private static Timer timer = new Timer();

   private Context ctx;

   public IBinder onBind(Intent arg0)
   {
      return null;
   }

   @Override
   public void onCreate()
   {
      super.onCreate();
      ctx = this;
      startService();
   }

   private void startService()
   {
      timer.scheduleAtFixedRate(new mainTask(), 0, 5000);
   }

   @Override
   public void onStart(Intent intent, int startId)
   {
      Toast.makeText(this, "My Service Started", Toast.LENGTH_LONG).show();
   }

   @Override
   public void onDestroy()
   {
      Toast.makeText(this, "Service Stopped ...", Toast.LENGTH_SHORT).show();
   }

   private class mainTask extends TimerTask
   {
      public void run()
      {
         toastHandler.sendEmptyMessage(0);
      }
   }

   private final Handler toastHandler = new Handler()
   {
      @Override
      public void handleMessage(Message msg)
      {
         Toast.makeText(getApplicationContext(), "test", Toast.LENGTH_SHORT).show();
      }
   };
}