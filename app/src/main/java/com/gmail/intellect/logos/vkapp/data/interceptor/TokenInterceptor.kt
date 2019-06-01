package com.gmail.intellect.logos.vkapp.data.interceptor

import com.gmail.intellect.logos.vkapp.data.datasource.SessionDataSource
import okhttp3.Interceptor
import okhttp3.Response
import javax.inject.Inject

class TokenInterceptor @Inject constructor(
        private val sessionDataSource: SessionDataSource
) : Interceptor {

    override fun intercept(chain: Interceptor.Chain): Response {
        val token = sessionDataSource.getToken()

        return if (token.isEmpty()) {
            chain.proceed(chain.request())
        } else {
            val request = chain
                    .request()
                    .newBuilder()
                    .addHeader("Authorization:", token).build()

            chain.proceed(request)
        }
    }
}