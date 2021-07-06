package com.rajdroid.daggerdemo.di

import com.rajdroid.daggerdemo.model.User
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


interface RetroServiceInterface {

    @GET("users/")
    fun getDataFromAPI(@Query("user")query: String): Call<User>?
}