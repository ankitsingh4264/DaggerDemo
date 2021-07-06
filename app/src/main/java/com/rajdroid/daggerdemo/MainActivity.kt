package com.rajdroid.daggerdemo

import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.rajdroid.daggerdemo.viewModel.ViewModelProviderFactory
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.time.LocalDate
import javax.inject.Inject


class MainActivity : DaggerAppCompatActivity() {
    private val TAG = "ankit"

   

    @Inject
    lateinit var providerFactory: ViewModelProviderFactory

    lateinit var mainActivityViewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainActivityViewModel = ViewModelProviders.of(this, providerFactory).get(MainActivityViewModel::class.java)

        btnsearch.setOnClickListener {
            val name=tv_search.text.toString()
            Log.d(TAG, "onCreate: $name")

            mainActivityViewModel.getUser(name);
            mainActivityViewModel.data.observe(this, Observer {
                Log.i(TAG, "onCreate: $it")
            })
        }
        
       






    }


}