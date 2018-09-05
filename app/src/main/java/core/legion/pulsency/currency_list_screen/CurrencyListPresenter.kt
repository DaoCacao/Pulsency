package core.legion.pulsency.currency_list_screen

import core.legion.pulsency.model.currency_manager.ICurrencyManager
import javax.inject.Inject

class CurrencyListPresenter @Inject constructor() : CurrencyListFacade.Presenter {

    @Inject lateinit var view: CurrencyListFacade.View
    @Inject lateinit var currencyManager: ICurrencyManager

    override fun onViewCreated() {
        currencyManager
                .onUpdate()
                .subscribe({ view.showCurrencies(it) }, { view.showToast(it.localizedMessage) })
    }

    override fun onRefreshClick() {
        currencyManager
                .getCurrencies()
                .subscribe({ view.showCurrencies(it) }, { view.showToast(it.message!!) })
    }
}