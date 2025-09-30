package com.awesomeapp.eventlogin.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.eventlogin.Viewmodel128_1
import com.awesomeapp.eventlogin.Activity128_2
import com.awesomeapp.eventlogin.Activity128_3
import com.awesomeapp.eventlogin.Fragment128_4
import com.awesomeapp.eventlogin.Repository128_5
import com.awesomeapp.notecontact.Api84_6
import com.awesomeapp.contactlogin.Api100_6
import com.awesomeapp.mediacontact.Api96_6
import com.awesomeapp.analyticscontact.Api72_6
import com.awesomeapp.alarmcontact.Api80_6
import com.awesomeapp.podcastcontact.Api92_6
import com.awesomeapp.weathercontact.Api88_6
import com.awesomeapp.cartlogin.Api104_6
import com.awesomeapp.metriccontact.Api76_6
import com.awesomeapp.eventlogin.Api128_6

@Module
@InstallIn(SingletonComponent::class)
object Module_128 {
    @Provides
    @Singleton
    fun provideRepository128_5(
        api0: Api84_6 = Api84_6(),
        api1: Api100_6 = Api100_6(),
        api2: Api96_6 = Api96_6(),
        api3: Api72_6 = Api72_6(),
        api4: Api80_6 = Api80_6(),
        api5: Api92_6 = Api92_6(),
        api6: Api88_6 = Api88_6(),
        api7: Api104_6 = Api104_6(),
        api8: Api76_6 = Api76_6()
    ): Repository128_5 {
        return Repository128_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6, 
        api7, 
        api8)
    }

    @Provides
    @Singleton
    fun provideApi128_6(): Api128_6 {
        return Api128_6()
    }
}