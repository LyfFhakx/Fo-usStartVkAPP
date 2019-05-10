package com.gmail.intellect.logos.vkapp.view.fragment

import com.gmail.intellect.logos.vkapp.App
import com.gmail.intellect.logos.vkapp.R
import com.gmail.intellect.logos.vkapp.navigation.screens.Screen
import kotlinx.android.synthetic.main.frament_splash.*


class SplashFragment : BaseFragment(R.layout.frament_splash) {

    override fun onResume() {
        super.onResume()

        FragmentSplash.postDelayed({
            App.INCTANCE.router.replaceScreen(Screen.ProfileViewScreen())
        }, 3000)
    }

}