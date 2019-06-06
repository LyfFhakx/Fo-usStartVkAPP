package com.gmail.intellect.logos.vkapp.dagger.module.data

import com.gmail.intellect.logos.vkapp.data.converter.Converter
import com.gmail.intellect.logos.vkapp.data.converter.PostsConverter
import com.gmail.intellect.logos.vkapp.data.converter.UserConverter
import com.gmail.intellect.logos.vkapp.data.converter.UserEntityConverter
import com.gmail.intellect.logos.vkapp.data.database.entity.UserEntity
import com.gmail.intellect.logos.vkapp.data.network.reponse.PostResponse
import com.gmail.intellect.logos.vkapp.data.network.reponse.UserResponse
import com.gmail.intellect.logos.vkapp.domain.entity.Post
import com.gmail.intellect.logos.vkapp.domain.entity.User
import dagger.Binds
import dagger.Module
import dagger.Reusable
import javax.inject.Singleton

@Module
interface ConverterModule {

    @Reusable
    @Binds
    fun bindUserConverter(instance: UserConverter): Converter<UserResponse, User>

    @Singleton
    @Binds
    fun bindUserEntityConverter(instance: UserEntityConverter): Converter<UserEntity, User>

    @Singleton
    @Binds
    fun bindPostsConverter(instance: PostsConverter): Converter<List<PostResponse>, List<Post>>

}