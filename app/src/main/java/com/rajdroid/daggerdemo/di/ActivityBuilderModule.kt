package com.rajdroid.daggerdemo.di

import com.rajdroid.daggerdemo.MainActivity
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector
import javax.inject.Named


@Module
abstract class ActivityBuilderModule {
    @ContributesAndroidInjector(
        modules = [ViewModelModule::class]
    )
    abstract fun contributeMainActivity(): MainActivity


//    companion object{
//            @Provides
//            @Named("1")
//            fun  someString(): String{
//        return "this is a test string"
//        }
//
//
//        @Provides
//        @Named("2")
//        fun  someString2(): String{
//            return "this is a test string hiiii"
//        }
//    }


}