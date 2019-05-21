package com.gmail.intellect.logos.vkapp.presentation.screen.splash

import android.os.Handler
import com.arellomobile.mvp.InjectViewState
import com.gmail.intellect.logos.vkapp.presentation.common.BasePresenter
import com.gmail.intellect.logos.vkapp.presentation.navigation.Screen
import ru.terrakok.cicerone.Router

@InjectViewState
class SplashPresenter(private val router: Router) : BasePresenter<SplashView>() {

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()

        Handler().postDelayed({
            router.replaceScreen(Screen.LogInScreen())
        }, 2000)
    }
}
