package com.awesomeapp.alarmcart

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.audiocheckout.Api244_6
import com.awesomeapp.videocheckout.Api240_6
import com.awesomeapp.todocheckout.Api232_6
import com.awesomeapp.forecastcheckout.Api236_6
import com.awesomeapp.sharecheckout.Api212_6
import com.awesomeapp.timercheckout.Api228_6


@Singleton
class Repository276_5 @Inject constructor(
    private val api0: Api244_6,
    private val api1: Api240_6,
    private val api2: Api232_6,
    private val api3: Api236_6,
    private val api4: Api212_6,
    private val api5: Api228_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
            coroutineScope {
                val apis = listOf<suspend () -> String>(
                    { api0.fetchData() },
                        { api1.fetchData() },
                        { api2.fetchData() },
                        { api3.fetchData() },
                        { api4.fetchData() },
                        { api5.fetchData() }
                )
                val results = apis.map { fetcher ->
                    async { fetcher() }
                }.awaitAll()
                results.joinToString("")
            }
    }
}