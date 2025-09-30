package com.awesomeapp.statususer.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.statususer.Viewmodel320_1
import com.awesomeapp.statususer.Activity320_2
import com.awesomeapp.statususer.Activity320_3
import com.awesomeapp.statususer.Fragment320_4
import com.awesomeapp.statususer.Repository320_5
import com.awesomeapp.commentuser.Api304_6
import com.awesomeapp.networkuser.Api308_6
import com.awesomeapp.messageuser.Api312_6
import com.awesomeapp.weathercart.Api284_6
import com.awesomeapp.contactuser.Api296_6
import com.awesomeapp.mediacart.Api292_6
import com.awesomeapp.statususer.Api320_6

@Module
@InstallIn(SingletonComponent::class)
object Module_320 {
    @Provides
    @Singleton
    fun provideRepository320_5(
        api0: Api304_6 = Api304_6(),
        api1: Api308_6 = Api308_6(),
        api2: Api312_6 = Api312_6(),
        api3: Api284_6 = Api284_6(),
        api4: Api296_6 = Api296_6(),
        api5: Api292_6 = Api292_6()
    ): Repository320_5 {
        return Repository320_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5)
    }

    @Provides
    @Singleton
    fun provideApi320_6(): Api320_6 {
        return Api320_6()
    }
}