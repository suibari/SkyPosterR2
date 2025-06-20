package com.suibari.skyposter

import android.app.Application
import com.suibari.skyposter.util.SessionManager

class SkyPosterApp : Application() {
    override fun onCreate() {
        super.onCreate()
        SessionManager.initialize(this)
        scheduleNotificationWorker(this)
    }
}