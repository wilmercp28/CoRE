package com.example.core

import android.os.Build
import android.view.View
import android.view.WindowInsetsController
import com.google.androidgamesdk.GameActivity

class MainActivity : GameActivity() {
    companion object {
        init {
            System.loadLibrary("core")
        }
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if (hasFocus) {
            hideSystemUi()
        }
    }


    private fun hideSystemUi() {
        val controller = window.decorView.windowInsetsController
        controller?.hide(WindowInsetsController.BEHAVIOR_DEFAULT)
    }
}