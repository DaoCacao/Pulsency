package core.legion.pulsency.currency_list_screen

import android.os.Bundle
import core.legion.pulsency.R
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_currency_list.*
import javax.inject.Inject

class CurrencyListActivity : DaggerAppCompatActivity(), CurrencyListFacade.View {

    @Inject lateinit var presenter: CurrencyListFacade.Presenter
    @Inject lateinit var adapter: CurrencyAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_currency_list)

        rvCurrencies.adapter = adapter

        presenter.onViewCreated()
    }
}

