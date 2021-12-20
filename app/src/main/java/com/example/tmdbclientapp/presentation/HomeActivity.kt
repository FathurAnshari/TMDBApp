package com.example.tmdbclientapp.presentation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.tmdbclientapp.R
import com.example.tmdbclientapp.databinding.ActivityHomeBinding
import com.example.tmdbclientapp.presentation.artist.ArtistActivity
import com.example.tmdbclientapp.presentation.movie.MovieActivity
import com.example.tmdbclientapp.presentation.tv.TvShowActivity
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


class HomeActivity : AppCompatActivity() {
    private lateinit var binding :ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_home)

        binding.movieButton.setOnClickListener {
            val intent = Intent(this, MovieActivity::class.java)
            startActivity(intent)
        }
        binding.tvButton.setOnClickListener {
            val intent = Intent(this, TvShowActivity::class.java)
            startActivity(intent)
        }
        binding.artistsButton.setOnClickListener {
            val intent = Intent(this, ArtistActivity::class.java)
            startActivity(intent)
        }
    }
}