package com.ranggoo.janmangruffy.data

import com.ranggoo.janmangruffy.domain.TvMazeRepository
import javax.inject.Inject

class TvMazeRepositoryImpl @Inject constructor(
    val dataSource: TvMazeDataSource
) : TvMazeRepository {
    override suspend fun getCurrentSchedule(country: String, date: String): List<EpisodeResponse> {
        val data = dataSource.getCurrentSchedule(country,date)
        return data;
    }
}
