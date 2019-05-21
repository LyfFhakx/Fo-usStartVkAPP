package com.gmail.intellect.logos.vkapp.presentation.screen.login

import com.arellomobile.mvp.InjectViewState
import com.gmail.intellect.logos.vkapp.presentation.common.BasePresenter
import ru.terrakok.cicerone.Router

class LoginPresenter (private val router: Router):BasePresenter<LogInView>(){
@InjectViewState
    override fun onFirstViewAttach() {
        super.onFirstViewAttach()

    }
//TODO add navigation, account-password stab, verification.
}