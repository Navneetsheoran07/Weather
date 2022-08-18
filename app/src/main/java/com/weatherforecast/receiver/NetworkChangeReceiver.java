package com.weatherforecast.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public abstract class NetworkChangeReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        onNetworkChange();
    }

    public abstract void onNetworkChange();
}