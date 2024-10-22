package com.example.a511lasalleapp.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.Color
import com.example.a511lasalleapp.R


@Composable
fun SettingsScreen(
    innerPadding: PaddingValues,
    isDarkTheme: Boolean, // Recibimos el estado actual del tema
    onThemeChange: () -> Unit // Función para cambiar el tema
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Imagen de perfil circular
        Image(
            painter = painterResource(id = R.drawable.pablitoelvaquero),
            contentDescription = "Profile Image",
            modifier = Modifier
                .size(128.dp)
                .clip(CircleShape),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Información del alumno
        Text(text = "Alejandro Paolo Escamilla Trujillo", style = MaterialTheme.typography.headlineMedium)
        Text(text = "Fecha de nacimiento: 11/03/2004")
        Text(text = "Correo: paolo.escamilla@institutolasalle.edu")

        Spacer(modifier = Modifier.height(24.dp))

        // Botón para cambiar el tema globalmente
        Button(onClick = { onThemeChange() }) {
            Text(text = if (isDarkTheme) "Cambiar a modo claro" else "Cambiar a modo oscuro")
        }
    }
}
