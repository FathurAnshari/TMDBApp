package com.example.tmdbclientapp.data.repository.movie.datasourceimpl

import com.example.tmdbclientapp.data.db.MovieDao
import com.example.tmdbclientapp.data.model.movie.Movie
import com.example.tmdbclientapp.data.repository.movie.datasource.MovieLocalDatasource
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MovieLocalDatasourceImpl(
    private val movieDao: MovieDao
) :MovieLocalDatasource{
    override suspend fun getMoviesFromDB(): List<Movie> {
        return movieDao.getMovies()
    }

    override suspend fun saveMoviesToDB(movies: List<Movie>) {
        CoroutineScope(Dispatchers.IO).launch {
            movieDao.saveMovies(movies)
        }
    }

    override suspend fun clearAll() {
        CoroutineScope(Dispatchers.IO).launch {
            movieDao.deleteAllMovies()
        }
    }
}