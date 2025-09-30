package com.awesomeapp.contactuser.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.contactuser.Viewmodel296_1
import com.awesomeapp.contactuser.Activity296_2
import com.awesomeapp.contactuser.Activity296_3
import com.awesomeapp.contactuser.Fragment296_4
import com.awesomeapp.contactuser.Repository296_5
import com.awesomeapp.analyticscart.Api268_6
import com.awesomeapp.postcart.Api256_6
import com.awesomeapp.notecart.Api280_6
import com.awesomeapp.alarmcart.Api276_6
import com.awesomeapp.synccart.Api260_6
import com.awesomeapp.contactuser.Api296_6

@Module
@InstallIn(SingletonComponent::class)
object Module_296 {
    @Provides
    @Singleton
    fun provideRepository296_5(
        api0: Api268_6 = Api268_6(),
        api1: Api256_6 = Api256_6(),
        api2: Api280_6 = Api280_6(),
        api3: Api276_6 = Api276_6(),
        api4: Api260_6 = Api260_6()
    ): Repository296_5 {
        return Repository296_5(api0, 
        api1, 
        api2, 
        api3, 
        api4)
    }

    @Provides
    @Singleton
    fun provideApi296_6(): Api296_6 {
        return Api296_6()
    }
}