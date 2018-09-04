package core.legion.pulsency.model.navigator

import android.content.Context
import android.content.Intent
import core.legion.pulsency.currency_list_screen.CurrencyListActivity
import javax.inject.Inject

class NavigatorManager @Inject constructor(private val context: Context) : Navigator {

    override fun currencyListScreen() {
        Intent(context, CurrencyListActivity::class.java).apply {
            flags = Intent.FLAG_ACTIVITY_CLEAR_TASK
            context.startActivity(this)
        }
    }
}