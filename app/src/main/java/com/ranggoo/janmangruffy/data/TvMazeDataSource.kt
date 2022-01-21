package com.ranggoo.janmangruffy.data

import retrofit2.http.GET
import retrofit2.http.Query

interface TvMazeDataSource {
    @GET("/schedule")
    suspend fun getCurrentSchedule(
        @Query("country") country: String,
        @Query("date") date: String
    ): List<EpisodeResponse>
}