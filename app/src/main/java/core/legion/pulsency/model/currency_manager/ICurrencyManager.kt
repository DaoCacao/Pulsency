package core.legion.pulsency.model.currency_manager

import core.legion.pulsency.model.pojo.CurrencyItem
import io.reactivex.Observable
import kotlin.collections.ArrayList

interface ICurrencyManager {
    fun loadCurrencies(): Observable<ArrayList<CurrencyItem>>
}