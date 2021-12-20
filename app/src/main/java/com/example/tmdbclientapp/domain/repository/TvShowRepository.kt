package com.example.tmdbclientapp.domain.repository

import com.example.tmdbclientapp.data.model.tvshow.TvShow

interface TvShowRepository {

    suspend fun getTvShow():List<TvShow>?
    suspend fun updateTvShow():List<TvShow>?
}