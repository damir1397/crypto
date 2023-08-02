package kg.damir.crypto.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.ViewModelFactoryDsl
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import kg.damir.crypto.presentation.CoinViewModel


@Module
interface ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(CoinViewModel::class)
    fun bindCoinViewModel(viewModel: CoinViewModel):ViewModel
}