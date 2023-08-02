package kg.damir.crypto.presentation

import android.app.Application
import kg.damir.crypto.di.DaggerApplicationComponent

class CoinApp : Application() {
    val component by lazy {
        DaggerApplicationComponent.factory().create(this)
    }

}