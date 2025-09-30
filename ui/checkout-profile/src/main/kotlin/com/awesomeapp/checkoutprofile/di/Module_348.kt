package com.awesomeapp.checkoutprofile.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.checkoutprofile.Viewmodel348_1
import com.awesomeapp.checkoutprofile.Activity348_2
import com.awesomeapp.checkoutprofile.Activity348_3
import com.awesomeapp.checkoutprofile.Fragment348_4
import com.awesomeapp.checkoutprofile.Repository348_5
import com.awesomeapp.networkuser.Api308_6
import com.awesomeapp.weathercart.Api284_6
import com.awesomeapp.cartuser.Api300_6
import com.awesomeapp.contactuser.Api296_6
import com.awesomeapp.messageuser.Api312_6
import com.awesomeapp.commentuser.Api304_6
import com.awesomeapp.checkoutprofile.Api348_6

@Module
@InstallIn(SingletonComponent::class)
object Module_348 {
    @Provides
    @Singleton
    fun provideRepository348_5(
        api0: Api308_6 = Api308_6(),
        api1: Api284_6 = Api284_6(),
        api2: Api300_6 = Api300_6(),
        api3: Api296_6 = Api296_6(),
        api4: Api312_6 = Api312_6(),
        api5: Api304_6 = Api304_6()
    ): Repository348_5 {
        return Repository348_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5)
    }

    @Provides
    @Singleton
    fun provideApi348_6(): Api348_6 {
        return Api348_6()
    }
}