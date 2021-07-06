package com.rajdroid.daggerdemo

import android.app.Application
import com.rajdroid.daggerdemo.di.DaggerRetroComponent

class MyApplication : Application() {
    lateinit var daggerRetroComponent: DaggerRetroComponent
    override fun onCreate() {
        super.onCreate()

    }
}