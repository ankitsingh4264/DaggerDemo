package com.rajdroid.daggerdemo

import android.content.ContentValues.TAG
import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.rajdroid.daggerdemo.di.RetroServiceInterface
import com.rajdroid.daggerdemo.model.User
import retrofit2.Call
import retrofit2.Response
import retrofit2.Retrofit
import javax.inject.Inject


class MainActivityViewModel @Inject constructor(val retroService: RetroServiceInterface) : ViewModel(){

    init {
        Log.d("ankit","View Mode working retro $retroService " )
    }

    val data : MutableLiveData<User> = MutableLiveData();

    fun getUser( id:String){

        val res= retroService.getDataFromAPI(id)
        res!!.enqueue( object : retrofit2.Callback<User>{
            override fun onResponse(call: Call<User>, response: Response<User>) {

                val body=response.body()
                Log.d("ankit", "onResponse: $response")
                if (body!=null){
                    data.value=body;
                }else{
                    data.value=null
                }

            }

            override fun onFailure(call: Call<User>, t: Throwable) {
                TODO("Not yet implemented")
            }

          }
        )
    }

}