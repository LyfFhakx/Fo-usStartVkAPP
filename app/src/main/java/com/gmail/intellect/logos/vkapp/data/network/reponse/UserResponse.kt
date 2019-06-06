package com.gmail.intellect.logos.vkapp.data.network.reponse

import com.google.gson.annotations.SerializedName

class UserResponse(
    @SerializedName("id") val id: Long,
    @SerializedName("phone") val phone: String,
    @SerializedName("firstName") val firstName: String,
    @SerializedName("lastName") val lastName: String,
    @SerializedName("status") val status: String,
    @SerializedName("birthday") val birthday: String,
    @SerializedName("avatar") val avatar: String,
    @SerializedName("country") val country: String,
    @SerializedName("city") val city: String,
    @SerializedName("languages") val languages: String
)