package com.awesomeapp.messageuser.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.messageuser.Viewmodel312_1
import com.awesomeapp.messageuser.Activity312_2
import com.awesomeapp.messageuser.Activity312_3
import com.awesomeapp.messageuser.Fragment312_4
import com.awesomeapp.messageuser.Repository312_5
import com.awesomeapp.analyticscart.Api268_6
import com.awesomeapp.messageuser.Api312_6

@Module
@InstallIn(SingletonComponent::class)
object Module_312 {
    @Provides
    @Singleton
    fun provideRepository312_5(
        api0: Api268_6 = Api268_6()
    ): Repository312_5 {
        return Repository312_5(api0)
    }

    @Provides
    @Singleton
    fun provideApi312_6(): Api312_6 {
        return Api312_6()
    }
}