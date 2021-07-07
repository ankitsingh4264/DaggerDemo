package com.rajdroid.daggerdemo.di

import android.app.Application
import android.content.Context
import android.widget.Toast
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton
import com.rajdroid.daggerdemo.BaseApplication as BaseApplication

@Module
 class RetroModule {

    val baseURL = "https://api.github.com/"
    @Singleton
    @Provides
    fun getRetroServiceInterface(retrofit: Retrofit):RetroServiceInterface {
        return retrofit.create(RetroServiceInterface::class.java)
    }

    @Singleton
    @Provides
    fun getRetroFitInstance(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(baseURL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
//    @Provides
//    @Singleton
//    fun provideContext(application: BaseApplication):String{
//        Toast.makeText(application,"ss",Toast.LENGTH_SHORT).show()
//        return "hh"
//    }
}