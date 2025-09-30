package com.awesomeapp.weathercart.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.weathercart.Viewmodel284_1
import com.awesomeapp.weathercart.Activity284_2
import com.awesomeapp.weathercart.Activity284_3
import com.awesomeapp.weathercart.Fragment284_4
import com.awesomeapp.weathercart.Repository284_5
import com.awesomeapp.notificationcart.Api264_6
import com.awesomeapp.logincart.Api248_6
import com.awesomeapp.postcart.Api256_6
import com.awesomeapp.alarmcart.Api276_6
import com.awesomeapp.usercart.Api252_6
import com.awesomeapp.analyticscart.Api268_6
import com.awesomeapp.synccart.Api260_6
import com.awesomeapp.notecart.Api280_6
import com.awesomeapp.metriccart.Api272_6
import com.awesomeapp.weathercart.Api284_6

@Module
@InstallIn(SingletonComponent::class)
object Module_284 {
    @Provides
    @Singleton
    fun provideRepository284_5(
        api0: Api264_6 = Api264_6(),
        api1: Api248_6 = Api248_6(),
        api2: Api256_6 = Api256_6(),
        api3: Api276_6 = Api276_6(),
        api4: Api252_6 = Api252_6(),
        api5: Api268_6 = Api268_6(),
        api6: Api260_6 = Api260_6(),
        api7: Api280_6 = Api280_6(),
        api8: Api272_6 = Api272_6()
    ): Repository284_5 {
        return Repository284_5(api0, 
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
    fun provideApi284_6(): Api284_6 {
        return Api284_6()
    }
}