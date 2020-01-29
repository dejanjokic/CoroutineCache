package net.dejanjokic.coroutinecache.data.local

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query
import net.dejanjokic.coroutinecache.data.QuoteData

@Dao
interface QuoteDao {

    @Insert(onConflict = REPLACE)
    suspend fun saveQuote(quoteData: QuoteData)

    @Query("SELECT * FROM quotes where id = 0")
    fun getQuote(): LiveData<QuoteData?>
}