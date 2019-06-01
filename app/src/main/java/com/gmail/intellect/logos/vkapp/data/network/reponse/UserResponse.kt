package com.gmail.intellect.logos.vkapp.data.network.reponse

import com.google.gson.annotations.SerializedName
import java.util.*

class UserResponse(
    @SerializedName("id") val id: Long,
    @SerializedName("phone") val phone: String,
    @SerializedName("firstName") val firstName: String,
    @SerializedName("lastName") val lastName: String,
    @SerializedName("status") val status: String,
    @SerializedName("avatar") val avatar: String,
    @SerializedName("birthday") val birthday: Date,
    @SerializedName("city") val city: String
)