package com.gmail.intellect.logos.vkapp.data.datasource

import com.gmail.intellect.logos.vkapp.data.database.dao.UserDao
import com.gmail.intellect.logos.vkapp.data.database.entity.UserEntity
import com.gmail.intellect.logos.vkapp.domain.entity.User
import io.reactivex.Single
import javax.inject.Inject

interface UserDataSource {

    fun create(user: User, password: String): Single<Long>
}

class UserDataSourceImpl @Inject constructor(private val userDao: UserDao) : UserDataSource {

    override fun create(user: User, password: String): Single<Long> = Single.fromCallable {
        userDao.insert(
            UserEntity(
                user.id,
                user.phone,
                password,
                user.firstName,
                user.lastName,
                user.status,
                user.birthDate,
                user.avatar,
                user.country,
                user.city,
                user.languages
                )
        )
    }

}