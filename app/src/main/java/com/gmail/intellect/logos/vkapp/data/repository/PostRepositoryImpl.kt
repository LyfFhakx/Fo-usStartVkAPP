package com.gmail.intellect.logos.vkapp.data.repository

import com.gmail.intellect.logos.vkapp.domain.repository.PostRepository
import com.gmail.intellect.logos.vkapp.presentation.common.BaseMessage
import com.gmail.intellect.logos.vkapp.presentation.screen.profile.feed.CatMessage
import com.gmail.intellect.logos.vkapp.presentation.screen.profile.feed.PostMessage
import javax.inject.Inject

class PostRepositoryImpl @Inject constructor() : PostRepository {

    override fun getAll(): List<BaseMessage> = (1..100).map {
        if (it % 5 == 0) {
            CatMessage(
                    it,
                    "https://ichef.bbci.co.uk/images/ic/720x405/p0517py6.jpg"
            )
        } else {
            PostMessage(
                    it,
                    "Message".repeat(30),
                    "https://picsum.photos/id/$it/200/300"
            )
        }
    }

    override fun getPost(id: Long): BaseMessage {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}