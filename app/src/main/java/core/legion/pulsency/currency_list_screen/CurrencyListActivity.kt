package core.legion.pulsency.currency_list_screen

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import core.legion.pulsency.R
import core.legion.pulsency.model.pojo.CurrencyItem
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_currency_list.*
import javax.inject.Inject

class CurrencyListActivity : DaggerAppCompatActivity(), CurrencyListFacade.View {

    @Inject lateinit var presenter: CurrencyListFacade.Presenter
    @Inject lateinit var adapter: CurrencyAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_currency_list)

        setSupportActionBar(toolbar)

        rvCurrencies.adapter = adapter

        presenter.onViewCreated()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_refresh, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        if (item?.itemId == R.id.refresh) presenter.onRefreshClick()
        return super.onOptionsItemSelected(item)
    }

    override fun showCurrencies(currencies: ArrayList<CurrencyItem>) {
        adapter.currencies = currencies
        adapter.notifyDataSetChanged()
    }

    override fun showToast(text: String) = Toast.makeText(this, text, Toast.LENGTH_SHORT).show()

}

