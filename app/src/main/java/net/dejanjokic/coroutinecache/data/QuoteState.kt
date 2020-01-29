package net.dejanjokic.coroutinecache.data

sealed class QuoteState {
    object Loading : QuoteState()
    data class Success(val data: String) : QuoteState()
    data class Error(val message: String) : QuoteState()
}