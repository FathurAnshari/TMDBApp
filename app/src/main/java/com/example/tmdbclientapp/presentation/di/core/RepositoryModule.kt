package com.example.tmdbclientapp.presentation.di.core

import com.example.tmdbclientapp.data.repository.artist.ArtistRepositoryImpl
import com.example.tmdbclientapp.data.repository.artist.datasource.ArtistCacheDatasource
import com.example.tmdbclientapp.data.repository.artist.datasource.ArtistLocalDatasource
import com.example.tmdbclientapp.data.repository.artist.datasource.ArtistRemoteDatasource
import com.example.tmdbclientapp.data.repository.movie.MovieRepositoryImpl
import com.example.tmdbclientapp.data.repository.movie.datasource.MovieCacheDatasource
import com.example.tmdbclientapp.data.repository.movie.datasource.MovieLocalDatasource
import com.example.tmdbclientapp.data.repository.movie.datasource.MovieRemoteDatasource
import com.example.tmdbclientapp.data.repository.tvshow.TvShowRepositoryImpl
import com.example.tmdbclientapp.data.repository.tvshow.datasource.TvShowCacheDatasource
import com.example.tmdbclientapp.data.repository.tvshow.datasource.TvShowLocalDatasource
import com.example.tmdbclientapp.data.repository.tvshow.datasource.TvShowRemoteDatasource
import com.example.tmdbclientapp.domain.repository.ArtistRepository
import com.example.tmdbclientapp.domain.repository.MovieRepository
import com.example.tmdbclientapp.domain.repository.TvShowRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {

    @Singleton
    @Provides
    fun provideMovieRepository(
        movieRemoteDatasource: MovieRemoteDatasource,
        movieLocalDatasource: MovieLocalDatasource,
        movieCacheDatasource: MovieCacheDatasource
    ):MovieRepository{
        return MovieRepositoryImpl(
            movieRemoteDatasource,
            movieLocalDatasource,
            movieCacheDatasource
        )
    }
    @Singleton
    @Provides
    fun provideTvSHowRepository(
        tvShowRemoteDatasource: TvShowRemoteDatasource,
        tvShowLocalDatasource: TvShowLocalDatasource,
        tvShowCacheDatasource: TvShowCacheDatasource
    ):TvShowRepository{
        return TvShowRepositoryImpl(
            tvShowRemoteDatasource,
            tvShowLocalDatasource,
            tvShowCacheDatasource
        )
    }

    @Singleton
    @Provides
    fun provideArtistRepository(
        artistRemoteDatasource: ArtistRemoteDatasource,
        artistLocalDatasource: ArtistLocalDatasource,
        artistCacheDatasource: ArtistCacheDatasource
    ):ArtistRepository{
        return ArtistRepositoryImpl(
            artistRemoteDatasource,
            artistLocalDatasource,
            artistCacheDatasource
        )
    }
}