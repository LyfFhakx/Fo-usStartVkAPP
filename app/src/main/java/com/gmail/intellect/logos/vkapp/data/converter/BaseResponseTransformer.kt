package com.gmail.intellect.logos.vkapp.data.converter

import com.gmail.intellect.logos.vkapp.data.network.reponse.BaseResponse
import io.reactivex.Single
import io.reactivex.SingleSource
import io.reactivex.SingleTransformer

class BaseResponseTransformer<T> : SingleTransformer<BaseResponse<T>, T> {

    override fun apply(upstream: Single<BaseResponse<T>>): SingleSource<T> = upstream.flatMap {
        when {
            it.data != null -> Single.just(it.data)
            it.error != null -> Single.error(RuntimeException(it.error.message))
            else -> Single.error(RuntimeException("Bad response"))
        }
    }
}