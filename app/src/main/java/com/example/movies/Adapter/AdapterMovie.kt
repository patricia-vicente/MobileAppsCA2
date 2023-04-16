package com.example.movies.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.movies.R
import com.example.movies.model.Movie

class AdapterMovie(private val context: Context, private val movies: MutableList<Movie>): RecyclerView.Adapter<AdapterMovie.MovieViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val itemLista = LayoutInflater.from(context).inflate(R.layout.mario,parent,false)
        val holder = MovieViewHolder(itemLista)
        return holder

    }

    override fun getItemCount(): Int = movies.size

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.foto.setImageResource(movies[position].foto)
        holder.nome.text = movies[position].nome
        holder.descricao.text = movies[position].descricao
        holder.date.text = movies[position].date


    }

    inner class MovieViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val foto = itemView.findViewById<ImageView>(R.id.fotoMovie)
        val nome = itemView.findViewById<TextView>(R.id.nomeMovie)
        val descricao = itemView.findViewById<TextView>(R.id.descricaoMovie)
        val date = itemView.findViewById<TextView>(R.id.dateMovie)


    }
}
