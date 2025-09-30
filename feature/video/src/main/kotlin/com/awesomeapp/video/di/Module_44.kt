package com.awesomeapp.video.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.video.Viewmodel44_1
import com.awesomeapp.video.Activity44_2
import com.awesomeapp.video.Activity44_3
import com.awesomeapp.video.Fragment44_4
import com.awesomeapp.video.Repository44_5
import com.awesomeapp.timer.Api32_6
import com.awesomeapp.share.Api16_6
import com.awesomeapp.profile.Api8_6
import com.awesomeapp.setting.Api20_6
import com.awesomeapp.identity.Api4_6
import com.awesomeapp.task.Api28_6
import com.awesomeapp.report.Api24_6
import com.awesomeapp.video.Api44_6

@Module
@InstallIn(SingletonComponent::class)
object Module_44 {
    @Provides
    @Singleton
    fun provideRepository44_5(
        api0: Api32_6 = Api32_6(),
        api1: Api16_6 = Api16_6(),
        api2: Api8_6 = Api8_6(),
        api3: Api20_6 = Api20_6(),
        api4: Api4_6 = Api4_6(),
        api5: Api28_6 = Api28_6(),
        api6: Api24_6 = Api24_6()
    ): Repository44_5 {
        return Repository44_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6)
    }

    @Provides
    @Singleton
    fun provideApi44_6(): Api44_6 {
        return Api44_6()
    }
}