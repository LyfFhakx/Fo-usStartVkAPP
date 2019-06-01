package com.gmail.intellect.logos.vkapp.data.network.reponse

import com.google.gson.annotations.SerializedName

class ErrorResponse(
    @SerializedName("code") val code: Int,
    @SerializedName("message") val message: String
)