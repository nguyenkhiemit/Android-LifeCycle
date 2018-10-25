package com.newgate.lifecycle

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.newgate.basekotlinmvvm.base.view.BaseFragment
import kotlinx.android.synthetic.main.fragment_second.view.*

class SecondFragment: BaseFragment() {

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        Log.e("LifeCycle SecondFragment:", "onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("LifeCycle SecondFragment:", "onCreate")
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var view = inflater!!.inflate(R.layout.fragment_second, container, false)
        view.backButton.setOnClickListener {
            navigation.onBack()
        }
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.e("LifeCycle SecondFragment:", "onActivityCreated")
    }

    override fun onStart() {
        super.onStart()
        Log.e("LifeCycle SecondFragment:", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.e("LifeCycle SecondFragment:", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.e("LifeCycle SecondFragment:", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.e("LifeCycle SecondFragment:", "onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.e("LifeCycle SecondFragment:", "onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("LifeCycle SecondFragment:", "onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.e("LifeCycle SecondFragment:", "onDetach")
    }
}