package core.legion.pulsency.launch_screen

import dagger.Binds
import dagger.Module

@Module
abstract class LaunchModule {

    @Binds
    abstract fun view(activity: LaunchActivity): LaunchFacade.View

    @Binds
    abstract fun presenter(presenter: LaunchPresenter): LaunchFacade.Presenter
}