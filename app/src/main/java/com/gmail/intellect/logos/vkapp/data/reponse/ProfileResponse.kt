package com.gmail.intellect.logos.vkapp.data.reponse

import com.google.gson.annotations.SerializedName

class ProfileResponse(
    @SerializedName("id") val id: Long,
    @SerializedName("firstName") val firstName: String,
    @SerializedName("lastName") val lastName: String,
    @SerializedName("birthDate") val birthDate: String,
    @SerializedName("country") val country: String,
    @SerializedName("city") val city: String,
    @SerializedName("image") val image: String,
    @SerializedName("languages") val languages: String
)