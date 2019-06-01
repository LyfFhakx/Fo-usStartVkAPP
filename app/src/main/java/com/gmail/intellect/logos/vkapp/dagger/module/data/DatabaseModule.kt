package com.gmail.intellect.logos.vkapp.dagger.module.data

import com.gmail.intellect.logos.vkapp.App
import com.gmail.intellect.logos.vkapp.data.database.AppDatabase
import com.gmail.intellect.logos.vkapp.data.database.dao.UserDao
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DatabaseModule {

    @Singleton
    @Provides
    fun provideDatabase(app: App): AppDatabase = AppDatabase.create(app, true)

    @Singleton
    @Provides
    fun provideUserDao(db: AppDatabase): UserDao = db.getUserDao()
}