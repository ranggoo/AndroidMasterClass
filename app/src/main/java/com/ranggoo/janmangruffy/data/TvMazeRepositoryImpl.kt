package com.ranggoo.janmangruffy.data

import com.ranggoo.janmangruffy.domain.TvMazeRepository
import com.ranggoo.janmangruffy.domain.entity.EpisodeEntity
import com.ranggoo.janmangruffy.domain.entity.ExternalsEntity
import com.ranggoo.janmangruffy.domain.entity.ShowEntity
import javax.inject.Inject

class TvMazeRepositoryImpl @Inject constructor(
    val dataSource: TvMazeDataSource
) : TvMazeRepository {

    override suspend fun getCurrentSchedule(country: String, date: String): List<EpisodeEntity> {
        val data = dataSource.getCurrentSchedule(country, date).toEntity()
        return data;
    }
}
