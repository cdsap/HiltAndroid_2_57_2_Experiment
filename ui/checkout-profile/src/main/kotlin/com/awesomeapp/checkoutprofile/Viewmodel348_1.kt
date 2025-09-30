package com.awesomeapp.checkoutprofile

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject
import com.awesomeapp.networkuser.Repository308_5
import com.awesomeapp.weathercart.Repository284_5
import com.awesomeapp.cartuser.Repository300_5
import com.awesomeapp.contactuser.Repository296_5
import com.awesomeapp.messageuser.Repository312_5
import com.awesomeapp.commentuser.Repository304_5


@HiltViewModel
class Viewmodel348_1 @Inject constructor(
    private val repository0: Repository308_5,
    private val repository1: Repository284_5,
    private val repository2: Repository300_5,
    private val repository3: Repository296_5,
    private val repository4: Repository312_5,
    private val repository5: Repository304_5
) : ViewModel() {
    private val _state = MutableStateFlow<String>("")
    val state: StateFlow<String> = _state.asStateFlow()

    init {
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val data = coroutineScope {
                    val fetchers = listOf<suspend () -> String>(
                        { repository0.getData() },
                            { repository1.getData() },
                            { repository2.getData() },
                            { repository3.getData() },
                            { repository4.getData() },
                            { repository5.getData() }
                    )
                    val results = fetchers.map { fetcher ->
                        async { fetcher() }
                    }.awaitAll()
                    results.joinToString("")
                }
                _state.emit(data)
            } catch (e: Exception) {
                _state.emit("Error: ${e.message}")
            }
        }
    }
}