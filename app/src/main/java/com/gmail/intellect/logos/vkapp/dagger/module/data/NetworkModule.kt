package com.gmail.intellect.logos.vkapp.dagger.module.data

import com.gmail.intellect.logos.vkapp.data.interceptor.MockInterceptor
import com.gmail.intellect.logos.vkapp.data.interceptor.TokenInterceptor
import com.gmail.intellect.logos.vkapp.data.network.api.Api
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module(includes = [InterceptorModule::class])
abstract class NetworkModule {

    @Module
    companion object {

        @JvmStatic
        @Singleton
        @Provides
        fun provideGson(): Gson = GsonBuilder()
            .setDateFormat("yyyy.MM.dd")
            .create()

        @JvmStatic
        @Singleton
        @Provides
        fun provideOkHttp(
            tokenInterceptor: TokenInterceptor,
            mockInterceptor: MockInterceptor,
            httpLoggingInterceptor: HttpLoggingInterceptor
        ): OkHttpClient = OkHttpClient.Builder()
            .addInterceptor(mockInterceptor)
            .addInterceptor(tokenInterceptor)
            .addInterceptor(httpLoggingInterceptor)
            .build()

        @JvmStatic
        @Singleton
        @Provides
        fun provideRetrofit(okHttpClient: OkHttpClient, gson: Gson): Retrofit = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create(gson))
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .baseUrl("https://google.com")
            .client(okHttpClient)
            .build()

        @JvmStatic
        @Singleton
        @Provides
        fun provideApi(retrofit: Retrofit): Api = retrofit.create(Api::class.java)
    }
}

