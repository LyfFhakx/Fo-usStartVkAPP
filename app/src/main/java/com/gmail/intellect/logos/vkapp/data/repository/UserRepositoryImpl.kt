package com.gmail.intellect.logos.vkapp.data.repository

import com.gmail.intellect.logos.vkapp.data.datasource.UserDataSource
import com.gmail.intellect.logos.vkapp.domain.entity.User
import com.gmail.intellect.logos.vkapp.domain.repository.UserRepository
import io.reactivex.Single
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class UserRepositoryImpl @Inject constructor(private val userDataSource: UserDataSource) : UserRepository {

    override fun create(user: User, password: String): Single<Long> = userDataSource
        .create(user, password)
        .subscribeOn(Schedulers.io())

}