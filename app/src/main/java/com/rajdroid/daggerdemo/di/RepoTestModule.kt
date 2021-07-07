package com.rajdroid.daggerdemo.di

import android.app.Application
import com.rajdroid.daggerdemo.RepoTest
import dagger.Module
import dagger.Provides
import javax.inject.Singleton


@Module
class RepoTestModule {

    @Provides
    @Singleton
    fun provideRepo(application: Application):RepoTest{
        return  RepoTest(application)
    }
}


//static , public abstract get()
// abstarction provide 0 -100 , interface 100