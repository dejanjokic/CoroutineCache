package net.dejanjokic.coroutinecache.data

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.squareup.moshi.Json

@Entity(tableName = "quotes")
data class QuoteData(
    @PrimaryKey
    val id: Int = 0,
    @field:Json(name = "quote") val quote: String
)