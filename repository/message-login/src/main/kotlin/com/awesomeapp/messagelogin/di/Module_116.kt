package com.awesomeapp.messagelogin.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.messagelogin.Viewmodel116_1
import com.awesomeapp.messagelogin.Activity116_2
import com.awesomeapp.messagelogin.Activity116_3
import com.awesomeapp.messagelogin.Fragment116_4
import com.awesomeapp.messagelogin.Repository116_5
import com.awesomeapp.metriccontact.Api76_6
import com.awesomeapp.alarmcontact.Api80_6
import com.awesomeapp.mediacontact.Api96_6
import com.awesomeapp.weathercontact.Api88_6
import com.awesomeapp.cartlogin.Api104_6
import com.awesomeapp.contactlogin.Api100_6
import com.awesomeapp.podcastcontact.Api92_6
import com.awesomeapp.analyticscontact.Api72_6
import com.awesomeapp.notecontact.Api84_6
import com.awesomeapp.messagelogin.Api116_6

@Module
@InstallIn(SingletonComponent::class)
object Module_116 {
    @Provides
    @Singleton
    fun provideRepository116_5(
        api0: Api76_6 = Api76_6(),
        api1: Api80_6 = Api80_6(),
        api2: Api96_6 = Api96_6(),
        api3: Api88_6 = Api88_6(),
        api4: Api104_6 = Api104_6(),
        api5: Api100_6 = Api100_6(),
        api6: Api92_6 = Api92_6(),
        api7: Api72_6 = Api72_6(),
        api8: Api84_6 = Api84_6()
    ): Repository116_5 {
        return Repository116_5(api0, 
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
    fun provideApi116_6(): Api116_6 {
        return Api116_6()
    }
}