package com.newgate.lifecycle

import android.content.Intent
import android.os.Bundle
import android.util.Log
import com.newgate.basekotlinmvvm.base.di.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.e("LifeCycle MainActivity:", "onCreate")
        nextButton.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
        openDialogButton.setOnClickListener {
            DialogUtils.showAlertDialogExitsApp(this, "Dialog from activity")
        }
        navigation.openFragment(R.id.containerFrame, FirstFragment(), NavigationManager.Type.ADD, null)
    }

    override fun onStart() {
        super.onStart()
        Log.e("LifeCycle MainActivity:", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.e("LifeCycle MainActivity:", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.e("LifeCycle MainActivity:", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.e("LifeCycle MainActivity:", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("LifeCycle MainActivity:", "onDestroy")
    }
}
