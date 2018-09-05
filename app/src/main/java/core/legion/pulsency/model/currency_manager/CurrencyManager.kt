package core.legion.pulsency.model.currency_manager

import core.legion.pulsency.GetCurrenciesService
import core.legion.pulsency.model.pojo.CurrencyItem
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Inject


class CurrencyManager @Inject constructor() : ICurrencyManager {

    private val currenciesLink = "http://phisix-api3.appspot.com/"

    private val currencies = Retrofit.Builder()
            .baseUrl(currenciesLink)
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()
            .create(GetCurrenciesService::class.java)
            .getAllCurrencies()
            .map { it.stock }

    override fun getCurrencies() = currencies!!

    override fun onUpdate(): Observable<ArrayList<CurrencyItem>> {
        return Observable
                .interval(1, TimeUnit.SECONDS)
                .flatMap { currencies }
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
    }
}

