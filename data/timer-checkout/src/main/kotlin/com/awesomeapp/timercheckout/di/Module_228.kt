package com.awesomeapp.timercheckout.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.timercheckout.Viewmodel228_1
import com.awesomeapp.timercheckout.Activity228_2
import com.awesomeapp.timercheckout.Activity228_3
import com.awesomeapp.timercheckout.Fragment228_4
import com.awesomeapp.timercheckout.Repository228_5
import com.awesomeapp.fileidentity.Api180_6
import com.awesomeapp.listidentity.Api184_6
import com.awesomeapp.identitycheckout.Api200_6
import com.awesomeapp.calendaridentity.Api176_6
import com.awesomeapp.newsidentity.Api188_6
import com.awesomeapp.timercheckout.Api228_6

@Module
@InstallIn(SingletonComponent::class)
object Module_228 {
    @Provides
    @Singleton
    fun provideRepository228_5(
        api0: Api180_6 = Api180_6(),
        api1: Api184_6 = Api184_6(),
        api2: Api200_6 = Api200_6(),
        api3: Api176_6 = Api176_6(),
        api4: Api188_6 = Api188_6()
    ): Repository228_5 {
        return Repository228_5(api0, 
        api1, 
        api2, 
        api3, 
        api4)
    }

    @Provides
    @Singleton
    fun provideApi228_6(): Api228_6 {
        return Api228_6()
    }
}