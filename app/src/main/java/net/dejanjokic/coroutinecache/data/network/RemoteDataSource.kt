package net.dejanjokic.coroutinecache.data.network

import net.dejanjokic.coroutinecache.data.QuoteData
import javax.inject.Inject

class RemoteDataSource @Inject constructor(private val api: QuoteService) {

    suspend fun getRandomQuote(): QuoteData = api.getRandomQuote()
}