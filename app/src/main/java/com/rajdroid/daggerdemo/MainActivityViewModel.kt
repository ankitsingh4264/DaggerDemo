package com.rajdroid.daggerdemo

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import com.rajdroid.daggerdemo.di.RetroComponent
import com.rajdroid.daggerdemo.di.RetroServiceInterface
import javax.inject.Inject


class MainActivityViewModel @Inject constructor(val retroServiceInterface: RetroServiceInterface) : ViewModel(){

    init {
        Log.d("ankit","View Mode working")
    }


}