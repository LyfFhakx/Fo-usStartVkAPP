package com.gmail.intellect.logos.vkapp.presentation.screen.login


import android.os.Bundle
import android.view.View
import com.arellomobile.mvp.presenter.InjectPresenter
import com.arellomobile.mvp.presenter.ProvidePresenter
import com.gmail.intellect.logos.vkapp.R
import com.gmail.intellect.logos.vkapp.presentation.common.BaseFragment
import kotlinx.android.synthetic.main.fragment_log_in.*
import javax.inject.Inject

class LoginFragment : BaseFragment(R.layout.fragment_log_in), LoginView {

    @Inject
    @InjectPresenter
    lateinit var presenter: LoginPresenter

    @ProvidePresenter
    fun providePresenter(): LoginPresenter = presenter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        logInButtonClick()
    }
    private fun getLoginData(){
        var name = logInAccount.text.toString()
        var password = logInPassword.text.toString()

    }

    private fun logInButtonClick() {
        getLoginData()
        logIn.setOnClickListener {
            when (it.id) {
                R.id.logIn -> presenter.login()
            }
        }
    }
}
