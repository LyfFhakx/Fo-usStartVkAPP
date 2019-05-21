package com.gmail.intellect.logos.vkapp.presentation.screen.login

import com.arellomobile.mvp.InjectViewState
import com.gmail.intellect.logos.vkapp.presentation.common.BasePresenter
import com.gmail.intellect.logos.vkapp.presentation.navigation.Screen
import ru.terrakok.cicerone.Router

@InjectViewState
class LoginPresenter(private val router: Router) : BasePresenter<LogInView>() {

//TODO add loginCheck

//    override fun onFirstViewAttach() {
//        super.onFirstViewAttach()
//        viewState.checkLogIn(){
//
//        }
//    }

    fun logIn() {
        router.replaceScreen(Screen.ProfileViewScreen())
    }
    fun changePassword(){
        //TODO add change password fragment
    }

//TODO add navigation, account-password stab, verification.
}