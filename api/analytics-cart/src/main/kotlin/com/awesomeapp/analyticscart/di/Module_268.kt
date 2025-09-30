package com.awesomeapp.analyticscart.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.analyticscart.Viewmodel268_1
import com.awesomeapp.analyticscart.Activity268_2
import com.awesomeapp.analyticscart.Activity268_3
import com.awesomeapp.analyticscart.Fragment268_4
import com.awesomeapp.analyticscart.Repository268_5
import com.awesomeapp.analyticscart.Api268_6

@Module
@InstallIn(SingletonComponent::class)
object Module_268 {
    @Provides
    @Singleton
    fun provideRepository268_5(): Repository268_5 {
        return Repository268_5()
    }

    @Provides
    @Singleton
    fun provideApi268_6(): Api268_6 {
        return Api268_6()
    }
}