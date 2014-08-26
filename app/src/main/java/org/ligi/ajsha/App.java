package org.ligi.ajsha;

import android.app.Application;

import org.ligi.ajsha.model.Settings;

public class App extends Application {

    private static Settings settings;

    public static Settings getSettings() {
        return settings;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        settings=new Settings(this);
        Tracker.init(this);
    }
}
