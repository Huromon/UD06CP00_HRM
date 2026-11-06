package com.example.ud06cp00_hrm.adapter

import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.example.ud06cp00_hrm.Persona
import com.example.ud06cp00_hrm.R
import com.example.ud06cp00_hrm.databinding.ItemPersonaBinding


class PersonaViewHolder(private val binding: ItemPersonaBinding) : ViewHolder(binding.root) {




    fun render(persona: Persona, onClickListener: (Persona) -> Unit) {
        binding.tvNombre.text = persona.nombre
        binding.tvDesc.text = persona.descripcion

        Glide.with(binding.imgAva.context)
            .load(persona.imagen)
            .fitCenter()
            .placeholder(R.drawable.ic_persona_placeholder)
            .error(R.drawable.ic_persona_error)
            .diskCacheStrategy(DiskCacheStrategy.ALL)
            .into(binding.imgAva)
        binding.root.setOnClickListener {
            onClickListener(persona)
        }
    }
}


