package core.legion.pulsency.currency_list_screen

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import core.legion.pulsency.model.pojo.CurrencyItem

class CurrencyAdapter : RecyclerView.Adapter<CurrencyVH>() {

    var currencies = ArrayList<CurrencyItem>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = CurrencyVH(parent)
    override fun getItemCount() = currencies.size
    override fun onBindViewHolder(holder: CurrencyVH, position: Int) = holder.bind(currencies[position])
}