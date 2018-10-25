package com.newgate.basekotlinmvvm.base.view

import android.support.v4.app.Fragment
import com.newgate.basekotlinmvvm.base.di.BaseActivity
import com.newgate.lifecycle.NavigationManager

/**
 * Created by apple on 9/9/17.
 */
open abstract class BaseFragment: Fragment() {

    val navigation: NavigationManager by lazy {
        NavigationManager(activity)
    }

    protected val activity: BaseActivity
        get() = getActivity() as BaseActivity
}