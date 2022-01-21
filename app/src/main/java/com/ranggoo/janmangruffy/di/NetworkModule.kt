package com.ranggoo.janmangruffy.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Named

@InstallIn(SingletonComponent::class)
@Module(includes = [TvMazeDataSourceModule::class])
object NetworkModule {

    const val NAME_BASE_URL = "TVMAZE_BASE_URL"
    private const val TVMAZE_BASE_URL = "https://api.tvmaze.com/"

    @Provides
    @Named(NAME_BASE_URL)
    fun provideBaseUrlString(): String {
        return TVMAZE_BASE_URL
    }

    @Provides
    fun provideLoggingInterceptor(): HttpLoggingInterceptor {
        return HttpLoggingInterceptor()
    }

    @Provides
    fun provideOkHttpClient(
        httpLoggingInterceptor: HttpLoggingInterceptor
    ): OkHttpClient {
        // @Provide라는 어노테이션이 걸린 메소드안에 파라미터는 다 @provides가 되어있어야한다.
        val builder = OkHttpClient.Builder()
        builder.interceptors()
            .add(httpLoggingInterceptor)
        return builder.build()
    }

    @Provides
    fun provideRetrofit(
        @Named(TVMAZE_BASE_URL) baseUrl: String,
        okHttpClient: OkHttpClient
    ): Retrofit {
        return Retrofit.Builder()
            .baseUrl(baseUrl)
            .client(okHttpClient)
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
    }

}