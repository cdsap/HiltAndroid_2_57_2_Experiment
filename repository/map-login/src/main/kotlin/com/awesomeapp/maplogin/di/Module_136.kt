package com.awesomeapp.maplogin.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.maplogin.Viewmodel136_1
import com.awesomeapp.maplogin.Activity136_2
import com.awesomeapp.maplogin.Activity136_3
import com.awesomeapp.maplogin.Fragment136_4
import com.awesomeapp.maplogin.Repository136_5
import com.awesomeapp.mediacontact.Api96_6
import com.awesomeapp.analyticscontact.Api72_6
import com.awesomeapp.alarmcontact.Api80_6
import com.awesomeapp.metriccontact.Api76_6
import com.awesomeapp.weathercontact.Api88_6
import com.awesomeapp.notecontact.Api84_6
import com.awesomeapp.cartlogin.Api104_6
import com.awesomeapp.contactlogin.Api100_6
import com.awesomeapp.podcastcontact.Api92_6
import com.awesomeapp.maplogin.Api136_6

@Module
@InstallIn(SingletonComponent::class)
object Module_136 {
    @Provides
    @Singleton
    fun provideRepository136_5(
        api0: Api96_6 = Api96_6(),
        api1: Api72_6 = Api72_6(),
        api2: Api80_6 = Api80_6(),
        api3: Api76_6 = Api76_6(),
        api4: Api88_6 = Api88_6(),
        api5: Api84_6 = Api84_6(),
        api6: Api104_6 = Api104_6(),
        api7: Api100_6 = Api100_6(),
        api8: Api92_6 = Api92_6()
    ): Repository136_5 {
        return Repository136_5(api0, 
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
    fun provideApi136_6(): Api136_6 {
        return Api136_6()
    }
}