package com.ms.koin.injections

import android.content.res.Resources
import com.ms.koin.KoinApp
import com.ms.koin.interfaces.IViewModelToActivityFactory
import com.ms.koin.model.factory.PreferenceManager
import com.ms.koin.utils.ViewModelToActivityFactory
import org.koin.android.ext.koin.androidApplication
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module


val appViewModelModule = module {
    //api, preference and database dependency

    //Resource
    single<Resources> {
        androidContext().resources
    }

    factory {

    }

    // Dependency: PreferenceManger
    single {
        PreferenceManager(get(), get())//it will take one argument i.e SharePreference from BaseAppModule.kt
    }


    single {
        (androidApplication() as KoinApp).mLifecycleCallbacks?.getActivity()
    }


    single {
        ViewModelToActivityFactory(get()) as IViewModelToActivityFactory
    }


}
