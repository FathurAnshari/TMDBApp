package com.example.tmdbclientapp.data.repository.movie.datasource

import com.example.tmdbclientapp.data.model.movie.MovieList
import retrofit2.Response

interface MovieRemoteDatasource {
    suspend fun getMovies(): Response<MovieList>
}