package com.gmail.intellect.logos.vkapp.data.datasource

import com.gmail.intellect.logos.vkapp.data.database.dao.UserDao
import com.gmail.intellect.logos.vkapp.data.database.entity.UserEntity
import io.reactivex.Maybe
import io.reactivex.Single
import javax.inject.Inject

interface DbAuthDataSource {

    fun login(phone: String, password: String): Single<UserEntity>
}

class DbAuthDataSourceImpl @Inject constructor(private val userDao: UserDao) : DbAuthDataSource {

    override fun login(phone: String, password: String): Single<UserEntity> =
        userDao.get(phone)
            .flatMap {
                if (it.password == password) {
                    Maybe.just(it)
                } else {
                    Maybe.error(RuntimeException("Неверный логин или пароль"))
                }
            }.toSingle()

}