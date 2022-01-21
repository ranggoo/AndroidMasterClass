package com.ranggoo.janmangruffy.di

import com.ranggoo.janmangruffy.data.TvMazeDataSource
import com.ranggoo.janmangruffy.data.TvMazeRepositoryImpl
import com.ranggoo.janmangruffy.domain.TvMazeRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit

@InstallIn(SingletonComponent::class)
@Module
object TvMazeModule{
    @Provides
    fun provideTvMazeDataSource(
        retrofit: Retrofit
    ): TvMazeDataSource {
        return retrofit.create(TvMazeDataSource::class.java)
    }
}

@InstallIn(SingletonComponent::class)
@Module
abstract class TvMazeRepositoryModule{
    @Binds
    abstract fun bindsTvMazeRepostiory(repository:TvMazeRepositoryImpl): TvMazeRepository
}