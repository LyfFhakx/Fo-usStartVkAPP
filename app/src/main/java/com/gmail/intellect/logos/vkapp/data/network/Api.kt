package com.gmail.intellect.logos.vkapp.data.network

import com.gmail.intellect.logos.vkapp.data.reponse.ProfileResponse
import io.reactivex.Single
import retrofit2.http.POST

interface Api {

    @POST("login")
    fun login(name: String, password: String): Single<ProfileResponse>

}