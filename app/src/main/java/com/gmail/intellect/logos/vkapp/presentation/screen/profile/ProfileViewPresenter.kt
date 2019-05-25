package com.gmail.intellect.logos.vkapp.presentation.screen.profile

import com.arellomobile.mvp.InjectViewState
import com.gmail.intellect.logos.vkapp.domain.repository.PostRepository
import com.gmail.intellect.logos.vkapp.presentation.common.BasePresenter
import com.gmail.intellect.logos.vkapp.presentation.navigation.Screen
import ru.terrakok.cicerone.Router
import javax.inject.Inject

@InjectViewState
class ProfileViewPresenter @Inject constructor(
    private val postRepository: PostRepository,
    private val router: Router
) : BasePresenter<ProfileView>() {

override fun onFirstViewAttach() {
    super.onFirstViewAttach()

    viewState.showProfile()
    viewState.showFeed(postRepository.getAll())
}

//TODO add uploading image, audio, video. new "verstka"
fun logout() {
    router.replaceScreen(Screen.LoginScreen())
}

fun editProfile() {
    router.replaceScreen(Screen.EditProfileScreen())
}

}