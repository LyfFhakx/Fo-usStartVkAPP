package com.gmail.intellect.logos.vkapp.dagger.module.presentation

import com.gmail.intellect.logos.vkapp.dagger.FragmentScope
import com.gmail.intellect.logos.vkapp.presentation.screen.login.LoginFragment
import com.gmail.intellect.logos.vkapp.presentation.screen.profile.ProfileViewFragment
import com.gmail.intellect.logos.vkapp.presentation.screen.splash.SplashFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface MainActivityModule {

    @FragmentScope
    @ContributesAndroidInjector
    fun provideSplashFragment(): SplashFragment

    @FragmentScope
    @ContributesAndroidInjector
    fun provideProfileViewFragment(): ProfileViewFragment

    @FragmentScope
    @ContributesAndroidInjector
    fun provideLoginFragment(): LoginFragment

}