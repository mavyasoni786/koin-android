package com.ms.koin.injections

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import com.ms.koin.interfaces.IAppLifeCycleCallback
import com.ms.koin.utils.ApplicationLifecycleCallbacks
import org.koin.android.ext.koin.androidContext
import org.koin.core.qualifier.named
import org.koin.dsl.module

val appModule = module {
    /*Provides shared preference instance*/
    single<SharedPreferences> {
        androidContext().getSharedPreferences(getProperty("name"), Context.MODE_PRIVATE)
    }

//    scope(named<AppCompatActivity>()) {
//        scoped {
//            ApplicationLifecycleCallbacks() as IAppLifeCycleCallback
//        }
//    }





}
