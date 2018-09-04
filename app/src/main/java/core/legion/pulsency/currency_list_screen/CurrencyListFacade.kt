package core.legion.pulsency.currency_list_screen

interface CurrencyListFacade {

    interface View {}

    interface Presenter {
        fun onViewCreated()
    }
}