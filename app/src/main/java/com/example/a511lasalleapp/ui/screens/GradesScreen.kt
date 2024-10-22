package com.example.a511lasalleapp.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun GradesScreen(innerPadding: PaddingValues) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding)
            .padding(16.dp)
    ) {
        // Información del alumno
        Text(text = "Alejandro Paolo Escamilla Trujillo", style = MaterialTheme.typography.headlineMedium)
        Text(text = "Carrera: Ingeniería en Sistemas")
        Text(text = "Semestre: 5to")
        Text(text = "Promedio acumulado: 9.2")

        Spacer(modifier = Modifier.height(24.dp))

        // Título de la lista de materias
        Text(text = "Materias cursadas:", style = MaterialTheme.typography.headlineSmall)

        Spacer(modifier = Modifier.height(16.dp))

        // Lista de materias y calificaciones
        LazyColumn {
            items(materias) { materia ->
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 4.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    Text(materia.clave, modifier = Modifier.weight(1f))
                    Text(materia.nombre, modifier = Modifier.weight(3f))
                    Text(materia.grupo, modifier = Modifier.weight(1f))
                    Text(materia.p1, modifier = Modifier.weight(1f))
                    Text(materia.p2, modifier = Modifier.weight(1f))
                    Text(materia.p3, modifier = Modifier.weight(1f))
                    Text(materia.cf, modifier = Modifier.weight(1f))
                }
            }
        }
    }
}

// Datos simulados para materias
data class Materia(
    val clave: String,
    val nombre: String,
    val grupo: String,
    val p1: String,
    val p2: String,
    val p3: String,
    val cf: String
)

val materias = listOf(
    Materia("05LIS531", "ADMINISTRACIÓN DE PROYECTOS TECNOLÓGICOS", "511", "7.7", "0.0", "0.0", "0.0"),
    Materia("05LIS532", "MODELOS ABSTRACTOS PARA EL DESARROLLO DE SOFTWARE", "511", "9.4", "0.0", "0.0", "0.0"),
    Materia("05LIS533", "TALLER DE DESARROLLO MÓVIL PARA PLATAFORMA ANDROID", "511", "6.4", "0.0", "0.0", "0.0"),
    Materia("05LIS534", "MODELADO Y PROCESAMIENTO DE IMÁGENES", "511", "4.4", "0.0", "0.0", "0.0"),
    Materia("05LIS535", "CONMUTACIÓN EN REDES DE ÁREA LOCAL", "511", "5.0", "0.0", "0.0", "0.0"),
    Materia("05LIS536", "ADMINISTRACIÓN DE BASES DE DATOS", "511", "6.6", "0.0", "0.0", "0.0")
)
