package kg.damir.crypto.data.database

import androidx.room.Entity
import androidx.room.PrimaryKey
import kg.damir.crypto.data.network.ApiFactory.BASE_IMAGE_URL
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import kg.damir.crypto.utils.convertTimestampToTime

@Entity(tableName = "full_price_list")
data class CoinInfoDbModel(
    @PrimaryKey
    val fromSymbol: String,
    val toSymbol: String?,
    val price: String?,
    val lastUpdate: Long?,
    val highDay: String?,
    val lowDay: String?,
    val lastMarket: String?,
    val imageUrl: String?
)
