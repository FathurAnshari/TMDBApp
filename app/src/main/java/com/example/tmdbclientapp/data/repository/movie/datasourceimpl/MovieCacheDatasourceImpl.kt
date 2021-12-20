package com.example.tmdbclientapp.data.repository.movie.datasourceimpl

import com.example.tmdbclientapp.data.model.movie.Movie
import com.example.tmdbclientapp.data.repository.movie.datasource.MovieCacheDatasource

class MovieCacheDatasourceImpl() : MovieCacheDatasource {

    private var movieList = ArrayList<Movie>()

    override suspend fun getMoviesFromCache(): List<Movie> {
        return movieList
    }

    override suspend fun saveMoviesToCache(movies: List<Movie>) {
        movieList.clear()
        movieList = ArrayList(movies)
    }
}