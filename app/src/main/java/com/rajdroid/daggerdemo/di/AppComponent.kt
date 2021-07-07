package com.rajdroid.daggerdemo.di

import android.app.Application
import com.rajdroid.daggerdemo.BaseApplication
import com.rajdroid.daggerdemo.viewModel.ViewModelFactoryModule
import dagger.BindsInstance
import dagger.Component
import dagger.Module
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidSupportInjectionModule::class,
         ActivityBuilderModule::class,
         RetroModule::class,
        ViewModelModule::class,
         ViewModelFactoryModule::class,
    RepoTestModule::class
    ]
)
interface AppComponent : AndroidInjector<BaseApplication> {




    @Component.Builder
    interface Builder{
        @BindsInstance
        fun application(application: Application) : Builder


        fun build(): AppComponent
    }
}