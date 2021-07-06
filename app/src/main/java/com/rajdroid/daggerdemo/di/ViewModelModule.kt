package com.rajdroid.daggerdemo.di

import androidx.lifecycle.ViewModel
import com.rajdroid.daggerdemo.MainActivityViewModel
import com.rajdroid.daggerdemo.viewModel.ViewModelKey
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap


@Module
abstract class ViewModelModule {


    @Binds
    @IntoMap
    @ViewModelKey(MainActivityViewModel::class)
    abstract fun bindsViewModel(viewModel: MainActivityViewModel): ViewModel

}