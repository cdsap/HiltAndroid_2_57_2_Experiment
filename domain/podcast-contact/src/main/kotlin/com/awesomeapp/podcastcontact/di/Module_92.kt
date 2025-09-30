package com.awesomeapp.podcastcontact.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.podcastcontact.Viewmodel92_1
import com.awesomeapp.podcastcontact.Activity92_2
import com.awesomeapp.podcastcontact.Activity92_3
import com.awesomeapp.podcastcontact.Fragment92_4
import com.awesomeapp.podcastcontact.Repository92_5
import com.awesomeapp.synccontact.Api64_6
import com.awesomeapp.forecast.Api40_6
import com.awesomeapp.postcontact.Api60_6
import com.awesomeapp.video.Api44_6
import com.awesomeapp.logincontact.Api52_6
import com.awesomeapp.podcastcontact.Api92_6

@Module
@InstallIn(SingletonComponent::class)
object Module_92 {
    @Provides
    @Singleton
    fun provideRepository92_5(
        api0: Api64_6 = Api64_6(),
        api1: Api40_6 = Api40_6(),
        api2: Api60_6 = Api60_6(),
        api3: Api44_6 = Api44_6(),
        api4: Api52_6 = Api52_6()
    ): Repository92_5 {
        return Repository92_5(api0, 
        api1, 
        api2, 
        api3, 
        api4)
    }

    @Provides
    @Singleton
    fun provideApi92_6(): Api92_6 {
        return Api92_6()
    }
}