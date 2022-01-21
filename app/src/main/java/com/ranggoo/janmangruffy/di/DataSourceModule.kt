package com.ranggoo.janmangruffy.di

import com.ranggoo.janmangruffy.data.TvMazeDataSource
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit

@InstallIn(SingletonComponent::class)
@Module
object TvMazeDataSourceModule{
    @Provides
    fun provideTvMazeDataSource(
        retrofit: Retrofit
    ): TvMazeDataSource {
        return retrofit.create(TvMazeDataSource::class.java)
    }
}