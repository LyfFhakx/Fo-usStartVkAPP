package com.gmail.intellect.logos.vkapp.presentation.screen.profile

import com.arellomobile.mvp.MvpView
import com.gmail.intellect.logos.vkapp.domain.entity.User
import com.gmail.intellect.logos.vkapp.presentation.common.BaseMessage

interface ProfileView : MvpView {
    fun showProfile(profileDate: User)
    fun showFeed(items: List<BaseMessage>)
}