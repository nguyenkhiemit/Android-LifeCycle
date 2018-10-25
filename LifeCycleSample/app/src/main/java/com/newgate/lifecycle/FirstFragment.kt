package com.newgate.lifecycle

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.newgate.basekotlinmvvm.base.view.BaseFragment
import kotlinx.android.synthetic.main.fragment_first.view.*

class FirstFragment: BaseFragment() {

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        Log.e("LifeCycle FirstFragment:", "onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("LifeCycle FirstFragment:", "onCreate")
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater!!.inflate(R.layout.fragment_first, container, false)
        Log.e("LifeCycle FirstFragment:", "onCreateView")
        view.nextFragButton.setOnClickListener {
            navigation.openFragment(R.id.containerFrame, SecondFragment(), NavigationManager.Type.REPLACE, null)
        }
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.e("LifeCycle FirstFragment:", "onActivityCreated")
    }

    override fun onStart() {
        super.onStart()
        Log.e("LifeCycle FirstFragment:", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.e("LifeCycle FirstFragment:", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.e("LifeCycle FirstFragment:", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.e("LifeCycle FirstFragment:", "onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.e("LifeCycle FirstFragment:", "onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("LifeCycle FirstFragment:", "onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.e("LifeCycle FirstFragment:", "onDetach")
    }

}