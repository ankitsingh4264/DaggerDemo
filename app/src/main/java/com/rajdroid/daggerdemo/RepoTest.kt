package com.rajdroid.daggerdemo

import android.app.Application
import android.widget.Toast
import javax.inject.Inject

class RepoTest  @Inject  constructor(
    val application: Application
) {
    //imlementation of repository

    fun getTest(){
        Toast.makeText(application,"test for rajiv",Toast.LENGTH_SHORT).show()
    }
}