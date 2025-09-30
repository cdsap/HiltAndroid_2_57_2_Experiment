package com.awesomeapp.commentuser.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.commentuser.Viewmodel304_1
import com.awesomeapp.commentuser.Activity304_2
import com.awesomeapp.commentuser.Activity304_3
import com.awesomeapp.commentuser.Fragment304_4
import com.awesomeapp.commentuser.Repository304_5
import com.awesomeapp.synccart.Api260_6
import com.awesomeapp.commentuser.Api304_6

@Module
@InstallIn(SingletonComponent::class)
object Module_304 {
    @Provides
    @Singleton
    fun provideRepository304_5(
        api0: Api260_6 = Api260_6()
    ): Repository304_5 {
        return Repository304_5(api0)
    }

    @Provides
    @Singleton
    fun provideApi304_6(): Api304_6 {
        return Api304_6()
    }
}