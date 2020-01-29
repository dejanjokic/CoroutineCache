package net.dejanjokic.coroutinecache.data

import androidx.lifecycle.map
import net.dejanjokic.coroutinecache.data.local.LocalDataSource
import net.dejanjokic.coroutinecache.data.network.RemoteDataSource
import javax.inject.Inject

class QuoteRepository @Inject constructor(
    private val local: LocalDataSource, private val remote: RemoteDataSource) {

    val quote = local.getQuote().map { it?.quote }

    suspend fun refreshQuote() {
        try {
            val result = remote.getRandomQuote()
            local.saveQuote(result)
        } catch (t: Throwable) {
            println("Error: $t")
        }
    }
}