package com.gmail.intellect.logos.vkapp.navigation.screens

import androidx.fragment.app.Fragment
import com.gmail.intellect.logos.vkapp.view.fragment.profile.ProfileViewFragment
import com.gmail.intellect.logos.vkapp.view.fragment.SplashFragment
import com.gmail.intellect.logos.vkapp.view.fragment.editProfile.EditProfile
import com.gmail.intellect.logos.vkapp.view.fragment.login.LogIn

sealed class Screen(fragment: Fragment) : BaseScreen(fragment) {
    class SplashScreen : Screen(SplashFragment())
    class ProfileViewScreen : Screen(ProfileViewFragment())
    class LogInScreen : Screen(LogIn())
    class EditProfileScreen: Screen(EditProfile())
}
