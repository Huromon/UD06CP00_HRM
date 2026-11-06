package com.example.ud06cp00_hrm

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ud06cp00_hrm.adapter.PersonaAdapter
import com.example.ud06cp00_hrm.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var layoutManager: LinearLayoutManager
    private lateinit var adapter: PersonaAdapter
    private var listaPersona: List<Persona> = emptyList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        ViewCompat.setOnApplyWindowInsetsListener(binding.main) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        listaPersona = PersonaProvider.cargarPersonas()
        layoutManager = LinearLayoutManager(this)
        binding.rvPersonas.layoutManager = layoutManager
        binding.rvPersonas.setHasFixedSize(true)
        binding.rvPersonas.itemAnimator = DefaultItemAnimator()
        /* binding.rvFrutas.addItemDecoration(
             DividerItemDecoration(this, DividerItemDecoration.VERTICAL)
         )*/
        adapter = PersonaAdapter { persona -> onItemSelected(persona) }
        binding.rvPersonas.adapter = adapter
        adapter.submitList(listaPersona)
    }

    private fun onItemSelected(persona: Persona) {
        Toast.makeText(this, "Has pulsado sobre ${persona.nombre}", Toast.LENGTH_SHORT).show()
    }





    private fun addPersona() {
        val nuevaPersona = Persona(
            nombre = "Nueva Persona ${listaPersona.size + 1}",
            descripcion = "Desconocida",
            imagen = R.drawable.chica01,
            fecha = TODO(),
            correo = TODO(),
            telefono = TODO(),
            ciudad = TODO(),
        )
        listaPersona = listaPersona + nuevaPersona
        adapter.submitList(listaPersona) {
            layoutManager.scrollToPosition(listaPersona.size - 1)
        }
    }
}
