package com.gmail.intellect.logos.vkapp.domain.repository

import com.gmail.intellect.logos.vkapp.domain.entity.Post
import io.reactivex.Single

interface PostRepository {

    fun getPosts(page: Int): Single<List<Post>>

    fun getPost(id: Long): Post
}