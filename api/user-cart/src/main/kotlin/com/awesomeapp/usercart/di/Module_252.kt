package com.awesomeapp.usercart.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.usercart.Viewmodel252_1
import com.awesomeapp.usercart.Activity252_2
import com.awesomeapp.usercart.Activity252_3
import com.awesomeapp.usercart.Fragment252_4
import com.awesomeapp.usercart.Repository252_5
import com.awesomeapp.taskcheckout.Api224_6
import com.awesomeapp.videocheckout.Api240_6
import com.awesomeapp.usercart.Api252_6

@Module
@InstallIn(SingletonComponent::class)
object Module_252 {
    @Provides
    @Singleton
    fun provideRepository252_5(
        api0: Api224_6 = Api224_6(),
        api1: Api240_6 = Api240_6()
    ): Repository252_5 {
        return Repository252_5(api0, 
        api1)
    }

    @Provides
    @Singleton
    fun provideApi252_6(): Api252_6 {
        return Api252_6()
    }
}