package com.jeluchu.nightmode

import android.app.Application
import androidx.appcompat.app.AppCompatDelegate

class NightMode : Application(){

    override fun onCreate() {
        super.onCreate()
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.getDefaultNightMode())
    }

}