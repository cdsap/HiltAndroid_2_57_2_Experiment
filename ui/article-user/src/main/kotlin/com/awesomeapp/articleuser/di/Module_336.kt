package com.awesomeapp.articleuser.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.articleuser.Viewmodel336_1
import com.awesomeapp.articleuser.Activity336_2
import com.awesomeapp.articleuser.Activity336_3
import com.awesomeapp.articleuser.Fragment336_4
import com.awesomeapp.articleuser.Repository336_5
import com.awesomeapp.mediacart.Api292_6
import com.awesomeapp.articleuser.Api336_6

@Module
@InstallIn(SingletonComponent::class)
object Module_336 {
    @Provides
    @Singleton
    fun provideRepository336_5(
        api0: Api292_6 = Api292_6()
    ): Repository336_5 {
        return Repository336_5(api0)
    }

    @Provides
    @Singleton
    fun provideApi336_6(): Api336_6 {
        return Api336_6()
    }
}