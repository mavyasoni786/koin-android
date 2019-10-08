package com.ms.koin

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ms.koin.mvp.MVPActivity
import com.ms.koin.mvp.presenter.MvpPresenterImp
import com.ms.koin.mvp.view.MvpView
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.ext.android.inject
import org.koin.core.parameter.parametersOf

class MainActivity : AppCompatActivity(), MvpView {

    private val mMvpPresenter : MvpPresenterImp by inject { parametersOf(this) }

    override fun loginSuccess() {

    }

    override fun displayToast(message: String?) {


    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnMVP.setOnClickListener {
            startActivity(Intent(this@MainActivity, MVPActivity::class.java))
        }


        mMvpPresenter.mArrayList.add("MainActivity")

    }
}
