package com.awesomeapp.alarmcart.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.alarmcart.Viewmodel276_1
import com.awesomeapp.alarmcart.Activity276_2
import com.awesomeapp.alarmcart.Activity276_3
import com.awesomeapp.alarmcart.Fragment276_4
import com.awesomeapp.alarmcart.Repository276_5
import com.awesomeapp.audiocheckout.Api244_6
import com.awesomeapp.videocheckout.Api240_6
import com.awesomeapp.todocheckout.Api232_6
import com.awesomeapp.forecastcheckout.Api236_6
import com.awesomeapp.sharecheckout.Api212_6
import com.awesomeapp.timercheckout.Api228_6
import com.awesomeapp.alarmcart.Api276_6

@Module
@InstallIn(SingletonComponent::class)
object Module_276 {
    @Provides
    @Singleton
    fun provideRepository276_5(
        api0: Api244_6 = Api244_6(),
        api1: Api240_6 = Api240_6(),
        api2: Api232_6 = Api232_6(),
        api3: Api236_6 = Api236_6(),
        api4: Api212_6 = Api212_6(),
        api5: Api228_6 = Api228_6()
    ): Repository276_5 {
        return Repository276_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5)
    }

    @Provides
    @Singleton
    fun provideApi276_6(): Api276_6 {
        return Api276_6()
    }
}