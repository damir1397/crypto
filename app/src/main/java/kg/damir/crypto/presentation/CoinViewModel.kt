package kg.damir.crypto.presentation

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import kg.damir.crypto.data.repository.CoinRepositoryImpl
import kg.damir.crypto.domain.GetCoinInfoListUseCase
import kg.damir.crypto.domain.GetCoinInfoUseCase
import kg.damir.crypto.domain.LoadDateUseCase
import kotlinx.coroutines.launch

class CoinViewModel(application: Application) : AndroidViewModel(application) {

    val repository = CoinRepositoryImpl(application)

    private  val getCoinInfoListUseCase = GetCoinInfoListUseCase(repository)
    private  val getCoinInfoUseCase = GetCoinInfoUseCase(repository)
    private  val loadDataUseCase = LoadDateUseCase(repository)

    val coinInfoList = getCoinInfoListUseCase()
    fun getDetailInfo(fSym: String)= getCoinInfoUseCase(fSym)

    init {
        loadDataUseCase()
    }

}