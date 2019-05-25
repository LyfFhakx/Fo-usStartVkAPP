package com.gmail.intellect.logos.vkapp.dagger

import com.gmail.intellect.logos.vkapp.data.converter.Converter
import com.gmail.intellect.logos.vkapp.data.converter.UserConverter
import com.gmail.intellect.logos.vkapp.data.reponse.ProfileResponse
import com.gmail.intellect.logos.vkapp.domain.entity.User
import dagger.Binds
import dagger.Module
import dagger.Reusable

@Module
interface ConverterModule {

    @Reusable
    @Binds
    fun bindUserConverter(instance: UserConverter): Converter<ProfileResponse, User>
}