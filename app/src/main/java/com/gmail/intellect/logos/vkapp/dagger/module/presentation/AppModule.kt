package com.gmail.intellect.logos.vkapp.dagger.module.presentation

import com.gmail.intellect.logos.vkapp.dagger.ActivityScope
import com.gmail.intellect.logos.vkapp.presentation.screen.main.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface AppModule {

    @ActivityScope
    @ContributesAndroidInjector(modules = [MainActivityModule::class])
    fun provideMainActivity(): MainActivity
}