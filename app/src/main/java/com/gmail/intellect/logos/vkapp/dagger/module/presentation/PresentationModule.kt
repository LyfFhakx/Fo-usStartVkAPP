package com.gmail.intellect.logos.vkapp.dagger.module.presentation

import dagger.Module

@Module(includes = [
    AppModule::class,
    MainActivityModule::class,
    NavigationModule::class
])
interface PresentationModule