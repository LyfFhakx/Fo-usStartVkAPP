package com.gmail.intellect.logos.vkapp.data.converter

import com.gmail.intellect.logos.vkapp.data.database.entity.UserEntity
import com.gmail.intellect.logos.vkapp.data.network.reponse.UserResponse
import com.gmail.intellect.logos.vkapp.domain.entity.User
import javax.inject.Inject

class UserConverter @Inject constructor() : Converter<UserResponse, User> {

    override fun convert(t: UserResponse): User = User(
        t.id,
        t.phone,
        t.firstName,
        t.lastName,
        t.status,
        t.birthday,
        t.avatar,
        t.country,
        t.city,
        t.languages


    )
}

class UserEntityConverter @Inject constructor() : Converter<UserEntity, User> {

    override fun convert(t: UserEntity): User = User(
        t.id,
        t.phone,
        t.firstName,
        t.lastName,
        t.status,
        t.birthday,
        t.avatar,
        t.country,
        t.city,
        t.languages
    )
}
