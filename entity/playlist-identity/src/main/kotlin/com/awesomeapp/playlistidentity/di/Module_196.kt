package com.awesomeapp.playlistidentity.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.playlistidentity.Viewmodel196_1
import com.awesomeapp.playlistidentity.Activity196_2
import com.awesomeapp.playlistidentity.Activity196_3
import com.awesomeapp.playlistidentity.Fragment196_4
import com.awesomeapp.playlistidentity.Repository196_5
import com.awesomeapp.locationidentity.Api160_6
import com.awesomeapp.pushidentity.Api148_6
import com.awesomeapp.logidentity.Api172_6
import com.awesomeapp.playlistidentity.Api196_6

@Module
@InstallIn(SingletonComponent::class)
object Module_196 {
    @Provides
    @Singleton
    fun provideRepository196_5(
        api0: Api160_6 = Api160_6(),
        api1: Api148_6 = Api148_6(),
        api2: Api172_6 = Api172_6()
    ): Repository196_5 {
        return Repository196_5(api0, 
        api1, 
        api2)
    }

    @Provides
    @Singleton
    fun provideApi196_6(): Api196_6 {
        return Api196_6()
    }
}