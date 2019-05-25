package com.gmail.intellect.logos.vkapp.data.converter

import com.gmail.intellect.logos.vkapp.data.reponse.ProfileResponse
import com.gmail.intellect.logos.vkapp.domain.entity.User
import javax.inject.Inject

class UserConverter @Inject constructor() : Converter<ProfileResponse, User> {

    override fun convertTo(t: ProfileResponse): User = User(
        t.id,
        t.firstName,
        t.lastName,
        t.birthDate,
        t.country,
        t.city,
        t.image,
        t.languages
    )

    override fun convertFrom(k: User): ProfileResponse = ProfileResponse(
        k.id,
        k.firstName,
        k.lastName,
        k.birthDate,
        k.country,
        k.city,
        k.image,
        k.languages
    )
}