package com.ms.koin.utils

import android.app.Activity
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ms.koin.interfaces.IAppLifeCycleCallback


class ApplicationLifecycleCallbacks : IAppLifeCycleCallback {

    private var activity: Activity? = null

    override fun getActivity(): AppCompatActivity {
        return activity as AppCompatActivity
    }

    override fun onActivityPaused(activity: Activity?) {
        if (this.activity === activity) {
            this.activity = null
        }
    }

    override fun onActivityResumed(activity: Activity?) {
        this.activity = activity
    }

    override fun onActivityStarted(activity: Activity?) {
        this.activity = activity
    }

    override fun onActivityDestroyed(activity: Activity?) {
        if (this.activity === activity) {
            this.activity = null
        }
    }

    override fun onActivitySaveInstanceState(activity: Activity?, outState: Bundle?) {
        this.activity = activity
    }

    override fun onActivityStopped(activity: Activity?) {
        if (this.activity === activity) {
            this.activity = null
        }
    }

    override fun onActivityCreated(activity: Activity?, savedInstanceState: Bundle?) {
        this.activity = activity
    }


}