package com.test.watchclip;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Simple receiver that will handle the boot completed intent and send the intent to 
 * launch the BootDemoService.
 * @author BMB
 *
 */
public class ClipWatcherReceiver extends BroadcastReceiver {
 @Override
 public void onReceive(final Context context, final Intent bootintent) {
  Intent mServiceIntent = new Intent();
mServiceIntent.setAction("com.test.watchclip.PrimaryService");
  context.startService(mServiceIntent);
 }
}