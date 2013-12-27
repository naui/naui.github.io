package com.napp.clipwatcher;

import android.webkit.URLUtil;
import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import android.content.*;

/** Created by BrightMIDE*/
public class ClipWatcherService extends Service
{  
	public IBinder onBind(Intent arg0)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void onStart(Intent intent, int startId) {
		// TODO Auto-generated method stub
		super.onStart(intent, startId);
	}

	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
	}

    @Override
    public void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
		package com.napp.clipwatcher;

		import android.webkit.URLUtil;
		import android.app.*;
		import android.os.*;
		import android.view.*;
		import android.widget.*;
		import android.content.*;

	/** Created by BrightMIDE*/
	public class MainActivity extends Service
	{  
		public IBinder onBind(Intent arg0)
		{
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void onStart(Intent intent, int startId) {
			// TODO Auto-generated method stub
			super.onStart(intent, startId);
		}

		@Override
		public void onDestroy() {
			// TODO Auto-generated method stub
			super.onDestroy();
		}

		@Override
		public void onCreate(Bundle savedInstanceState)
		{
			super.onCreate(savedInstanceState);
			ClipboardManager clipBoard = (ClipboardManager)getSystemService(CLIPBOARD_SERVICE);
			clipBoard.addPrimaryClipChangedListener(new ClipboardListener());
		}

		class ClipboardListener implements ClipboardManager.OnPrimaryClipChangedListener
		{
			public void onPrimaryClipChanged()
			{
				ClipboardManager clipBoard = (ClipboardManager)getSystemService(CLIPBOARD_SERVICE);
				String strCurrentClip = clipBoard.getText().toString();
				if (URLUtil.isValidUrl (strCurrentClip)){
					Toast.makeText(getApplicationContext(), 
								   strCurrentClip , Toast.LENGTH_LONG).show();
				}
			}
		}
	}
}

    class ClipboardListener implements ClipboardManager.OnPrimaryClipChangedListener
	{
		public void onPrimaryClipChanged()
		{
			ClipboardManager clipBoard = (ClipboardManager)getSystemService(CLIPBOARD_SERVICE);
			String strCurrentClip = clipBoard.getText().toString();
			if (URLUtil.isValidUrl (strCurrentClip)){
				Toast.makeText(getApplicationContext(), 
							   strCurrentClip , Toast.LENGTH_LONG).show();
			}
		}
	}
}

