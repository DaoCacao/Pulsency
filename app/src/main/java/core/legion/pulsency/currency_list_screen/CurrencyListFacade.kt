package core.legion.pulsency.currency_list_screen

import core.legion.pulsency.model.pojo.CurrencyItem

interface CurrencyListFacade {

    interface View {
        fun showCurrencies(currencies: ArrayList<CurrencyItem>)
        fun showToast(text: String)
    }

    interface Presenter {
        fun onViewCreated()

        fun onRefreshClick()
    }
}