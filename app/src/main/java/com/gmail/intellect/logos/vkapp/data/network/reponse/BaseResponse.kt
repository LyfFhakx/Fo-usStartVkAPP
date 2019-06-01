package com.gmail.intellect.logos.vkapp.data.network.reponse

import com.google.gson.annotations.SerializedName

class BaseResponse<T>(
        @SerializedName("data") val data: T?,
        @SerializedName("error") val error: ErrorResponse?
)