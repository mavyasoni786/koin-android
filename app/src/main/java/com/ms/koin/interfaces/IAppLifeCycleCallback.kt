package com.ms.koin.interfaces

import android.app.Application
import androidx.appcompat.app.AppCompatActivity

interface IAppLifeCycleCallback : Application.ActivityLifecycleCallbacks {

    fun getActivity(): AppCompatActivity
}