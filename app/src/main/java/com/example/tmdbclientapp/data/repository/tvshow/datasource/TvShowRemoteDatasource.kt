package com.example.tmdbclientapp.data.repository.tvshow.datasource

import com.example.tmdbclientapp.data.model.tvshow.TvShow
import com.example.tmdbclientapp.data.model.tvshow.TvShowList
import retrofit2.Response

interface TvShowRemoteDatasource {
    suspend fun getTvShows():Response<TvShowList>
}