package com.awesomeapp.timercheckout

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.fileidentity.Api180_6
import com.awesomeapp.listidentity.Api184_6
import com.awesomeapp.identitycheckout.Api200_6
import com.awesomeapp.calendaridentity.Api176_6
import com.awesomeapp.newsidentity.Api188_6


@Singleton
class Repository228_5 @Inject constructor(
    private val api0: Api180_6,
    private val api1: Api184_6,
    private val api2: Api200_6,
    private val api3: Api176_6,
    private val api4: Api188_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
            coroutineScope {
                val apis = listOf<suspend () -> String>(
                    { api0.fetchData() },
                        { api1.fetchData() },
                        { api2.fetchData() },
                        { api3.fetchData() },
                        { api4.fetchData() }
                )
                val results = apis.map { fetcher ->
                    async { fetcher() }
                }.awaitAll()
                results.joinToString("")
            }
    }
}