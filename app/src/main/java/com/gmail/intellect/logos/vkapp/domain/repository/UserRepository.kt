package com.gmail.intellect.logos.vkapp.domain.repository

import com.gmail.intellect.logos.vkapp.domain.entity.User
import io.reactivex.Single

interface UserRepository {

    fun create(user: User, password: String): Single<Long>
}