package com.awesomeapp.notificationcart.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.notificationcart.Viewmodel264_1
import com.awesomeapp.notificationcart.Activity264_2
import com.awesomeapp.notificationcart.Activity264_3
import com.awesomeapp.notificationcart.Fragment264_4
import com.awesomeapp.notificationcart.Repository264_5
import com.awesomeapp.sharecheckout.Api212_6
import com.awesomeapp.audiocheckout.Api244_6
import com.awesomeapp.notificationcart.Api264_6

@Module
@InstallIn(SingletonComponent::class)
object Module_264 {
    @Provides
    @Singleton
    fun provideRepository264_5(
        api0: Api212_6 = Api212_6(),
        api1: Api244_6 = Api244_6()
    ): Repository264_5 {
        return Repository264_5(api0, 
        api1)
    }

    @Provides
    @Singleton
    fun provideApi264_6(): Api264_6 {
        return Api264_6()
    }
}