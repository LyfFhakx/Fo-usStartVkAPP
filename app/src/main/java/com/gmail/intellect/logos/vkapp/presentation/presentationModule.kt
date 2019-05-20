package com.gmail.intellect.logos.vkapp.presentation

import com.gmail.intellect.logos.vkapp.presentation.screen.editProfile.EditProfilePresenter
import com.gmail.intellect.logos.vkapp.presentation.screen.login.LoginPresenter
import com.gmail.intellect.logos.vkapp.presentation.screen.main.MainPresenter
import com.gmail.intellect.logos.vkapp.presentation.screen.profile.ProfileViewPresenter
import com.gmail.intellect.logos.vkapp.presentation.screen.splash.SplashPresenter
import org.koin.dsl.module
import ru.terrakok.cicerone.Cicerone
import ru.terrakok.cicerone.Router


val presentationModule = module {

    single { Cicerone.create() }
    single { get<Cicerone<Router>>().router }
    single { get<Cicerone<Router>>().navigatorHolder }

    factory { SplashPresenter(get()) }
    factory { MainPresenter(get()) }
    factory { ProfileViewPresenter(get()) }
    factory { EditProfilePresenter(get()) }
    factory { LoginPresenter(get()) }
}