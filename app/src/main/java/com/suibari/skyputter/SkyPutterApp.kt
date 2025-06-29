package com.suibari.skyputter

import android.app.Application
import com.suibari.skyputter.util.SessionManager

open class SkyPutterApp : Application() {
    override fun onCreate() {
        super.onCreate()
        SessionManager.initialize(this)
    }
}