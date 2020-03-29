package com.jizhe7550.myapplication.di

import android.app.Application
import com.bumptech.glide.Glide
import com.jizhe7550.myapplication.util.GlideManager
import com.jizhe7550.myapplication.util.GlideRequestManager
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/* Alternative for Test: 'TestAppModule' */
@Module
object AppModule{

    @JvmStatic
    @Singleton
    @Provides
    fun provideGlideRequestManager(
        application: Application
    ): GlideManager {
        return GlideRequestManager(
            Glide.with(application)
        )
    }



}








