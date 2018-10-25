package com.newgate.lifecycle

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        Log.e("LifeCycle SecondActivity:", "onCreate")
        backButton.setOnClickListener {
            finish()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.e("LifeCycle SecondActivity:", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.e("LifeCycle SecondActivity:", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.e("LifeCycle SecondActivity:", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.e("LifeCycle SecondActivity:", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("LifeCycle SecondActivity:", "onDestroy")
    }
}
