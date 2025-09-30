package com.awesomeapp.galleryuser.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.galleryuser.Viewmodel340_1
import com.awesomeapp.galleryuser.Activity340_2
import com.awesomeapp.galleryuser.Activity340_3
import com.awesomeapp.galleryuser.Fragment340_4
import com.awesomeapp.galleryuser.Repository340_5
import com.awesomeapp.messageuser.Api312_6
import com.awesomeapp.commentuser.Api304_6
import com.awesomeapp.contactuser.Api296_6
import com.awesomeapp.galleryuser.Api340_6

@Module
@InstallIn(SingletonComponent::class)
object Module_340 {
    @Provides
    @Singleton
    fun provideRepository340_5(
        api0: Api312_6 = Api312_6(),
        api1: Api304_6 = Api304_6(),
        api2: Api296_6 = Api296_6()
    ): Repository340_5 {
        return Repository340_5(api0, 
        api1, 
        api2)
    }

    @Provides
    @Singleton
    fun provideApi340_6(): Api340_6 {
        return Api340_6()
    }
}