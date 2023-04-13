package kg.damir.crypto.domain

class LoadDateUseCase(private val repository: CoinRepository) {
    operator fun invoke() = repository.loadData()
}