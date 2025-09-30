package com.awesomeapp.pushprofile.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.pushprofile.Viewmodel344_1
import com.awesomeapp.pushprofile.Activity344_2
import com.awesomeapp.pushprofile.Activity344_3
import com.awesomeapp.pushprofile.Fragment344_4
import com.awesomeapp.pushprofile.Repository344_5
import com.awesomeapp.cartuser.Api300_6
import com.awesomeapp.weathercart.Api284_6
import com.awesomeapp.networkuser.Api308_6
import com.awesomeapp.pushprofile.Api344_6

@Module
@InstallIn(SingletonComponent::class)
object Module_344 {
    @Provides
    @Singleton
    fun provideRepository344_5(
        api0: Api300_6 = Api300_6(),
        api1: Api284_6 = Api284_6(),
        api2: Api308_6 = Api308_6()
    ): Repository344_5 {
        return Repository344_5(api0, 
        api1, 
        api2)
    }

    @Provides
    @Singleton
    fun provideApi344_6(): Api344_6 {
        return Api344_6()
    }
}