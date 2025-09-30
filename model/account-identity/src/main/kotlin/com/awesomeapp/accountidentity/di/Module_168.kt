package com.awesomeapp.accountidentity.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.accountidentity.Viewmodel168_1
import com.awesomeapp.accountidentity.Activity168_2
import com.awesomeapp.accountidentity.Activity168_3
import com.awesomeapp.accountidentity.Fragment168_4
import com.awesomeapp.accountidentity.Repository168_5
import com.awesomeapp.documentlogin.Api132_6
import com.awesomeapp.messagelogin.Api116_6
import com.awesomeapp.statuslogin.Api124_6
import com.awesomeapp.networklogin.Api112_6
import com.awesomeapp.accountidentity.Api168_6

@Module
@InstallIn(SingletonComponent::class)
object Module_168 {
    @Provides
    @Singleton
    fun provideRepository168_5(
        api0: Api132_6 = Api132_6(),
        api1: Api116_6 = Api116_6(),
        api2: Api124_6 = Api124_6(),
        api3: Api112_6 = Api112_6()
    ): Repository168_5 {
        return Repository168_5(api0, 
        api1, 
        api2, 
        api3)
    }

    @Provides
    @Singleton
    fun provideApi168_6(): Api168_6 {
        return Api168_6()
    }
}