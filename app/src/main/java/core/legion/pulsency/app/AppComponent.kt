package core.legion.pulsency.app

import core.legion.pulsency.model.currency_manager.CurrencyManagerModule
import core.legion.pulsency.model.navigator.NavigatorModule
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [
    AndroidSupportInjectionModule::class,
    AppModule::class,
    ActivityBindingModule::class,
    NavigatorModule::class,
    CurrencyManagerModule::class])
interface AppComponent : AndroidInjector<AppLoader>