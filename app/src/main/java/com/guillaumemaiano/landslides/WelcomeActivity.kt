package com.guillaumemaiano.landslides

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.guillaumemaiano.landslides.Modules.GlobalLandslidesApiManager

class WelcomeActivity : AppCompatActivity() {

    val landslidesApiMgr = GlobalLandslidesApiManager(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        landslidesApiMgr.test()
    }
}
