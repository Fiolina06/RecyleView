package com.example.recyleview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class superheroAdaptor( private val context: Context, private val superhero: List<superhero>, val listener:(superhero) -> Unit)
    : RecyclerView.Adapter<superheroAdaptor.superheroViewHolder>(){

    class superheroViewHolder (view:View): RecyclerView.ViewHolder(view){

        val imgsuperhero = view.findViewById<ImageView>(R.id.img_item_photo)
        val namesuperhero = view.findViewById<TextView>(R.id.tv_item_name)
        val descsuperhero = view.findViewById<TextView>(R.id.tv_item_description)


        fun bindView(superhero: superhero, listener: (superhero) -> Unit) {
            imgsuperhero.setImageResource(superhero.imgsuperhero)
            namesuperhero.text = superhero.namesuperhero
            descsuperhero.text = superhero.descsuperhero
            itemView.setOnClickListener{
                listener(superhero)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):superheroViewHolder {
        return superheroViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_superhero, parent, false)
        )
    }

    override fun onBindViewHolder(holder: superheroViewHolder, position: Int) {
     holder.bindView(superhero[position],listener)
    }

    override fun getItemCount(): Int = superhero.size
    }
