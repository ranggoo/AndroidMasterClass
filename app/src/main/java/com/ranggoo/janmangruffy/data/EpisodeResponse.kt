package com.ranggoo.janmangruffy.data

import android.os.Parcelable
import com.squareup.moshi.JsonClass
import kotlinx.parcelize.Parcelize

@Parcelize
@JsonClass(generateAdapter = true)
data class EpisodeResponse(
    val airdate: String?,
    val airtime: String?,
    val id: Int?,
    val name: String?,
    val number: Int?,
    val runtime: Int?,
    val season: Int?,
    val show: ShowResponse?,
    val url: String?
) : Parcelable

@Parcelize
@JsonClass(generateAdapter = true)
data class ShowResponse(
    val externals: ExternalsResponse?,
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
) : Parcelable

@Parcelize
@JsonClass(generateAdapter = true)
data class ExternalsResponse(
    val imdb: String?,
    val thetvdb: Int?,
    val tvrage: Int?
) : Parcelable