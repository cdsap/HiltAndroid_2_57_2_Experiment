package com.awesomeapp.sessionuser.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.sessionuser.Viewmodel316_1
import com.awesomeapp.sessionuser.Activity316_2
import com.awesomeapp.sessionuser.Activity316_3
import com.awesomeapp.sessionuser.Fragment316_4
import com.awesomeapp.sessionuser.Repository316_5
import com.awesomeapp.weathercart.Api284_6
import com.awesomeapp.mediacart.Api292_6
import com.awesomeapp.podcastcart.Api288_6
import com.awesomeapp.contactuser.Api296_6
import com.awesomeapp.cartuser.Api300_6
import com.awesomeapp.commentuser.Api304_6
import com.awesomeapp.networkuser.Api308_6
import com.awesomeapp.sessionuser.Api316_6

@Module
@InstallIn(SingletonComponent::class)
object Module_316 {
    @Provides
    @Singleton
    fun provideRepository316_5(
        api0: Api284_6 = Api284_6(),
        api1: Api292_6 = Api292_6(),
        api2: Api288_6 = Api288_6(),
        api3: Api296_6 = Api296_6(),
        api4: Api300_6 = Api300_6(),
        api5: Api304_6 = Api304_6(),
        api6: Api308_6 = Api308_6()
    ): Repository316_5 {
        return Repository316_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6)
    }

    @Provides
    @Singleton
    fun provideApi316_6(): Api316_6 {
        return Api316_6()
    }
}