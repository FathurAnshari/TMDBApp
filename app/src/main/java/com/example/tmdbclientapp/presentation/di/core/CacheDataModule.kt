package com.example.tmdbclientapp.presentation.di.core

import com.example.tmdbclientapp.data.repository.artist.datasource.ArtistCacheDatasource
import com.example.tmdbclientapp.data.repository.artist.datasourceimpl.ArtistCacheDatasourceImpl
import com.example.tmdbclientapp.data.repository.movie.datasource.MovieCacheDatasource
import com.example.tmdbclientapp.data.repository.movie.datasourceimpl.MovieCacheDatasourceImpl
import com.example.tmdbclientapp.data.repository.tvshow.datasource.TvShowCacheDatasource
import com.example.tmdbclientapp.data.repository.tvshow.datasourceimpl.TvShowCacheDatasourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class CacheDataModule {
    @Singleton
    @Provides
    fun provideMovieCacheDatasource():MovieCacheDatasource{
        return MovieCacheDatasourceImpl()
    }
    @Singleton
    @Provides
    fun provideTvShowCacheDatasource():TvShowCacheDatasource{
        return TvShowCacheDatasourceImpl()
    }
    @Singleton
    @Provides
    fun provideArtistCacheDatasource():ArtistCacheDatasource{
        return ArtistCacheDatasourceImpl()
    }
}