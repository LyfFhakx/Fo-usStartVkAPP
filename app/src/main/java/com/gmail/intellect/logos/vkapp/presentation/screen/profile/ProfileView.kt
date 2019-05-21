package com.gmail.intellect.logos.vkapp.presentation.screen.profile

import com.arellomobile.mvp.MvpView
import com.gmail.intellect.logos.vkapp.data.ProfileData
import com.gmail.intellect.logos.vkapp.presentation.common.BaseMessage

interface ProfileView : MvpView {
    fun showProfile(profileDate: ProfileData)
    fun showFeed(items: List<BaseMessage>)
}