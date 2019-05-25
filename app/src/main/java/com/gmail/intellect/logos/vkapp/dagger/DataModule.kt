package com.gmail.intellect.logos.vkapp.dagger

import com.gmail.intellect.logos.vkapp.data.repository.PostRepositoryImpl
import com.gmail.intellect.logos.vkapp.data.repository.SessionRepositoryImpl
import com.gmail.intellect.logos.vkapp.domain.repository.PostRepository
import com.gmail.intellect.logos.vkapp.domain.repository.SessionRepository
import dagger.Binds
import dagger.Module
import dagger.Reusable

@Module(includes = [
    NetworkModule::class,
    ConverterModule::class
])
interface DataModule {

    @Reusable
    @Binds
    fun bindSessionRepository(instance: SessionRepositoryImpl): SessionRepository

    @Reusable
    @Binds
    fun bindPostRepository(instance: PostRepositoryImpl): PostRepository
}