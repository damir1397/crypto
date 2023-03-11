package kg.damir.crypto.domain

class GetCoinInfoListUseCase(private val repository: CoinRepository) {
    operator fun invoke() = repository.getCoinInfoList()
}