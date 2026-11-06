package com.example.ud06cp00_hrm

class PersonaProvider {
    companion object{
        fun cargarPersonas(): MutableList<Persona> {
            return mutableListOf(
                Persona("Ana", "Amante de la naturaleza", R.drawable.chica01, 1995, "ana.rojas@example.com", "+34 600 111 222", "Sevilla"),
                Persona("Carlos", "Le gusta programar y enseñar", R.drawable.chico01, 1990, "carlos.martin@example.com", "+34 600 222 333", "Madrid"),
                Persona("María", "Aficionada a la música", R.drawable.chica02, 1999, "maria.gomez@example.com", "+34 600 333 444", "Barcelona"),
                Persona("Pablo", "Fotógrafo profesional", R.drawable.chico02, 1983, "pablo.sanchez@example.com", "+34 600 444 555", "Valencia"),
                Persona("Lucía", "Fanática de los libros de misterio", R.drawable.chica03, 1993, "lucia.moreno@example.com", "+34 600 555 666", "Granada"),
                Persona("Javier", "Deportista y corredor de maratones", R.drawable.chico03, 1996, "javier.lopez@example.com", "+34 600 666 777", "Bilbao"),
                Persona("Sofía", "Cocina platos internacionales", R.drawable.chica04, 1991, "sofia.rivas@example.com", "+34 600 777 888", "A Coruña"),
                Persona("Miguel", "Apasionado por los viajes", R.drawable.chico04, 1986, "miguel.navarro@example.com", "+34 600 888 999", "Málaga"),
                Persona("Laura", "Diseñadora gráfica", R.drawable.chica05, 1996, "laura.vazquez@example.com", "+34 600 999 000", "Zaragoza"),
                Persona("Andrés", "Amante del cine clásico", R.drawable.chico05, 1978, "andres.perez@example.com", "+34 601 111 222", "Valladolid"),
                Persona("Elena", "Bailarina de ballet", R.drawable.chica06, 2001, "elena.soto@example.com", "+34 601 222 333", "Palma"),
                Persona("Raúl", "Toca la guitarra en una banda", R.drawable.chico06, 1992, "raul.fernandez@example.com", "+34 601 333 444", "Santander")
            )
        }

    }
}