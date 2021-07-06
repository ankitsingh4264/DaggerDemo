package com.rajdroid.daggerdemo

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import com.rajdroid.daggerdemo.di.RetroComponent
import com.rajdroid.daggerdemo.di.RetroServiceInterface
import dagger.android.AndroidInjection.inject
import dagger.android.support.AndroidSupportInjection.inject
import dagger.android.support.DaggerAppCompatActivity

class MainActivityViewModel : ViewModel(){
    var retroComponent: RetroComponent =
}