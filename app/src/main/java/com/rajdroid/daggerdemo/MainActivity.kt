package com.rajdroid.daggerdemo

import android.app.Application
import android.content.Context
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.lifecycle.lifecycleScope
import com.rajdroid.daggerdemo.viewModel.ViewModelProviderFactory
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.launch
import java.time.LocalDate
import javax.inject.Inject
import javax.inject.Named


class MainActivity : DaggerAppCompatActivity() {
    private val TAG = "ankit"

   

    @Inject
    lateinit var providerFactory: ViewModelProviderFactory

    @Inject
    lateinit var app:Application


    lateinit var mainActivityViewModel: MainActivityViewModel
    
//    @Inject
//    lateinit var string: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        Log.d(TAG, "onCreate: $string")
//
//        val app=Application()
          Toast.makeText(app,"a",Toast.LENGTH_SHORT).show()

        mainActivityViewModel = ViewModelProvider(this, providerFactory).get(MainActivityViewModel::class.java)

        btnsearch.setOnClickListener {
            val name=tv_search.text.toString()
            Log.d(TAG, "onCreate: $name")

           lifecycleScope.launch {
               val res=  mainActivityViewModel.getUser(name);
               Log.i(TAG, "onCreate: $res")
//               mainActivityViewModel.data.observe(this, Observer {
//                   Log.i(TAG, "onCreate: $it")
//               })
           }
        }

        
       






    }


}