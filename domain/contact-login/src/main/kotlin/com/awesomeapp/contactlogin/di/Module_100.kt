package com.awesomeapp.contactlogin.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.contactlogin.Viewmodel100_1
import com.awesomeapp.contactlogin.Activity100_2
import com.awesomeapp.contactlogin.Activity100_3
import com.awesomeapp.contactlogin.Fragment100_4
import com.awesomeapp.contactlogin.Repository100_5
import com.awesomeapp.forecast.Api40_6
import com.awesomeapp.synccontact.Api64_6
import com.awesomeapp.todo.Api36_6
import com.awesomeapp.video.Api44_6
import com.awesomeapp.audio.Api48_6
import com.awesomeapp.usercontact.Api56_6
import com.awesomeapp.contactlogin.Api100_6

@Module
@InstallIn(SingletonComponent::class)
object Module_100 {
    @Provides
    @Singleton
    fun provideRepository100_5(
        api0: Api40_6 = Api40_6(),
        api1: Api64_6 = Api64_6(),
        api2: Api36_6 = Api36_6(),
        api3: Api44_6 = Api44_6(),
        api4: Api48_6 = Api48_6(),
        api5: Api56_6 = Api56_6()
    ): Repository100_5 {
        return Repository100_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5)
    }

    @Provides
    @Singleton
    fun provideApi100_6(): Api100_6 {
        return Api100_6()
    }
}