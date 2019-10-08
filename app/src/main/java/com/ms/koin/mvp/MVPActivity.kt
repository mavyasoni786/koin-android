package com.ms.koin.mvp

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.ms.koin.R
import com.ms.koin.mvp.presenter.MvpPresenterImp
import com.ms.koin.mvp.view.MvpView
import kotlinx.android.synthetic.main.activity_mvp.*
import org.koin.android.ext.android.get

class MVPActivity : AppCompatActivity(), MvpView {

    private val mMvpPresenter:MvpPresenterImp  = get()
//    private val mMvpPresenter : MvpPresenterImp by inject { parametersOf(this) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mvp)
        btnLogin.setOnClickListener {
            val email = edtEmail.text.toString().trim()
            val password = edtPassword.text.toString().trim()
            mMvpPresenter.login(email,password)
        }

        Log.e("TAG","Factory : ${mMvpPresenter.mArrayList.size}")

    }

    override fun loginSuccess() {
        displayToast("loginSuccess")
    }

    override fun displayToast(message: String?) {
        Toast.makeText(this,message,Toast.LENGTH_LONG).show()
    }

}