package com.ms.koin.interfaces

import android.app.Activity
import android.content.Intent
import android.graphics.drawable.Drawable
import android.os.Bundle
import androidx.annotation.DrawableRes
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager

interface IViewModelToActivityFactory {

    fun startActivity(activityClass: Class<out Activity>)

    fun startActivity(intent: Intent)

    fun startActivityWithBundle(activityClass: Class<out Activity>, bundle: Bundle)

    fun startActivityAndFinishThis(activityClass: Class<out Activity>)

    fun finish()

    fun onBackPressed()

    fun getActivity(): AppCompatActivity

    fun getSupportFragmentManager(): FragmentManager

    fun getFragmentManager(): FragmentManager

    fun attachFragment(containerId: Int, isAddToBackStack: Boolean, baseFragment: Fragment)

    fun addFragment(containerId: Int, isAddToBackStack: Boolean, previousFragment: Fragment, fragment: Fragment)

    fun getDrawable(@DrawableRes id: Int): Drawable
}