package core.legion.pulsency.launch_screen

interface LaunchFacade {

    interface View {
        fun startAnimation()
    }

    interface Presenter {
        fun onViewCreated()

        fun onAnimationEnd()
    }
}