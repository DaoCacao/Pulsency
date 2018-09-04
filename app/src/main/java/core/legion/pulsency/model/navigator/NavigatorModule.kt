package core.legion.pulsency.model.navigator

import dagger.Binds
import dagger.Module

@Module
abstract class NavigatorModule {

    @Binds
    abstract fun navigator(navigatorManager: NavigatorManager): Navigator

}