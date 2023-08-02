package kg.damir.crypto.domain

import javax.inject.Inject

class LoadDateUseCase @Inject constructor(
    private val repository: CoinRepository
    ) {
    operator fun invoke() = repository.loadData()
}