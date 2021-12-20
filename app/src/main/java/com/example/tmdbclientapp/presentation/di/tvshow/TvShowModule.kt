package com.example.tmdbclientapp.presentation.di.tvshow

import com.example.tmdbclientapp.domain.usecase.GetTvShowsUseCase
import com.example.tmdbclientapp.domain.usecase.UpdateTvShowsUseCase
import com.example.tmdbclientapp.presentation.tv.TvShowViewModelFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class TvShowModule {

    @Singleton
    @Provides
    fun provideTvShowViewModelFactory(
        getTvShowsUseCase: GetTvShowsUseCase,
        updateTvShowsUseCase: UpdateTvShowsUseCase
    ): TvShowViewModelFactory{
        return TvShowViewModelFactory(
            getTvShowsUseCase,
            updateTvShowsUseCase
        )
    }
}