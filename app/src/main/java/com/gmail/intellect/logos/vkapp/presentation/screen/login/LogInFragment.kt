package com.gmail.intellect.logos.vkapp.presentation.screen.login


import android.os.Bundle
import android.view.View
import com.arellomobile.mvp.presenter.InjectPresenter
import com.arellomobile.mvp.presenter.ProvidePresenter
import com.gmail.intellect.logos.vkapp.R
import com.gmail.intellect.logos.vkapp.presentation.common.BaseFragment
import kotlinx.android.synthetic.main.fragment_log_in.*
import org.koin.android.ext.android.get
import org.koin.android.ext.android.inject
import ru.terrakok.cicerone.Router

class LogInFragment : BaseFragment(R.layout.fragment_log_in), LogInView {
    @InjectPresenter
    lateinit var presenter: LoginPresenter

    @ProvidePresenter
    fun providePresenter(): LoginPresenter = get()

    private val router by inject<Router>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        logInButtonClick()
    }

    private fun logInButtonClick() {
        logIn.setOnClickListener {
            when (it.id) {
                R.id.logIn -> presenter.logIn()
            }
        }
    }
//    private fun logInCheck(){
//        if
//    }

}
