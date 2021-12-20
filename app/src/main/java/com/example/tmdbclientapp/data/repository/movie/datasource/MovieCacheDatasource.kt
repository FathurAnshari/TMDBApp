package com.example.tmdbclientapp.data.repository.movie.datasource

import com.example.tmdbclientapp.data.model.movie.Movie

interface MovieCacheDatasource {
    suspend fun getMoviesFromCache():List<Movie>
    suspend fun saveMoviesToCache(movies :List<Movie>)
}