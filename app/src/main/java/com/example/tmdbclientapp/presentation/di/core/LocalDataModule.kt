package com.example.tmdbclientapp.presentation.di.core

import com.example.tmdbclientapp.data.db.ArtistDao
import com.example.tmdbclientapp.data.db.MovieDao
import com.example.tmdbclientapp.data.db.TvShowDao
import com.example.tmdbclientapp.data.repository.artist.datasource.ArtistLocalDatasource
import com.example.tmdbclientapp.data.repository.artist.datasourceimpl.ArtistLocalDatasourceImpl
import com.example.tmdbclientapp.data.repository.movie.datasource.MovieLocalDatasource
import com.example.tmdbclientapp.data.repository.movie.datasourceimpl.MovieLocalDatasourceImpl
import com.example.tmdbclientapp.data.repository.tvshow.datasource.TvShowLocalDatasource
import com.example.tmdbclientapp.data.repository.tvshow.datasourceimpl.TvShowLocalDatasourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class LocalDataModule {
    @Singleton
    @Provides
    fun provideMovieLocalDatasource(movieDao: MovieDao):MovieLocalDatasource{
        return MovieLocalDatasourceImpl(movieDao)
    }
    @Singleton
    @Provides
    fun provideTvShowLocalDatasource(tvShowDao: TvShowDao):TvShowLocalDatasource{
        return TvShowLocalDatasourceImpl(tvShowDao)
    }
    @Singleton
    @Provides
    fun provideArtistLocalDatasource(artistDao: ArtistDao):ArtistLocalDatasource{
        return ArtistLocalDatasourceImpl(artistDao)
    }
}