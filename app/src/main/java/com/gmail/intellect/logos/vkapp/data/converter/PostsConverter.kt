package com.gmail.intellect.logos.vkapp.data.converter

import com.gmail.intellect.logos.vkapp.data.network.reponse.PostResponse
import com.gmail.intellect.logos.vkapp.domain.entity.Post
import javax.inject.Inject

class PostsConverter @Inject constructor() : Converter<@JvmSuppressWildcards List<@JvmSuppressWildcards PostResponse>, @JvmSuppressWildcards List<@JvmSuppressWildcards Post>> {

    override fun convert(t: List<PostResponse>): List<Post> = t.map {
        Post(it.id)
    }
}