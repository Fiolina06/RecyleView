package com.example.recyleview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE ="OBJECT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val superheroList = listOf<superhero>(
            superhero(
                R.drawable.gamora,
                namesuperhero = "Gamora",
                descsuperhero = "Superhero yang berasal dari planet luar (guardian of galaxy) "
            ),
            superhero(
                R.drawable.hulk,
                namesuperhero = "Hulk",
                descsuperhero = "Superhero yang memiliki badan kuat karena serum "
            ),
            superhero(
                R.drawable.loki,
                namesuperhero = "Loki",
                descsuperhero = "Saudara dari Thor"
            ),
            superhero(
                R.drawable.nebula,
                namesuperhero = "Nebula",
                descsuperhero = "Superhero yang satu tim dengan Gamora"
            ),
            superhero(
                R.drawable.spiderman,
                namesuperhero = "Spiderman",
                descsuperhero = "Gebetan saya hehe "
            ),
            superhero(
                R.drawable.thor,
                namesuperhero = "Thor",
                descsuperhero = "Superhero Dewa yang berasal dari Asgard "
            ),
            superhero(
                R.drawable.wanda,
                namesuperhero = "Wanda",
                descsuperhero = "Superhero yang memiliki kemampuan tentang waktu"
            ),
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_hero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = superheroAdaptor(this,superheroList){
            val intent = Intent (this, DetailSuperheroActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }
    }
}