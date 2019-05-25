package com.gmail.intellect.logos.vkapp.domain.entity

data class User(
    val id: Long,
    val firstName: String,
    val lastName: String,
    val birthDate: String,
    val country: String,
    val city: String,
    val image: String,
    val languages: String
)