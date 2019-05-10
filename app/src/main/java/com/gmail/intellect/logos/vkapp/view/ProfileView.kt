package com.gmail.intellect.logos.vkapp.view

import com.arellomobile.mvp.MvpView
import com.gmail.intellect.logos.vkapp.view.fragment.profile.message.BaseMessage

interface ProfileView : MvpView {
    fun showProfile(fullName: String, birthDate: String, city: String, languages: String, image:String)
    fun showFeed(items: List<BaseMessage>)
}