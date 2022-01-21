package com.ranggoo.janmangruffy.domain

import com.ranggoo.janmangruffy.data.EpisodeResponse
import javax.inject.Inject

class GetCurrentScheduleUseCase @Inject constructor(
    val repository: TvMazeRepository
) {
    suspend operator fun invoke(country: String, date: String): List<EpisodeResponse> {
        return repository.getCurrentSchedule(country, date)
    }

}