package com.ms.koin.mvp.injections

import com.ms.koin.mvp.presenter.MvpPresenterImp
import com.ms.koin.mvp.view.MvpView
import org.koin.dsl.module

val mvpModule = module {
    //factory : It will create new object every time when we are injecting it in any class

//    factory { (view: MvpView) ->
//        MvpPresenterImp(view)
//    }


// single : Single is used like Singleton class

    single { (view: MvpView) ->
        MvpPresenterImp(view)
    }

}
