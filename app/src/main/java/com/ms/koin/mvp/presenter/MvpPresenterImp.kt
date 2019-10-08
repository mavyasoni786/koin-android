package com.ms.koin.mvp.presenter

import android.text.TextUtils
import android.util.Log
import android.util.Patterns
import com.ms.koin.mvp.view.MvpView


class MvpPresenterImp(private val mMvpView: MvpView) : MvpPresenter {



    val mArrayList = ArrayList<String>()


    override fun login(email: String?, password: String?) {
        if (checkValidation(email, password) == false) {
            mMvpView.loginSuccess()
        }
    }

    override fun checkValidation(email: String?, password: String?): Boolean? {
        return when {
            email?.isNotEmpty() == false -> {
                mMvpView.displayToast("Please enter a email")
                false
            }
            !isValidEmail(email) -> {
                mMvpView.displayToast("Please enter a valid email")
                false
            }
            password?.isNotEmpty() == false -> {
                mMvpView.displayToast("Please enter a password")
                false
            }
            else -> {
                mMvpView.loginSuccess()
                true
            }
        }

    }


    private fun isValidEmail(target: CharSequence?): Boolean {
        return !TextUtils.isEmpty(target) && Patterns.EMAIL_ADDRESS.matcher(target).matches()
    }


}