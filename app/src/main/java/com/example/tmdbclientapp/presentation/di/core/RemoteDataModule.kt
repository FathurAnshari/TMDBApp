package com.example.tmdbclientapp.presentation.di.core

import com.example.tmdbclientapp.data.api.TMDBService
import com.example.tmdbclientapp.data.repository.artist.datasource.ArtistRemoteDatasource
import com.example.tmdbclientapp.data.repository.artist.datasourceimpl.ArtistRemoteDatasourceImpl
import com.example.tmdbclientapp.data.repository.movie.datasource.MovieRemoteDatasource
import com.example.tmdbclientapp.data.repository.movie.datasourceimpl.MovieRemoteDatasourceImpl
import com.example.tmdbclientapp.data.repository.tvshow.datasource.TvShowRemoteDatasource
import com.example.tmdbclientapp.data.repository.tvshow.datasourceimpl.TvShowRemoteDatasourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RemoteDataModule {
    @Singleton
    @Provides
    fun provideMovieRemoteDatasource(tmdb:TMDBService): MovieRemoteDatasource{
        return MovieRemoteDatasourceImpl(tmdb)
    }
    @Singleton
    @Provides
    fun provideTvShowRemoteDatasource(tmdb: TMDBService):TvShowRemoteDatasource{
        return TvShowRemoteDatasourceImpl(tmdb)
    }
    @Singleton
    @Provides
    fun provideArtistRemoteDatasource(tmdb: TMDBService):ArtistRemoteDatasource{
        return ArtistRemoteDatasourceImpl(tmdb)
    }
}