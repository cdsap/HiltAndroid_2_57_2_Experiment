package com.awesomeapp.articlelogin

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.cartlogin.Api104_6
import com.awesomeapp.mediacontact.Api96_6
import com.awesomeapp.metriccontact.Api76_6
import com.awesomeapp.podcastcontact.Api92_6
import com.awesomeapp.analyticscontact.Api72_6


@Singleton
class Repository140_5 @Inject constructor(
    private val api0: Api104_6,
    private val api1: Api96_6,
    private val api2: Api76_6,
    private val api3: Api92_6,
    private val api4: Api72_6
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