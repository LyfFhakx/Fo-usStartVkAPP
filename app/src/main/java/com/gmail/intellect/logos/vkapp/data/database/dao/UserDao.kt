package com.gmail.intellect.logos.vkapp.data.database.dao

import androidx.room.*
import com.gmail.intellect.logos.vkapp.data.database.entity.UserEntity
import com.gmail.intellect.logos.vkapp.domain.entity.User
import io.reactivex.Maybe
import io.reactivex.Single

@Dao
interface UserDao {

    @Query("SELECT * FROM users WHERE phone=:phone")
    fun get(phone: String): Maybe<UserEntity>

    @Insert
    fun insert(user: UserEntity): Long

    @Update
    fun update(user: UserEntity)

    @Delete
    fun delete(user: UserEntity)

}