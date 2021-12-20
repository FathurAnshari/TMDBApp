package com.example.tmdbclientapp.presentation.tv

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.tmdbclientapp.domain.usecase.GetTvShowsUseCase
import com.example.tmdbclientapp.domain.usecase.UpdateTvShowsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class TvShowViewModel @Inject constructor(
    private val getTvShowsUseCase: GetTvShowsUseCase,
    private val updateTvShowsUseCase: UpdateTvShowsUseCase
) : ViewModel() {

    fun getTvSHow() = liveData{
        val tvShowList = getTvShowsUseCase.execute()
        emit(tvShowList)
    }

    fun updateTvShow() = liveData{
        val tvShowList = updateTvShowsUseCase.execute()
        emit(tvShowList)
    }
}