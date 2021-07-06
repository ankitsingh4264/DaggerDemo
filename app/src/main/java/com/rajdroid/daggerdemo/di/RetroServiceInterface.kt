package com.rajdroid.daggerdemo.di

import com.rajdroid.daggerdemo.model.User
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import retrofit2.http.Url


interface RetroServiceInterface {

    @GET("users/{q}")
    fun getDataFromAPI(@Path("q") query: String): Call<User>?
}