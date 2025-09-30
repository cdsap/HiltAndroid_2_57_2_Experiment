package com.awesomeapp.cartuser.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.cartuser.Viewmodel300_1
import com.awesomeapp.cartuser.Activity300_2
import com.awesomeapp.cartuser.Activity300_3
import com.awesomeapp.cartuser.Fragment300_4
import com.awesomeapp.cartuser.Repository300_5
import com.awesomeapp.alarmcart.Api276_6
import com.awesomeapp.analyticscart.Api268_6
import com.awesomeapp.usercart.Api252_6
import com.awesomeapp.metriccart.Api272_6
import com.awesomeapp.notecart.Api280_6
import com.awesomeapp.notificationcart.Api264_6
import com.awesomeapp.synccart.Api260_6
import com.awesomeapp.logincart.Api248_6
import com.awesomeapp.postcart.Api256_6
import com.awesomeapp.cartuser.Api300_6

@Module
@InstallIn(SingletonComponent::class)
object Module_300 {
    @Provides
    @Singleton
    fun provideRepository300_5(
        api0: Api276_6 = Api276_6(),
        api1: Api268_6 = Api268_6(),
        api2: Api252_6 = Api252_6(),
        api3: Api272_6 = Api272_6(),
        api4: Api280_6 = Api280_6(),
        api5: Api264_6 = Api264_6(),
        api6: Api260_6 = Api260_6(),
        api7: Api248_6 = Api248_6(),
        api8: Api256_6 = Api256_6()
    ): Repository300_5 {
        return Repository300_5(api0, 
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
    fun provideApi300_6(): Api300_6 {
        return Api300_6()
    }
}