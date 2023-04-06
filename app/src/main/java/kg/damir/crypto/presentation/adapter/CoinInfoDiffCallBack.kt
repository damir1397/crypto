package kg.damir.crypto.presentation.adapter

import androidx.recyclerview.widget.DiffUtil
import kg.damir.crypto.domain.CoinInfo

object CoinInfoDiffCallBack : DiffUtil.ItemCallback<CoinInfo>() {
    override fun areItemsTheSame(oldItem: CoinInfo, newItem: CoinInfo): Boolean {
        return oldItem.fromSymbol == newItem.fromSymbol
    }

    override fun areContentsTheSame(oldItem: CoinInfo, newItem: CoinInfo): Boolean {
        return oldItem == newItem
    }
}