package com.gmail.intellect.logos.vkapp.presentation.screen.splash

import com.arellomobile.mvp.presenter.InjectPresenter
import com.arellomobile.mvp.presenter.ProvidePresenter
import com.gmail.intellect.logos.vkapp.R
import com.gmail.intellect.logos.vkapp.presentation.common.BaseFragment
import org.koin.android.ext.android.get

class SplashFragment : BaseFragment(R.layout.frament_splash), SplashView {

    @InjectPresenter
    lateinit var presenter: SplashPresenter

    @ProvidePresenter
    fun providePresenter(): SplashPresenter = get()
    //TODO add some cool animation
}