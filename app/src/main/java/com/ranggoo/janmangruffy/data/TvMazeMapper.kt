package com.ranggoo.janmangruffy.data

import com.ranggoo.janmangruffy.domain.entity.EpisodeEntity
import com.ranggoo.janmangruffy.domain.entity.ExternalsEntity
import com.ranggoo.janmangruffy.domain.entity.ShowEntity

fun List<EpisodeResponse>.toEntity(): List<EpisodeEntity> {
    return this.map {
        EpisodeEntity(
            airdate = it.airdate ?: "adfad",
            airtime = it.airtime ?: "df",
            id = it.id,
            name = it.name,
            number = it.number,
            runtime = it.runtime,
            season = it.season,
            show = ShowEntity(
                externals = ExternalsEntity(
                    it.show?.externals?.imdb,
                    it.show?.externals?.thetvdb,
                    it.show?.externals?.tvrage
                ),
                url = it.url,
                genres = it.show?.genres,
                id = it.show?.id,
                image = it.show?.image,
                language = it.show?.language,
                name = it.show?.name,
                officialSite = it.show?.officialSite,
                premiered = it.show?.premiered,
                rating = it.show?.rating,
                status = it.show?.status,
                summary = it.show?.summary,
                type = it.show?.summary
            ),
            url = it.url
        )
    }
}