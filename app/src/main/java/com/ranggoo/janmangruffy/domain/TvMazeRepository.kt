package com.ranggoo.janmangruffy.domain

import com.ranggoo.janmangruffy.data.EpisodeResponse

interface TvMazeRepository {
    suspend fun getCurrentSchedule(country: String, date: String): List<EpisodeResponse>
}
