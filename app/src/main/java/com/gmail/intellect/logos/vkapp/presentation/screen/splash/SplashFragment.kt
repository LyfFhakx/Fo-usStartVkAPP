package com.gmail.intellect.logos.vkapp.presentation.screen.splash

import com.arellomobile.mvp.presenter.InjectPresenter
import com.gmail.intellect.logos.vkapp.R
import com.gmail.intellect.logos.vkapp.presentation.common.BaseFragment

class SplashFragment : BaseFragment(R.layout.frament_splash), SplashView {

    @InjectPresenter
    lateinit var presenter: SplashPresenter
}