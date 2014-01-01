package com.test.watchclip;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class ClipWatcherReceiver extends BroadcastReceiver
{
    @Override
    public void onReceive(Context context, Intent intent) 
    {
            Toast.makeText(context, "Booooooot", Toast.LENGTH_SHORT).show();

    }
}
}