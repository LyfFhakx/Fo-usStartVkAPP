package com.gmail.intellect.logos.vkapp.data.repository

import com.gmail.intellect.logos.vkapp.data.converter.Converter
import com.gmail.intellect.logos.vkapp.data.network.Api
import com.gmail.intellect.logos.vkapp.data.reponse.ProfileResponse
import com.gmail.intellect.logos.vkapp.domain.entity.User
import com.gmail.intellect.logos.vkapp.domain.repository.SessionRepository
import io.reactivex.Single
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class SessionRepositoryImpl @Inject constructor(
    private val api: Api,
    private val userConverter: Converter<ProfileResponse, User>
) : SessionRepository {

    override fun login(name: String, password: String): Single<User> = api.login(name, password)
        .subscribeOn(Schedulers.io())
        .map(userConverter::convertTo)

    override fun isAuth(): Boolean = true

}