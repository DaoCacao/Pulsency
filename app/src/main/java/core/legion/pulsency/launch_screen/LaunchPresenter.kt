package core.legion.pulsency.launch_screen

import core.legion.pulsency.model.navigator.Navigator
import javax.inject.Inject

class LaunchPresenter @Inject constructor() : LaunchFacade.Presenter {

    @Inject lateinit var view: LaunchFacade.View
    @Inject lateinit var navigator: Navigator

    override fun onViewCreated() {
        view.startAnimation()
    }

    override fun onAnimationEnd() {
        navigator.currencyListScreen()
    }
}