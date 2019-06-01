package com.gmail.intellect.logos.vkapp.data.datasource

import com.gmail.intellect.logos.vkapp.data.converter.BaseResponseTransformer
import com.gmail.intellect.logos.vkapp.data.network.api.Api
import com.gmail.intellect.logos.vkapp.data.network.reponse.LoginResponse
import com.gmail.intellect.logos.vkapp.data.network.request.UserRequest
import io.reactivex.Single
import javax.inject.Inject

interface AuthDataSource {

    fun login(name: String, password: String): Single<LoginResponse>
}

class AuthDataSourceImpl @Inject constructor(private val api: Api) : AuthDataSource {

    override fun login(name: String, password: String): Single<LoginResponse> =
        api
            .login(UserRequest(name, password))
            .compose(BaseResponseTransformer())

}