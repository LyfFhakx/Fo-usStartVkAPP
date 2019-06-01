package com.gmail.intellect.logos.vkapp.dagger

import com.gmail.intellect.logos.vkapp.App
import com.gmail.intellect.logos.vkapp.dagger.module.data.DataModule
import com.gmail.intellect.logos.vkapp.dagger.module.presentation.AppModule
import com.gmail.intellect.logos.vkapp.dagger.module.presentation.NavigationModule
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [
    AndroidSupportInjectionModule::class,
    AppModule::class,
    NavigationModule::class,
    DataModule::class
])
interface AppComponent : AndroidInjector<App> {

    @Component.Factory
    interface Builder : AndroidInjector.Factory<App>
}