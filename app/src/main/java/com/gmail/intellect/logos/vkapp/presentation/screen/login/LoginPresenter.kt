package com.gmail.intellect.logos.vkapp.presentation.screen.login

import android.util.Log
import com.arellomobile.mvp.InjectViewState
import com.gmail.intellect.logos.vkapp.domain.repository.SessionRepository
import com.gmail.intellect.logos.vkapp.presentation.common.BasePresenter
import io.reactivex.android.schedulers.AndroidSchedulers
import javax.inject.Inject

@InjectViewState
class LoginPresenter @Inject constructor(
    private val sessionRepository: SessionRepository
) : BasePresenter<LoginView>() {

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
        login("root", "root")
    }

    fun login(name: String, password: String) {
        sessionRepository
            .login(name, password)
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(
                {
                    Log.d("data", it.toString())
                },
                {
                    Log.d("error", it.message)
                }
            )
            .untilDestroy()
    }
}