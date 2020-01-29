package net.dejanjokic.coroutinecache.data.local

import net.dejanjokic.coroutinecache.data.QuoteData
import javax.inject.Inject

class LocalDataSource @Inject constructor(private val db: QuoteDatabase) {

    fun getQuote() = db.quoteDao().getQuote()

    suspend fun saveQuote(quoteData: QuoteData) = db.quoteDao().saveQuote(quoteData)
}