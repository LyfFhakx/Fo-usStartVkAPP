package com.gmail.intellect.logos.vkapp.data.repository

import com.gmail.intellect.logos.vkapp.data.converter.BaseResponseTransformer
import com.gmail.intellect.logos.vkapp.data.converter.Converter
import com.gmail.intellect.logos.vkapp.data.network.api.Api
import com.gmail.intellect.logos.vkapp.data.network.reponse.PostResponse
import com.gmail.intellect.logos.vkapp.domain.entity.Post
import com.gmail.intellect.logos.vkapp.domain.repository.PostRepository
import com.gmail.intellect.logos.vkapp.presentation.common.BaseMessage
import com.gmail.intellect.logos.vkapp.presentation.screen.profile.feed.CatMessage
import com.gmail.intellect.logos.vkapp.presentation.screen.profile.feed.PostMessage
import io.reactivex.Single
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class PostRepositoryImpl @Inject constructor(private val api: Api,
                                             private val postsConverter: Converter<List<PostResponse>, List<Post>>
) : PostRepository {

    override fun getPosts(page: Int): Single<List<Post>> = api.getPosts(page)
        .subscribeOn(Schedulers.io())
        .compose(BaseResponseTransformer())
        .map(postsConverter::convert)



    override fun getPost(id: Long): BaseMessage {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}