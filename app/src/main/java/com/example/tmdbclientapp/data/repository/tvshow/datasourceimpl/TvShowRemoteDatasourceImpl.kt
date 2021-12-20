package com.example.tmdbclientapp.data.repository.tvshow.datasourceimpl

import com.example.tmdbclientapp.data.api.TMDBService
import com.example.tmdbclientapp.data.model.tvshow.TvShowList
import com.example.tmdbclientapp.data.repository.tvshow.datasource.TvShowRemoteDatasource
import retrofit2.Response

class TvShowRemoteDatasourceImpl(
    private val tmdbService : TMDBService
):TvShowRemoteDatasource {
    override suspend fun getTvShows(): Response<TvShowList> = tmdbService.getPopularTvShows()
}