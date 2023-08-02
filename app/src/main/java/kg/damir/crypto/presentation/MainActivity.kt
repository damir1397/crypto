package kg.damir.crypto.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import kg.damir.crypto.databinding.ActivityMainBinding
import kg.damir.crypto.domain.CoinInfo
import kg.damir.crypto.presentation.adapter.CoinInfoAdapter
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: CoinViewModel

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    private val component by lazy {
       ( application as CoinApp).component
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        component.inject(this)
        val adapter = CoinInfoAdapter(this)
        adapter.onCoinClickListener = object : CoinInfoAdapter.OnCoinClickListener {
            override fun onCoinClick(coinPriceInfo: CoinInfo) {
                val intent = CoinDetailActivity.newIntent(
                    this@MainActivity,
                    coinPriceInfo.fromSymbol
                )
                startActivity(intent)
            }
        }
        binding.rvCoinPriceList.adapter = adapter
        binding.rvCoinPriceList.itemAnimator = null
        viewModel = ViewModelProvider(this,viewModelFactory)[CoinViewModel::class.java]
        viewModel.coinInfoList.observe(this) {
            adapter.submitList(it)
        }
    }
}

