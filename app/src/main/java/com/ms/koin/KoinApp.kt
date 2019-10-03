package com.ms.koin

import android.app.Application
import com.ms.koin.injections.appModule
import com.ms.koin.injections.appViewModelModule
import com.ms.koin.injections.databaseModule
import com.ms.koin.interfaces.IAppLifeCycleCallback
import com.ms.koin.utils.ApplicationLifecycleCallbacks
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidFileProperties
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin


class KoinApp : Application(){

    var mLifecycleCallbacks: IAppLifeCycleCallback? = null

    override fun onCreate() {
        super.onCreate()
        instance = this
        initializeTimber()
        initializeKoin()
        mLifecycleCallbacks = ApplicationLifecycleCallbacks()
        registerActivityLifecycleCallbacks(mLifecycleCallbacks);
    }

    override fun onTerminate() {
        super.onTerminate()
        if (instance != null) {

            if (mLifecycleCallbacks != null) {
                unregisterActivityLifecycleCallbacks(mLifecycleCallbacks);
                mLifecycleCallbacks = null;
            }

            instance = null
        }
    }

    companion object {
        var instance: KoinApp? = null
    }

    private fun initializeTimber() {
//        if (BuildConfig.DEBUG) {
//            Timber.plant(Timber.DebugTree())
//        }
    }

    private fun initializeKoin() {
        startKoin {
            androidContext(this@KoinApp)
            androidLogger()
            androidFileProperties()
            modules(listOf(appModule,databaseModule,appViewModelModule))
        }
    }
}