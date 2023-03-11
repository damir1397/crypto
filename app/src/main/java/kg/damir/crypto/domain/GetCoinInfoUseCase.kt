package kg.damir.crypto.domain

class GetCoinInfoUseCase(private val repository: CoinRepository) {
    operator fun invoke(fromSymbol: String) = repository.getCoinInfo(fromSymbol)
}