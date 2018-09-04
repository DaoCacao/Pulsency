package core.legion.pulsency.currency_list_screen

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import core.legion.pulsency.R
import core.legion.pulsency.model.pojo.CurrencyItem
import kotlinx.android.synthetic.main.item_currency.view.*

class CurrencyVH(val parent: ViewGroup) : RecyclerView.ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_currency, parent)) {

    fun bind(item: CurrencyItem) {
        itemView.tvName.text = item.name
        itemView.tvAmount.text = item.amount.toString()
        itemView.tvVolume.text = item.volume.toString()
    }
}