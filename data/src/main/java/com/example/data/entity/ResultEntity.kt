package com.example.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.data.core.BaseEntity

@Entity
data class ResultEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0L,
    var term: String = "",
    val wrapperType: String = "",
    val kind: String = "",
    val artistId: Long = 0L,
    val collectionId: Long = 0L,
    val trackId: Long = 0L,
    val artistName: String = "",
    val collectionName: String = "",
    val trackName: String = "",
    val collectionCensoredName: String = "",
    val trackCensoredName: String = "",
    val artistViewUrl: String = "",
    val collectionViewUrl: String = "",
    val trackViewUrl: String = "",
    val previewUrl: String = "",
    val artworkUrl30: String = "",
    val artworkUrl60: String = "",
    val artworkUrl100: String = "",
    val collectionPrice: Float = 0F,
    val trackPrice: Float = 0F,
    val collectionHdPrice: Float = 0F,
    val trackHdPrice: Float = 0F,
    val releaseDate: String = "",
    val collectionExplicitness: String = "",
    val trackExplicitness: String = "",
    val discCount: Int = 0,
    val discNumber: Int = 0,
    val trackCount: Int = 0,
    val trackNumber: Int = 0,
    val trackTimeMillis: Long = 0L,
    val country: String = "",
    val currency: String = "",
    val primaryGenreName: String = "",
    val isStreamable: Boolean = false,
    val contentAdvisoryRating: String = "",
    val shortDescription: String = "",
    val longDescription: String = ""
) : BaseEntity()