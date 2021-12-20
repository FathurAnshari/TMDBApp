package com.example.tmdbclientapp.domain.repository

import com.example.tmdbclientapp.data.model.movie.Movie

interface MovieRepository {

    suspend fun getMovies():List<Movie>?
    suspend fun updateMovies():List<Movie>?
}