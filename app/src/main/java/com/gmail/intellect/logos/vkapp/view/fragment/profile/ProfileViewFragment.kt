package com.gmail.intellect.logos.vkapp.view.fragment.profile

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.arellomobile.mvp.presenter.InjectPresenter
import com.gmail.intellect.logos.vkapp.App
import com.gmail.intellect.logos.vkapp.R
import com.gmail.intellect.logos.vkapp.model.loadImage
import com.gmail.intellect.logos.vkapp.navigation.screens.Screen
import com.gmail.intellect.logos.vkapp.view.fragment.BaseFragment
import com.gmail.intellect.logos.vkapp.presenter.ProfileViewPresenter
import com.gmail.intellect.logos.vkapp.view.ProfileView
import com.gmail.intellect.logos.vkapp.view.fragment.profile.message.BaseMessage
import kotlinx.android.synthetic.main.fragment_profile_view.*

class ProfileViewFragment : BaseFragment(R.layout.fragment_profile_view),
    ProfileView {

    @InjectPresenter
    lateinit var presenter: ProfileViewPresenter

    private val feedAdapter = FeedAdapter()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initToolbar()
        initFeed()
    }

    private fun initFeed() {
        profileViewFeed.isNestedScrollingEnabled = false
        profileViewFeed.layoutManager = LinearLayoutManager(context)
        profileViewFeed.adapter = feedAdapter
    }

    override fun showProfile(fullName: String, birthDate: String, city: String, languages: String,image:String)
    {
        profileViewFirstName.text = fullName
        profileViewBirthDate.text = birthDate
        profileViewCity.text = city
        profileViewLanguages.text = languages
        profileViewAvatar.loadImage(image)
//        TODO("Create all parameters")
    }

    override fun showFeed(items: List<BaseMessage>) {
        feedAdapter.setItems(items)
    }

    private fun initToolbar() {
        profileViewToolbar.inflateMenu(R.menu.menu_profile_view)
        profileViewToolbar.setOnMenuItemClickListener {
            when (it.itemId) {
                R.id.action_profile_edit -> {
                    App.INCTANCE.router.replaceScreen(Screen.EditProfileScreen())
  //                  TODO("Navigate to profile edit")
                }

                R.id.action_logout -> presenter.logout()
            }

            true
        }
    }
}