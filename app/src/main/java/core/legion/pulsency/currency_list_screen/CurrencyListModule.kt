package core.legion.pulsency.currency_list_screen

import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class CurrencyListModule {

    @Binds
    abstract fun view(activity: CurrencyListActivity): CurrencyListFacade.View

    @Binds
    abstract fun presenter(presenter: CurrencyListPresenter): CurrencyListFacade.Presenter

    @Module
    companion object {
        @JvmStatic
        @Provides
        fun adapter() = CurrencyAdapter()
    }
}