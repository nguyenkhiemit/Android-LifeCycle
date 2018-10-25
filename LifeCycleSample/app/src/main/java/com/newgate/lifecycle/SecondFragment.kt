package com.newgate.lifecycle

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.newgate.basekotlinmvvm.base.view.BaseFragment
import kotlinx.android.synthetic.main.fragment_second.view.*

class SecondFragment: BaseFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var view = inflater!!.inflate(R.layout.fragment_second, container, false)
        view.backButton.setOnClickListener {
            navigation.onBack()
        }
        return view
    }

}