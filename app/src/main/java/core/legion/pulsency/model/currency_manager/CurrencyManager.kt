package core.legion.pulsency.model.currency_manager

import core.legion.pulsency.model.pojo.CurrencyItem
import io.reactivex.Observable

class CurrencyManager : ICurrencyManager {

    private val currenciesLink = "http://phisix-api3.appspot.com/stocks.json"

    override fun loadCurrencies(): Observable<ArrayList<CurrencyItem>> {
        return Observable.just(ArrayList())
    }
}

