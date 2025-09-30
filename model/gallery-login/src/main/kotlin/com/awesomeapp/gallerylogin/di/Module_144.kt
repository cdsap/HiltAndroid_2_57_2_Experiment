package com.awesomeapp.gallerylogin.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.awesomeapp.gallerylogin.Viewmodel144_1
import com.awesomeapp.gallerylogin.Activity144_2
import com.awesomeapp.gallerylogin.Activity144_3
import com.awesomeapp.gallerylogin.Fragment144_4
import com.awesomeapp.gallerylogin.Repository144_5
import com.awesomeapp.sessionlogin.Api120_6
import com.awesomeapp.eventlogin.Api128_6
import com.awesomeapp.documentlogin.Api132_6
import com.awesomeapp.statuslogin.Api124_6
import com.awesomeapp.networklogin.Api112_6
import com.awesomeapp.maplogin.Api136_6
import com.awesomeapp.articlelogin.Api140_6
import com.awesomeapp.commentlogin.Api108_6
import com.awesomeapp.gallerylogin.Api144_6

@Module
@InstallIn(SingletonComponent::class)
object Module_144 {
    @Provides
    @Singleton
    fun provideRepository144_5(
        api0: Api120_6 = Api120_6(),
        api1: Api128_6 = Api128_6(),
        api2: Api132_6 = Api132_6(),
        api3: Api124_6 = Api124_6(),
        api4: Api112_6 = Api112_6(),
        api5: Api136_6 = Api136_6(),
        api6: Api140_6 = Api140_6(),
        api7: Api108_6 = Api108_6()
    ): Repository144_5 {
        return Repository144_5(api0, 
        api1, 
        api2, 
        api3, 
        api4, 
        api5, 
        api6, 
        api7)
    }

    @Provides
    @Singleton
    fun provideApi144_6(): Api144_6 {
        return Api144_6()
    }
}