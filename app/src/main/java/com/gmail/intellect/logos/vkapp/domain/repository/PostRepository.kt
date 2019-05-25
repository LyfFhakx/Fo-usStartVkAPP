package com.gmail.intellect.logos.vkapp.domain.repository

import com.gmail.intellect.logos.vkapp.presentation.common.BaseMessage

interface PostRepository {

    fun getAll(): List<BaseMessage>

    fun getPost(id: Long): BaseMessage
}