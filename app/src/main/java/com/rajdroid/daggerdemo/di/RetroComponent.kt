package com.rajdroid.daggerdemo.di

import com.rajdroid.daggerdemo.MainActivityViewModel
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [RetroModule::class])
interface RetroComponent {


}