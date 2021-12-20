package com.example.tmdbclientapp.presentation.artist

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.tmdbclientapp.domain.usecase.GetArtistsUseCase
import com.example.tmdbclientapp.domain.usecase.UpdateArtistsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ArtistViewModel @Inject constructor(
    private val getArtistsUseCase: GetArtistsUseCase,
    private val updateArtistsUseCase: UpdateArtistsUseCase
) :ViewModel(){

    fun getArtist() = liveData {
        val artistList = getArtistsUseCase.execute()
        emit(artistList)
    }

    fun updateArtist()= liveData{
        val artistList = updateArtistsUseCase.execute()
        emit(artistList)

    }
}