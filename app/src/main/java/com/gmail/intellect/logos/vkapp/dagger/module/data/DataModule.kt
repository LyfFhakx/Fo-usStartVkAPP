package com.gmail.intellect.logos.vkapp.dagger.module.data

import android.content.Context
import android.content.SharedPreferences
import com.gmail.intellect.logos.vkapp.App
import com.gmail.intellect.logos.vkapp.data.datasource.*
import com.gmail.intellect.logos.vkapp.data.repository.PostRepositoryImpl
import com.gmail.intellect.logos.vkapp.data.repository.SessionRepositoryImpl
import com.gmail.intellect.logos.vkapp.data.repository.UserRepositoryImpl
import com.gmail.intellect.logos.vkapp.domain.repository.PostRepository
import com.gmail.intellect.logos.vkapp.domain.repository.SessionRepository
import com.gmail.intellect.logos.vkapp.domain.repository.UserRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(
    includes = [
        NetworkModule::class,
        ConverterModule::class,
        DatabaseModule::class
    ]
)
abstract class DataModule {

    @Module
    companion object {

        @JvmStatic
        @Singleton
        @Provides
        fun provideSharedPreferences(app: App): SharedPreferences =
            app.getSharedPreferences("CommonSharedPreferences", Context.MODE_PRIVATE)
    }


    @Singleton
    @Binds
    abstract fun bindAuthDataSource(instance: AuthDataSourceImpl): AuthDataSource

    @Singleton
    @Binds
    abstract fun bindSessionRepository(instance: SessionRepositoryImpl): SessionRepository

    @Singleton
    @Binds
    abstract fun bindSessionDataSource(instance: SessionDataSourceImpl): SessionDataSource

    @Singleton
    @Binds
    abstract fun bindPostRepository(instance: PostRepositoryImpl): PostRepository

    @Singleton
    @Binds
    abstract fun bindDbAuthDataSource(instance: DbAuthDataSourceImpl): DbAuthDataSource

    @Singleton
    @Binds
    abstract fun bindUserDataSource(instance: UserDataSourceImpl): UserDataSource

    @Singleton
    @Binds
    abstract fun bindProfileRepository(instance: UserRepositoryImpl): UserRepository
}