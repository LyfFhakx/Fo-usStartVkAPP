package com.gmail.intellect.logos.vkapp.presentation.screen.profile

import com.arellomobile.mvp.InjectViewState
import com.gmail.intellect.logos.vkapp.domain.entity.Post
import com.gmail.intellect.logos.vkapp.domain.repository.PostRepository
import com.gmail.intellect.logos.vkapp.domain.repository.ProfileRepository
import com.gmail.intellect.logos.vkapp.presentation.common.BasePresenter
import com.gmail.intellect.logos.vkapp.presentation.navigation.Screen
import com.gmail.intellect.logos.vkapp.presentation.screen.profile.feed.PostMessage
import io.reactivex.android.schedulers.AndroidSchedulers
import ru.terrakok.cicerone.Router
import javax.inject.Inject

@InjectViewState
class ProfileViewPresenter @Inject constructor(
    private val postRepository: PostRepository
) : BasePresenter<ProfileView>() {

    private val paginator = Paginator(
        {
            postRepository.getPosts(it)
                .observeOn(AndroidSchedulers.mainThread())
                .doFinally { viewState.hideProgress() }
        },
        object : Paginator.ViewController<Post> {

            override fun showEmptyProgress(show: Boolean) {
                viewState.showProgress()
            }

            override fun showEmptyError(show: Boolean, error: Throwable?) {
                viewState.showErrorFeed()
            }

            override fun showEmptyView(show: Boolean) {
                viewState.showEmptyFeed()
            }

            override fun showData(show: Boolean, data: List<Post>) {
                viewState.showFeed(data.map { PostMessage(it.id, "Number ${it.id}", "https://static.independent.co.uk/s3fs-public/thumbnails/image/2017/09/12/11/naturo-monkey-selfie.jpg?w968h681") })
            }

            override fun showErrorMessage(error: Throwable) {

            }

            override fun showRefreshProgress(show: Boolean) {
                viewState.showProgress()
            }

            override fun showPageProgress(show: Boolean) {

            }

        }
    )

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
        paginator.refresh()
        viewState.showProfile("Ilya")
    }

    fun loadPosts() {
        paginator.loadNewPage()
    }

    fun refreshPosts() {
        paginator.refresh()
    }

    fun logout() {
        TODO("Navigate to login")
    }


    override fun onFirstViewAttach() {
    super.onFirstViewAttach()

    viewState.showProfile(profileRepository.getProfile())
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