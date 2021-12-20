package com.example.tmdbclientapp.domain.usecase

import com.example.tmdbclientapp.data.model.movie.Movie
import com.example.tmdbclientapp.domain.repository.MovieRepository

class GetMoviesUseCase(private val movieRepository: MovieRepository) {
    suspend fun execute():List<Movie>? = movieRepository.getMovies()
}