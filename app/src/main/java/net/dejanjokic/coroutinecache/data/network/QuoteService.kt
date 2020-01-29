package net.dejanjokic.coroutinecache.data.network

import net.dejanjokic.coroutinecache.data.QuoteData
import retrofit2.http.GET

interface QuoteService {

    @GET("/")
    suspend fun getRandomQuote(): QuoteData
}