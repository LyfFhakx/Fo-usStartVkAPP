package com.gmail.intellect.logos.vkapp.presentation.screen.profile

import com.arellomobile.mvp.MvpView
import com.gmail.intellect.logos.vkapp.presentation.common.BaseMessage

interface ProfileView : MvpView {
 //   fun showProfile(profileDate: User)
    fun showProfile(firstName:String)
    fun showFeed(items: List<BaseMessage>)
    fun showEmptyFeed()
    fun showProgress()
    fun hideProgress()
    fun showErrorFeed()
}