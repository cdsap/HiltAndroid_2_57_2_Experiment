package com.awesomeapp.synccart.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.synccart.Viewmodel260_1
import com.awesomeapp.synccart.Activity260_2
import com.awesomeapp.synccart.Activity260_3
import com.awesomeapp.synccart.Fragment260_4
import com.awesomeapp.synccart.Repository260_5
import com.awesomeapp.todocheckout.Api232_6
import com.awesomeapp.settingcheckout.Api216_6
import com.awesomeapp.reportcheckout.Api220_6
import com.awesomeapp.videocheckout.Api240_6
import com.awesomeapp.forecastcheckout.Api236_6
import com.awesomeapp.audiocheckout.Api244_6
import com.awesomeapp.taskcheckout.Api224_6
import com.awesomeapp.synccart.Api260_6

@Module
@InstallIn(SingletonComponent::class)
object Module_260 {
    @Provides
    @Singleton
    fun provideRepository260_5(
        api0: Api232_6 = Api232_6(),
        api1: Api216_6 = Api216_6(),
        api2: Api220_6 = Api220_6(),
        api3: Api240_6 = Api240_6(),
        api4: Api236_6 = Api236_6(),
        api5: Api244_6 = Api244_6(),
        api6: Api224_6 = Api224_6()
    ): Repository260_5 {
        return Repository260_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6)
    }

    @Provides
    @Singleton
    fun provideApi260_6(): Api260_6 {
        return Api260_6()
    }
}