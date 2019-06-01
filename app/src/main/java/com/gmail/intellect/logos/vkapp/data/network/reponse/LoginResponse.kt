package com.gmail.intellect.logos.vkapp.data.network.reponse

import com.google.gson.annotations.SerializedName

class LoginResponse(
    @SerializedName("token") val token: String
)