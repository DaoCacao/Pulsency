package core.legion.pulsency.app

import dagger.android.support.DaggerApplication
import javax.inject.Inject

class AppLoader @Inject constructor() : DaggerApplication() {

    override fun applicationInjector() = DaggerAppComponent.builder().appModule(AppModule(this)).build()!!
}