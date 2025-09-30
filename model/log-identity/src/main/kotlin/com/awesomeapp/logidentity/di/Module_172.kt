package com.awesomeapp.logidentity.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.logidentity.Viewmodel172_1
import com.awesomeapp.logidentity.Activity172_2
import com.awesomeapp.logidentity.Activity172_3
import com.awesomeapp.logidentity.Fragment172_4
import com.awesomeapp.logidentity.Repository172_5
import com.awesomeapp.sessionlogin.Api120_6
import com.awesomeapp.documentlogin.Api132_6
import com.awesomeapp.statuslogin.Api124_6
import com.awesomeapp.messagelogin.Api116_6
import com.awesomeapp.logidentity.Api172_6

@Module
@InstallIn(SingletonComponent::class)
object Module_172 {
    @Provides
    @Singleton
    fun provideRepository172_5(
        api0: Api120_6 = Api120_6(),
        api1: Api132_6 = Api132_6(),
        api2: Api124_6 = Api124_6(),
        api3: Api116_6 = Api116_6()
    ): Repository172_5 {
        return Repository172_5(api0, 
        api1, 
        api2, 
        api3)
    }

    @Provides
    @Singleton
    fun provideApi172_6(): Api172_6 {
        return Api172_6()
    }
}