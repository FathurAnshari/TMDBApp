package com.example.tmdbclientapp.data.repository.artist.datasourceimpl

import com.example.tmdbclientapp.data.api.TMDBService
import com.example.tmdbclientapp.data.model.artist.ArtistList
import com.example.tmdbclientapp.data.repository.artist.datasource.ArtistRemoteDatasource
import retrofit2.Response

class ArtistRemoteDatasourceImpl(
    private val tmdbService: TMDBService
) : ArtistRemoteDatasource {
    override suspend fun getArtists(): Response<ArtistList> =tmdbService.getPopularArtists()

}