package com.hackerli.girl.app;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/**
 * Created by CoXier on 2016/5/21.
 */
public class LifecycleHandler implements Application.ActivityLifecycleCallbacks {
    private static int started = 0;

    @Override
    public void onActivityCreated(Activity activity, Bundle savedInstanceState) {

    }

    @Override
    public void onActivityStarted(Activity activity) {
        started++;
    }

    @Override
    public void onActivityResumed(Activity activity) {

    }

    @Override
    public void onActivityPaused(Activity activity) {

    }

    @Override
    public void onActivityStopped(Activity activity) {
    }

    @Override
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {

    }

    @Override
    public void onActivityDestroyed(Activity activity) {

    }

    public static boolean isBackground() {
        if (started != 0)
            return true;
        return false;
    }
}
