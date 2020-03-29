package com.jizhe7550.myapplication.di

import androidx.fragment.app.FragmentFactory
import com.jizhe7550.myapplication.fragments.MainFragmentFactory
import com.jizhe7550.myapplication.util.GlideManager
import com.jizhe7550.myapplication.viewmodels.MainViewModelFactory
import dagger.Module
import dagger.Provides
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.InternalCoroutinesApi
import javax.inject.Singleton

@ExperimentalCoroutinesApi
@InternalCoroutinesApi
@Module
object FragmentModule {

    @JvmStatic
    @Singleton
    @Provides
    fun provideMainFragmentFactory(
        viewModelFactory: MainViewModelFactory,
        glideManager: GlideManager
    ): FragmentFactory{
        return MainFragmentFactory(viewModelFactory, glideManager)
    }

}











