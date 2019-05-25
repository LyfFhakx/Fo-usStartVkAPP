package com.gmail.intellect.logos.vkapp.presentation.navigation

import androidx.fragment.app.Fragment
import com.gmail.intellect.logos.vkapp.presentation.common.BaseScreen
import com.gmail.intellect.logos.vkapp.presentation.screen.profile.ProfileViewFragment
import com.gmail.intellect.logos.vkapp.presentation.screen.editProfile.EditProfile
import com.gmail.intellect.logos.vkapp.presentation.screen.login.LoginFragment
import com.gmail.intellect.logos.vkapp.presentation.screen.splash.SplashFragment

sealed class Screen(fragment: Fragment) : BaseScreen(fragment) {
    class SplashScreen : Screen(SplashFragment())
    class ProfileViewScreen : Screen(ProfileViewFragment())
    class LoginScreen : Screen(LoginFragment())
    class EditProfileScreen: Screen(EditProfile())
}
