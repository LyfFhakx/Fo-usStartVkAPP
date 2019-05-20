package com.gmail.intellect.logos.vkapp.presentation.screen.profile

import com.arellomobile.mvp.MvpView
import com.gmail.intellect.logos.vkapp.presentation.common.BaseMessage

interface ProfileView : MvpView {
    fun showProfile(fullName: String, birthDate: String, city: String, languages: String, image:String)
    fun showFeed(items: List<BaseMessage>)
}