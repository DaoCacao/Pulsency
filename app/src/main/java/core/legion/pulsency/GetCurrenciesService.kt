package core.legion.pulsency

import core.legion.pulsency.model.pojo.JsonBase
import io.reactivex.Observable
import retrofit2.http.GET

interface GetCurrenciesService {

    @GET("/stocks.json")
    fun getAllCurrencies(): Observable<JsonBase>
}