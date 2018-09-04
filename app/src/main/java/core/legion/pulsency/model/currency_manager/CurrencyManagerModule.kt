package core.legion.pulsency.model.currency_manager

import dagger.Binds
import dagger.Module

@Module
abstract class CurrencyManagerModule {

    @Binds
abstract fun currencyManager(manager: CurrencyManager): ICurrencyManager
}