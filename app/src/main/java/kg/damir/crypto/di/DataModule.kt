package kg.damir.crypto.di

import android.app.Application
import dagger.Binds
import dagger.Module
import dagger.Provides
import kg.damir.crypto.data.database.AppDatabase
import kg.damir.crypto.data.database.CoinInfoDao
import kg.damir.crypto.data.network.model.CoinInfoDto
import kg.damir.crypto.data.repository.CoinRepositoryImpl
import kg.damir.crypto.domain.CoinRepository

@Module
interface DataModule {
    @Binds
    fun bindCoinRepository(impl: CoinRepositoryImpl): CoinRepository

    companion object {

        @Provides
        fun provideCoinInfoDao(application: Application): CoinInfoDao {
            return AppDatabase.getInstance(application).coinPriceInfoDao()
        }
    }
}