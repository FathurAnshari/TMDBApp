package com.example.tmdbclientapp.presentation.di.artist

import com.example.tmdbclientapp.domain.usecase.GetArtistsUseCase
import com.example.tmdbclientapp.domain.usecase.UpdateArtistsUseCase
import com.example.tmdbclientapp.presentation.artist.ArtistViewModelFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class ArtistModule {

    @Singleton
    @Provides
    fun provideArtistViewModelFactory(
        getArtistsUseCase: GetArtistsUseCase,
        updateArtistsUseCase: UpdateArtistsUseCase
    ):ArtistViewModelFactory{
        return ArtistViewModelFactory(
            getArtistsUseCase,
            updateArtistsUseCase
        )
    }
}