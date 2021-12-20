package com.example.tmdbclientapp.data.repository.movie.datasource

import com.example.tmdbclientapp.data.model.movie.Movie

interface MovieLocalDatasource {
    suspend fun getMoviesFromDB(): List<Movie>
    suspend fun saveMoviesToDB(movies: List<Movie>)
    suspend fun clearAll()
}