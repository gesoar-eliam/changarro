package com.example.changarro.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun JobzzzDetailScreen(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(title = { Text("Detalle Herramienta") })
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(16.dp)
        ) {
            Text("Nombre: Taladro", style = MaterialTheme.typography.titleMedium)
            Text("Descripción: Herramienta potente...", style = MaterialTheme.typography.bodyMedium)
            Spacer(modifier = Modifier.height(12.dp))
            Button(onClick = { /* Acción */ }) {
                Text("Reservar")
            }
        }
    }
}
