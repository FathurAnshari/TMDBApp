package com.example.tmdbclientapp.data.repository.tvshow.datasource

import com.example.tmdbclientapp.data.model.tvshow.TvShow

interface TvShowCacheDatasource {
    suspend fun getTvShowsFromCache():List<TvShow>
    suspend fun saveTvShowsToCache(tvShows:List<TvShow>)
}