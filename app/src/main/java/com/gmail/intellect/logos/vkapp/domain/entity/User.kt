package com.gmail.intellect.logos.vkapp.domain.entity

data class User(
    val id: Long,
    val phone: String,
    val firstName: String,
    val lastName: String,
    val status: String,
    val birthDate: String,
    val avatar: String,
    val country: String,
    val city: String,
    val languages: String
)