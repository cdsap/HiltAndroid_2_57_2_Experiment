package com.awesomeapp.networkuser.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.networkuser.Viewmodel308_1
import com.awesomeapp.networkuser.Activity308_2
import com.awesomeapp.networkuser.Activity308_3
import com.awesomeapp.networkuser.Fragment308_4
import com.awesomeapp.networkuser.Repository308_5
import com.awesomeapp.postcart.Api256_6
import com.awesomeapp.metriccart.Api272_6
import com.awesomeapp.analyticscart.Api268_6
import com.awesomeapp.synccart.Api260_6
import com.awesomeapp.notificationcart.Api264_6
import com.awesomeapp.usercart.Api252_6
import com.awesomeapp.alarmcart.Api276_6
import com.awesomeapp.notecart.Api280_6
import com.awesomeapp.networkuser.Api308_6

@Module
@InstallIn(SingletonComponent::class)
object Module_308 {
    @Provides
    @Singleton
    fun provideRepository308_5(
        api0: Api256_6 = Api256_6(),
        api1: Api272_6 = Api272_6(),
        api2: Api268_6 = Api268_6(),
        api3: Api260_6 = Api260_6(),
        api4: Api264_6 = Api264_6(),
        api5: Api252_6 = Api252_6(),
        api6: Api276_6 = Api276_6(),
        api7: Api280_6 = Api280_6()
    ): Repository308_5 {
        return Repository308_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6, 
        api7)
    }

    @Provides
    @Singleton
    fun provideApi308_6(): Api308_6 {
        return Api308_6()
    }
}