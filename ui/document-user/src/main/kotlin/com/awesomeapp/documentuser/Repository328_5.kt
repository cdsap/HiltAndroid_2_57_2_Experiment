package com.awesomeapp.documentuser

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import javax.inject.Inject
import javax.inject.Singleton
import com.awesomeapp.contactuser.Api296_6
import com.awesomeapp.messageuser.Api312_6
import com.awesomeapp.cartuser.Api300_6
import com.awesomeapp.weathercart.Api284_6
import com.awesomeapp.networkuser.Api308_6
import com.awesomeapp.mediacart.Api292_6
import com.awesomeapp.commentuser.Api304_6


@Singleton
class Repository328_5 @Inject constructor(
    private val api0: Api296_6,
    private val api1: Api312_6,
    private val api2: Api300_6,
    private val api3: Api284_6,
    private val api4: Api308_6,
    private val api5: Api292_6,
    private val api6: Api304_6
) {
    suspend fun getData(): String = withContext(Dispatchers.IO) {
            coroutineScope {
                val apis = listOf<suspend () -> String>(
                    { api0.fetchData() },
                        { api1.fetchData() },
                        { api2.fetchData() },
                        { api3.fetchData() },
                        { api4.fetchData() },
                        { api5.fetchData() },
                        { api6.fetchData() }
                )
                val results = apis.map { fetcher ->
                    async { fetcher() }
                }.awaitAll()
                results.joinToString("")
            }
    }
}