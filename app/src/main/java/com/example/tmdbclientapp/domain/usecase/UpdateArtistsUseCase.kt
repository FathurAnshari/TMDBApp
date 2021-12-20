package com.example.tmdbclientapp.domain.usecase

import com.example.tmdbclientapp.data.model.artist.Artist
import com.example.tmdbclientapp.domain.repository.ArtistRepository

class UpdateArtistsUseCase(private val artistRepository: ArtistRepository) {
    suspend fun execute():List<Artist>? = artistRepository.updateArtists()
}