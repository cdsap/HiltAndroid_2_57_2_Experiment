package com.awesomeapp.mediacart.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.mediacart.Viewmodel292_1
import com.awesomeapp.mediacart.Activity292_2
import com.awesomeapp.mediacart.Activity292_3
import com.awesomeapp.mediacart.Fragment292_4
import com.awesomeapp.mediacart.Repository292_5
import com.awesomeapp.postcart.Api256_6
import com.awesomeapp.logincart.Api248_6
import com.awesomeapp.analyticscart.Api268_6
import com.awesomeapp.mediacart.Api292_6

@Module
@InstallIn(SingletonComponent::class)
object Module_292 {
    @Provides
    @Singleton
    fun provideRepository292_5(
        api0: Api256_6 = Api256_6(),
        api1: Api248_6 = Api248_6(),
        api2: Api268_6 = Api268_6()
    ): Repository292_5 {
        return Repository292_5(api0, 
        api1, 
        api2)
    }

    @Provides
    @Singleton
    fun provideApi292_6(): Api292_6 {
        return Api292_6()
    }
}