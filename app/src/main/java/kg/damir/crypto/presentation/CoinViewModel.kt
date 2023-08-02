package kg.damir.crypto.presentation

import androidx.lifecycle.ViewModel
import kg.damir.crypto.domain.GetCoinInfoListUseCase
import kg.damir.crypto.domain.GetCoinInfoUseCase
import kg.damir.crypto.domain.LoadDateUseCase
import javax.inject.Inject

class CoinViewModel @Inject constructor(
    private val getCoinInfoListUseCase: GetCoinInfoListUseCase,
    private val getCoinInfoUseCase: GetCoinInfoUseCase,
    private val loadDataUseCase: LoadDateUseCase

) : ViewModel() {


    val coinInfoList = getCoinInfoListUseCase()
    fun getDetailInfo(fSym: String) = getCoinInfoUseCase(fSym)

    init {
        loadDataUseCase()
    }

}