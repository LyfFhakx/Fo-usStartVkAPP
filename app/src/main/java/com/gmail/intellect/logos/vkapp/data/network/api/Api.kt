package com.gmail.intellect.logos.vkapp.data.network.api

import com.gmail.intellect.logos.vkapp.data.network.reponse.BaseResponse
import com.gmail.intellect.logos.vkapp.data.network.reponse.LoginResponse
import com.gmail.intellect.logos.vkapp.data.network.reponse.PostResponse
import com.gmail.intellect.logos.vkapp.data.network.request.UserRequest
import io.reactivex.Single
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface Api {

    @POST("login")
    fun login(@Body userRequest: UserRequest): Single<BaseResponse<LoginResponse>>

    @GET("posts/page/{page}")
    fun getPosts(@Path("page") page: Int): Single<BaseResponse<List<PostResponse>>>

}