package com.awesomeapp.documentuser.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.documentuser.Viewmodel328_1
import com.awesomeapp.documentuser.Activity328_2
import com.awesomeapp.documentuser.Activity328_3
import com.awesomeapp.documentuser.Fragment328_4
import com.awesomeapp.documentuser.Repository328_5
import com.awesomeapp.contactuser.Api296_6
import com.awesomeapp.messageuser.Api312_6
import com.awesomeapp.cartuser.Api300_6
import com.awesomeapp.weathercart.Api284_6
import com.awesomeapp.networkuser.Api308_6
import com.awesomeapp.mediacart.Api292_6
import com.awesomeapp.commentuser.Api304_6
import com.awesomeapp.documentuser.Api328_6

@Module
@InstallIn(SingletonComponent::class)
object Module_328 {
    @Provides
    @Singleton
    fun provideRepository328_5(
        api0: Api296_6 = Api296_6(),
        api1: Api312_6 = Api312_6(),
        api2: Api300_6 = Api300_6(),
        api3: Api284_6 = Api284_6(),
        api4: Api308_6 = Api308_6(),
        api5: Api292_6 = Api292_6(),
        api6: Api304_6 = Api304_6()
    ): Repository328_5 {
        return Repository328_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6)
    }

    @Provides
    @Singleton
    fun provideApi328_6(): Api328_6 {
        return Api328_6()
    }
}