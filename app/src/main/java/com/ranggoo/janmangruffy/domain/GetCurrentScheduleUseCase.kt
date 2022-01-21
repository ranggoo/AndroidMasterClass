package com.ranggoo.janmangruffy.domain

import com.ranggoo.janmangruffy.domain.entity.EpisodeEntity
import javax.inject.Inject

class GetCurrentScheduleUseCase @Inject constructor(
    val repository: TvMazeRepository
) {
    suspend operator fun invoke(country: String, date: String): List<EpisodeEntity> {
        return repository.getCurrentSchedule(country, date)
    }
}