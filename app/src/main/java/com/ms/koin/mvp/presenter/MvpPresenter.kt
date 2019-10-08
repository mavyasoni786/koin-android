package com.ms.koin.mvp.presenter

interface MvpPresenter {

    fun login(email: String?,password:String?)

    fun checkValidation(email: String?,password:String?) : Boolean?

}