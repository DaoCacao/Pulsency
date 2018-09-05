package core.legion.pulsency.model.currency_manager

import core.legion.pulsency.model.pojo.CurrencyItem
import io.reactivex.Observable
import io.reactivex.Single
import kotlin.collections.ArrayList

interface ICurrencyManager {

    fun getCurrencies(): Observable<ArrayList<CurrencyItem>>

    fun onUpdate(): Observable<ArrayList<CurrencyItem>>
}