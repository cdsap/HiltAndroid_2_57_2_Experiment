package com.awesomeapp.mapuser.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.mapuser.Viewmodel332_1
import com.awesomeapp.mapuser.Activity332_2
import com.awesomeapp.mapuser.Activity332_3
import com.awesomeapp.mapuser.Fragment332_4
import com.awesomeapp.mapuser.Repository332_5
import com.awesomeapp.messageuser.Api312_6
import com.awesomeapp.commentuser.Api304_6
import com.awesomeapp.weathercart.Api284_6
import com.awesomeapp.cartuser.Api300_6
import com.awesomeapp.contactuser.Api296_6
import com.awesomeapp.podcastcart.Api288_6
import com.awesomeapp.networkuser.Api308_6
import com.awesomeapp.mapuser.Api332_6

@Module
@InstallIn(SingletonComponent::class)
object Module_332 {
    @Provides
    @Singleton
    fun provideRepository332_5(
        api0: Api312_6 = Api312_6(),
        api1: Api304_6 = Api304_6(),
        api2: Api284_6 = Api284_6(),
        api3: Api300_6 = Api300_6(),
        api4: Api296_6 = Api296_6(),
        api5: Api288_6 = Api288_6(),
        api6: Api308_6 = Api308_6()
    ): Repository332_5 {
        return Repository332_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6)
    }

    @Provides
    @Singleton
    fun provideApi332_6(): Api332_6 {
        return Api332_6()
    }
}