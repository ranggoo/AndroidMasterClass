package com.ranggoo.janmangruffy.domain

import com.ranggoo.janmangruffy.data.EpisodeResponse
import com.ranggoo.janmangruffy.domain.entity.EpisodeEntity

interface TvMazeRepository {
    suspend fun getCurrentSchedule(country: String, date: String): List<EpisodeEntity>
}
