package com.example.recyleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailSuperheroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_superhero)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val superhero = intent.getParcelableExtra<superhero>(MainActivity.INTENT_PARCELABLE)

        val imgsuperhero = findViewById<ImageView>(R.id.img_item_photo)
        val namesuperhero = findViewById<TextView>(R.id.tv_item_name)
        val descsuperhero = findViewById<TextView>(R.id.tv_item_description)

        imgsuperhero.setImageResource(superhero?.imgsuperhero!!)
        namesuperhero.text = superhero.namesuperhero
        descsuperhero.text = superhero.descsuperhero
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}