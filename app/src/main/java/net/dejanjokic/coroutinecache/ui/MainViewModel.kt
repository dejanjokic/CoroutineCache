package net.dejanjokic.coroutinecache.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import net.dejanjokic.coroutinecache.data.QuoteRepository
import javax.inject.Inject

class MainViewModel @Inject constructor(private val repository: QuoteRepository) : ViewModel() {

    val quote = repository.quote

    fun refreshQuote() = viewModelScope.launch {
        repository.refreshQuote()
    }

    // *******
//    val state: LiveData<QuoteState> = MutableLiveData<QuoteState.Loading>()
}