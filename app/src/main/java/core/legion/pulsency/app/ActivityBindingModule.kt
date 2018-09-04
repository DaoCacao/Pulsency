package core.legion.pulsency.app

import core.legion.pulsency.currency_list_screen.CurrencyListActivity
import core.legion.pulsency.currency_list_screen.CurrencyListModule
import core.legion.pulsency.launch_screen.LaunchActivity
import core.legion.pulsency.launch_screen.LaunchModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface ActivityBindingModule {

    @ContributesAndroidInjector(modules = [LaunchModule::class])
    fun launch(): LaunchActivity

    @ContributesAndroidInjector(modules = [CurrencyListModule::class])
    fun currencyList(): CurrencyListActivity
}