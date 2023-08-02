package kg.damir.crypto.domain

import javax.inject.Inject

class GetCoinInfoUseCase @Inject constructor(
    val repository: CoinRepository
    ) {
    operator fun invoke(fromSymbol: String) = repository.getCoinInfo(fromSymbol)
}