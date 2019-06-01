package com.gmail.intellect.logos.vkapp.dagger.module.data

import com.gmail.intellect.logos.vkapp.data.datasource.SessionDataSource
import com.gmail.intellect.logos.vkapp.data.interceptor.MockInterceptor
import com.gmail.intellect.logos.vkapp.data.interceptor.TokenInterceptor
import com.google.gson.Gson
import dagger.Module
import dagger.Provides
import okhttp3.logging.HttpLoggingInterceptor
import timber.log.Timber
import javax.inject.Singleton

@Module
class InterceptorModule {

    @Singleton
    @Provides
    fun provideTokenInterceptor(sessionDataSource: SessionDataSource): TokenInterceptor =
            TokenInterceptor(sessionDataSource)

    @Singleton
    @Provides
    fun provideMockInterceptor(gson: Gson): MockInterceptor = MockInterceptor(gson)

    @Singleton
    @Provides
    fun provideLoggingInterceptor(): HttpLoggingInterceptor =
            HttpLoggingInterceptor { Timber.tag("OkHttp").d(it) }.apply {
                level = HttpLoggingInterceptor.Level.BODY
            }
}