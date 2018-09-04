package core.legion.pulsency.currency_list_screen

import dagger.Binds
import dagger.Module

@Module
abstract class CurrencyListModule {

    @Binds
    abstract fun view(activity: CurrencyListActivity): CurrencyListFacade.View

    @Binds
    abstract fun presenter(presenter: CurrencyListPresenter): CurrencyListFacade.Presenter
}