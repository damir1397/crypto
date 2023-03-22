package kg.damir.crypto.domain

class LoadDateUseCase(private val repository: CoinRepository) {
    suspend operator fun invoke() = repository.loadData()
}