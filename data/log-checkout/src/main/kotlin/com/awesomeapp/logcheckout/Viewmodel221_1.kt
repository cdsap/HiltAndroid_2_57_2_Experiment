package com.awesomeapp.logcheckout

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
import com.awesomeapp.photoidentity.Repository192_5
import com.awesomeapp.searchcheckout.Repository208_5
import com.awesomeapp.playlistidentity.Repository196_5
import com.awesomeapp.listidentity.Repository184_5
import com.awesomeapp.calendaridentity.Repository176_5
import com.awesomeapp.identitycheckout.Repository200_5


@HiltViewModel
class Viewmodel221_1 @Inject constructor(
    private val repository0: Repository192_5,
    private val repository1: Repository208_5,
    private val repository2: Repository196_5,
    private val repository3: Repository184_5,
    private val repository4: Repository176_5,
    private val repository5: Repository200_5
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