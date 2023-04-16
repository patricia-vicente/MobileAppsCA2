package com.example.movies

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.movies.Adapter.AdapterMovie
import com.example.movies.model.Movie

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar!!.hide()
        val recyclerViewMovies = findViewById<RecyclerView>(R.id.recyclerViewMovies)
        recyclerViewMovies.layoutManager = LinearLayoutManager(this)
        recyclerViewMovies.setHasFixedSize(true)

        //adapter
        val listaMovie: MutableList<Movie> = mutableListOf()
        val adapterMovie = AdapterMovie(this,listaMovie)
        recyclerViewMovies.adapter = adapterMovie

        val movie1 = Movie(
            R.drawable.mario,
            "THE SUPER MARIO BROS. MOVIE",
            "A plumber named Mario travels through an underground labyrinth with his brother, Luigi, trying to save a captured princess.",
            "UPCOMING SHOWINGS FOR TODAY, SUN 16 APR"
        )
        listaMovie.add(movie1)

        val movie2 = Movie(
            R.drawable.dragons,
            "DUNGEONS & DRAGONS: HONOUR AMONG THIEVES",
            "A charming thief and a band of unlikely adventurers undertake an epic heist to retrieve a lost relic, but things go dangerously awry when they run afoul of the wrong people.",
            "UPCOMING SHOWINGS FOR TODAY, SUN 16 APR"
        )
        listaMovie.add(movie2)

        val movie3 = Movie(
            R.drawable.john,
            "JOHN WICK: CHAPTER 4",
            "John Wick (Keanu Reeves) uncovers a path to defeating The High Table. But before he can earn his freedom, Wick must face off against a new enemy with powerful alliances across the globe and forces that turn old friends into foes.",
            "UPCOMING SHOWINGS FOR TODAY, SUN 16 APR"
        )
        listaMovie.add(movie3)

        val movie4 = Movie(
            R.drawable.air,
            "AIR",
            "From award-winning director Ben Affleck, 'Air' reveals the unbelievable game-changing partnership between a then rookie Michael Jordan and Nike's fledgling basketball division which revolutionized the world of sports and contemporary culture.",
            "UPCOMING SHOWINGS FOR TODAY, SUN 16 APR"
        )
        listaMovie.add(movie4)

        val movie5 = Movie(
            R.drawable.guardians,
            "GUARDIANS OF THE GALAXY VOL. 3",
            "Peter Quill, still reeling from the loss of Gamora, must rally his team around him to defend the universe along with protecting one of their own.",
            "UPCOMING SHOWINGS FOR TODAY, SUN 16 APR"
        )
        listaMovie.add(movie5)
    }
}