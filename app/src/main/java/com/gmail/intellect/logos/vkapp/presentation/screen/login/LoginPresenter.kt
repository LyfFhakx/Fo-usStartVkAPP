package com.gmail.intellect.logos.vkapp.presentation.screen.login

import com.arellomobile.mvp.InjectViewState
import com.gmail.intellect.logos.vkapp.domain.entity.User
import com.gmail.intellect.logos.vkapp.domain.repository.SessionRepository
import com.gmail.intellect.logos.vkapp.domain.repository.UserRepository
import com.gmail.intellect.logos.vkapp.presentation.common.BasePresenter
import com.gmail.intellect.logos.vkapp.presentation.navigation.Screen
import io.reactivex.android.schedulers.AndroidSchedulers
import ru.terrakok.cicerone.Router
import timber.log.Timber
import javax.inject.Inject

@InjectViewState
class LoginPresenter @Inject constructor(
    private val sessionRepository: SessionRepository,
    private val userRepository: UserRepository,
    private val router: Router
) : BasePresenter<LoginView>() {

    override fun onFirstViewAttach() {
        super.onFirstViewAttach()
        login("root", "root")
    }

    fun login(phone: String, password: String) {
        userRepository
            .create(
                User(
                    1,
                    phone,
                    "Артур",
                    "Пиражков",
                    "ssss",
                    "08.06.1199",
                    "",
                    "Россия",
                    "Томсп",
                    "русский"
                ), password
            )
            .flatMap {
                sessionRepository.login(phone, password)
            }
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe(
                {
                    Timber.d(it.toString())
                },
                {
                    Timber.e(it.message.orEmpty())
                }
            )
            .untilDestroy()
        router.replaceScreen(Screen.ProfileViewScreen())
    }
}