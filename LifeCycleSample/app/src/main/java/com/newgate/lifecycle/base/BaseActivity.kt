package com.newgate.basekotlinmvvm.base.di

import android.support.v7.app.AppCompatActivity
import com.newgate.lifecycle.NavigationManager

/**
 * Created by apple on 9/9/17.
 */
open class BaseActivity: AppCompatActivity() {

    val navigation: NavigationManager by lazy {
        NavigationManager(this)
    }

    override fun onBackPressed() {
        if(navigation.isRoot()) {
            finish()
        } else {
            super.onBackPressed()
        }
    }
}