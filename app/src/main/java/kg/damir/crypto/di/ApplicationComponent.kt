package kg.damir.crypto.di

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import kg.damir.crypto.presentation.CoinDetailFragment
import kg.damir.crypto.presentation.MainActivity

@Component(
    modules = [
        DataModule::class,
        ViewModelModule::class
    ]
)
interface ApplicationComponent {
    fun inject(mainActivity: MainActivity)
    fun inject(coinDetailFragment: CoinDetailFragment)

    @Component.Factory
    interface Factory {


        fun create(
            @BindsInstance application: Application
        ): ApplicationComponent
    }
}