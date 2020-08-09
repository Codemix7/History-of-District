package com.codemix.history_of_64_districts;

import android.app.Application;

import com.onesignal.OneSignal;

public class app extends Application {
    @Override
    public void onCreate( ) {
        super.onCreate();

        // OneSignal Initialization
        OneSignal.startInit(this)
                .inFocusDisplaying(OneSignal.OSInFocusDisplayOption.Notification)
                .unsubscribeWhenNotificationsAreDisabled(true)
                .init();
    }
}
