package com.gmail.intellect.logos.vkapp.presentation.screen.profile

import com.arellomobile.mvp.InjectViewState
import com.gmail.intellect.logos.vkapp.data.ProfileData
import com.gmail.intellect.logos.vkapp.presentation.common.BasePresenter
import com.gmail.intellect.logos.vkapp.presentation.navigation.Screen
import com.gmail.intellect.logos.vkapp.presentation.screen.profile.feed.CatMessage
import com.gmail.intellect.logos.vkapp.presentation.screen.profile.feed.PostMessage
import ru.terrakok.cicerone.Router

@InjectViewState
class ProfileViewPresenter(private val router: Router) : BasePresenter<ProfileView>() {

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()

        viewState.showProfile(profileDate = ProfileData("https://ichef.bbci.co.uk/images/ic/720x405/p0517py6.jpg","Lya Ka Koe","08.01.1910","City","Delicious"))

        viewState.showFeed((1..100).map {
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
        })
    }
    //TODO add uploading image, audio, video. new "verstka"
    fun logout() {
        router.replaceScreen(Screen.LogInScreen())
    }
    fun editProfile() {
        router.replaceScreen(Screen.EditProfileScreen())
    }

}