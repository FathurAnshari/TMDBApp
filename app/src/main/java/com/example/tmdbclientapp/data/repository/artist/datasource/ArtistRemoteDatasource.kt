package com.example.tmdbclientapp.data.repository.artist.datasource

import com.example.tmdbclientapp.data.model.artist.ArtistList
import retrofit2.Response

interface ArtistRemoteDatasource {
    suspend fun getArtists(): Response<ArtistList>
}