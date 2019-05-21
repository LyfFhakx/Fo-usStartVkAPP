package com.gmail.intellect.logos.vkapp.presentation.screen.profile

import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.arellomobile.mvp.presenter.InjectPresenter
import com.arellomobile.mvp.presenter.ProvidePresenter
import com.gmail.intellect.logos.vkapp.R
import com.gmail.intellect.logos.vkapp.data.ProfileData
import com.gmail.intellect.logos.vkapp.presentation.common.BaseFragment
import com.gmail.intellect.logos.vkapp.presentation.common.BaseMessage
import com.gmail.intellect.logos.vkapp.presentation.common.loadImage
import com.gmail.intellect.logos.vkapp.presentation.screen.profile.feed.FeedAdapter
import kotlinx.android.synthetic.main.fragment_profile_view.*
import org.koin.android.ext.android.get
import org.koin.android.ext.android.inject
import ru.terrakok.cicerone.Router

class ProfileViewFragment : BaseFragment(R.layout.fragment_profile_view),
    ProfileView {

    @InjectPresenter
    lateinit var presenter: ProfileViewPresenter

    @ProvidePresenter
    fun providePresenter():ProfileViewPresenter = get()

    private val router by inject<Router>()

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

    override fun showProfile(profileDate: ProfileData)
    {
        profileViewFullName.text = profileDate.fullName
        profileViewBirthDate.text = profileDate.birthDate
        profileViewCity.text = profileDate.city
        profileViewLanguages.text = profileDate.languages
        profileViewAvatar.loadImage(profileDate.image)
    }

    override fun showFeed(items: List<BaseMessage>) {
        feedAdapter.setItems(items)
    }

    private fun initToolbar() {
        profileViewToolbar.inflateMenu(R.menu.menu_profile_view)
        profileViewToolbar.setOnMenuItemClickListener {
            when (it.itemId) {
                R.id.action_profile_edit -> presenter.editProfile()
                R.id.action_logout -> presenter.logout()
            }

            true
        }
    }
}