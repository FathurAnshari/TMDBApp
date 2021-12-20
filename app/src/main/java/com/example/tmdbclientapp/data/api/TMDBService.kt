package com.example.tmdbclientapp.data.api

import com.example.tmdbclientapp.BuildConfig
import com.example.tmdbclientapp.data.model.artist.ArtistList
import com.example.tmdbclientapp.data.model.movie.MovieList
import com.example.tmdbclientapp.data.model.tvshow.TvShowList
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface TMDBService {

    @GET("movie/popular")
    suspend fun getPopularMovies(
        @Query(
            "api_key"
        ) apiKey :String = BuildConfig.API_KEY
    ):Response<MovieList>

    @GET("tv/popular")
    suspend fun getPopularTvShows(
        @Query(
            "api_key"
        ) apiKey :String = BuildConfig.API_KEY
    ):Response<TvShowList>

    @GET("person/popular")
    suspend fun getPopularArtists(
        @Query(
            "api_key"
        ) apiKey :String = BuildConfig.API_KEY
    ):Response<ArtistList>
}
