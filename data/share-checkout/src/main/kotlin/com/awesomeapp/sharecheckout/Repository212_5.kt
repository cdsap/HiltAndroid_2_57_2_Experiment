package com.awesomeapp.sharecheckout

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.searchcheckout.Api208_6
import com.awesomeapp.photoidentity.Api192_6
import com.awesomeapp.listidentity.Api184_6
import com.awesomeapp.playlistidentity.Api196_6
import com.awesomeapp.calendaridentity.Api176_6
import com.awesomeapp.newsidentity.Api188_6


@Singleton
class Repository212_5 @Inject constructor(
    private val api0: Api208_6,
    private val api1: Api192_6,
    private val api2: Api184_6,
    private val api3: Api196_6,
    private val api4: Api176_6,
    private val api5: Api188_6
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