package com.gmail.intellect.logos.vkapp.data.repository

import com.gmail.intellect.logos.vkapp.data.converter.Converter
import com.gmail.intellect.logos.vkapp.data.database.entity.UserEntity
import com.gmail.intellect.logos.vkapp.data.datasource.AuthDataSource
import com.gmail.intellect.logos.vkapp.data.datasource.DbAuthDataSource
import com.gmail.intellect.logos.vkapp.data.datasource.SessionDataSource
import com.gmail.intellect.logos.vkapp.domain.entity.User
import com.gmail.intellect.logos.vkapp.domain.repository.SessionRepository
import io.reactivex.Single
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class SessionRepositoryImpl @Inject constructor(
    private val authDataSource: AuthDataSource,
    private val dbAuthDataSource: DbAuthDataSource,
    private val sessionDataSource: SessionDataSource,
    private val userEntityConverter: Converter<UserEntity, User>) : SessionRepository {

    override fun login(name: String, password: String): Single<User> = dbAuthDataSource
        .login(name,password)
        .subscribeOn(Schedulers.io())
        .map(userEntityConverter::convert)

    override fun logout() = sessionDataSource.clearToken()

    override fun saveToken(token: String) = sessionDataSource.saveToken(token)

    override fun getToken(): String = sessionDataSource.getToken()

    override fun isAuth(): Boolean = sessionDataSource.getToken().isNotEmpty()

}