package com.ranggoo.janmangruffy.domain.entity


data class EpisodeEntity(
    val airdate: String?,
    val airtime: String?,
    val id: Int?,
    val name: String?,
    val number: Int?,
    val runtime: Int?,
    val season: Int?,
    val show: ShowEntity?,
    val url: String?
)

data class ShowEntity(
    val externals: ExternalsEntity?,
    val genres: List<String>?,
    val id: Int?,
    val image: Map<String, String>?,
    val language: String?,
    val name: String?,
    val officialSite: String?,
    val premiered: String?,
    val rating: Map<String, String>?,
    val status: String?,
    val summary: String?,
    val type: String?,
    val url: String?,
)

data class ExternalsEntity(
    val imdb: String?,
    val thetvdb: Int?,
    val tvrage: Int?
)