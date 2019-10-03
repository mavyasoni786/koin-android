package com.ms.koin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.ms.koin.interfaces.IViewModelToActivityFactory
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {
    val presenter : IViewModelToActivityFactory by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Handler().postDelayed({
            presenter.finish()
        },5000)

    }
}
