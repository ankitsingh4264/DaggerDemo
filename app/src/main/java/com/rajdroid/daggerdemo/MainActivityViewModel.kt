package com.rajdroid.daggerdemo

import android.app.Application
import android.content.ContentValues.TAG
import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.rajdroid.daggerdemo.di.RetroServiceInterface
import com.rajdroid.daggerdemo.model.User
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Response
import retrofit2.Retrofit
import javax.inject.Inject


class MainActivityViewModel @Inject constructor( val retroService: RetroServiceInterface
                                              ,val repoTest: RepoTest  ) : ViewModel(){

    init {
        Log.d("ankit","View Mode working retro $retroService  repo  " )
       repoTest.getTest()


    }

    val data : MutableLiveData<User> = MutableLiveData();


    suspend fun getUser(id:String) : User? {

//        val res= retroService.getDataFromAPI(id)

       val response= viewModelScope.async {
            retroService.getDataFromAPI(id)
        }
        var userResult:User?=null
        userResult = if (response.await().isSuccessful){
            response.await().body();

        }else{
            null;
        }


       return  userResult


      
    }

}