package com.gmail.intellect.logos.vkapp.presentation.screen.splash

import android.os.Handler
import com.arellomobile.mvp.InjectViewState
import com.gmail.intellect.logos.vkapp.domain.repository.SessionRepository
import com.gmail.intellect.logos.vkapp.presentation.common.BasePresenter
import com.gmail.intellect.logos.vkapp.presentation.navigation.Screen
import ru.terrakok.cicerone.Router
import javax.inject.Inject

@InjectViewState
class SplashPresenter @Inject constructor(
    private val sessionRepository: SessionRepository,
    private val router: Router
) : BasePresenter<SplashView>() {

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()

        Handler().postDelayed({
            router.newRootScreen(
                if (sessionRepository.isAuth()) {
                    Screen.ProfileViewScreen()
                } else {
                    Screen.LoginScreen()
                }
            )
        }, 2000)
    }
}
