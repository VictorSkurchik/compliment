package by.victorskurchik.compliment.di

import by.victorskurchik.compliment.data.ComplimentRepositoryImpl
import by.victorskurchik.compliment.data.FakeNetworkServiceImpl
import by.victorskurchik.compliment.data.NetworkService
import by.victorskurchik.compliment.domain.ComplimentRepository
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
abstract class NetworkModule {

    @Singleton
    @Binds
    abstract fun provideNetworkService(service: FakeNetworkServiceImpl): NetworkService

    @Singleton
    @Binds
    abstract fun provideComplimentRepository(repository: ComplimentRepositoryImpl): ComplimentRepository

//    @Singleton
//    @Provides
//    fun provideNetworkService(retrofit: Retrofit): NetworkService {
//        return retrofit.create(NetworkService::class.java)
//    }

//    @Singleton
//    @Provides
//    fun provideOkHttpClient(): OkHttpClient {
//        return OkHttpClient.Builder().build()
//    }
//
//    @Singleton
//    @Provides
//    fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit {
//        return Retrofit.Builder()
//            .baseUrl("http://localhost/")
//            .client(okHttpClient)
//            .build()
//    }
}