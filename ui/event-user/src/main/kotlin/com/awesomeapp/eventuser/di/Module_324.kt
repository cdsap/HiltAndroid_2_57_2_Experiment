package com.awesomeapp.eventuser.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.eventuser.Viewmodel324_1
import com.awesomeapp.eventuser.Activity324_2
import com.awesomeapp.eventuser.Activity324_3
import com.awesomeapp.eventuser.Fragment324_4
import com.awesomeapp.eventuser.Repository324_5
import com.awesomeapp.cartuser.Api300_6
import com.awesomeapp.messageuser.Api312_6
import com.awesomeapp.networkuser.Api308_6
import com.awesomeapp.mediacart.Api292_6
import com.awesomeapp.podcastcart.Api288_6
import com.awesomeapp.weathercart.Api284_6
import com.awesomeapp.commentuser.Api304_6
import com.awesomeapp.eventuser.Api324_6

@Module
@InstallIn(SingletonComponent::class)
object Module_324 {
    @Provides
    @Singleton
    fun provideRepository324_5(
        api0: Api300_6 = Api300_6(),
        api1: Api312_6 = Api312_6(),
        api2: Api308_6 = Api308_6(),
        api3: Api292_6 = Api292_6(),
        api4: Api288_6 = Api288_6(),
        api5: Api284_6 = Api284_6(),
        api6: Api304_6 = Api304_6()
    ): Repository324_5 {
        return Repository324_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6)
    }

    @Provides
    @Singleton
    fun provideApi324_6(): Api324_6 {
        return Api324_6()
    }
}