package com.example.measureme;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import com.example.measureme.Bluetooth;

public class MainActivity extends Activity {
	
	private BluetoothAdapter bluetooth = null;
	private ConnectThread mConnectThread;
	private ConnectedThread mConnectedThread;
	public static final int MESSAGE_READ = 1;
	public static final int MESSAGE_DEVICE_NAME = 2;
	public static final int MESSAGE_TOAST = 3;
	public static final String TOAST = "toast";
	private static UUID uuid = UUID.fromString("00001101-0000-1000-8000-00805F9B34FB");
	private static final String TAG = "MainActivity";
	private String connectedDeviceName = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
