package com.gmail.intellect.logos.vkapp.domain.repository

import com.gmail.intellect.logos.vkapp.domain.entity.User
import io.reactivex.Single

interface SessionRepository {

    fun login(name: String, password: String): Single<User>

    fun isAuth(): Boolean

}