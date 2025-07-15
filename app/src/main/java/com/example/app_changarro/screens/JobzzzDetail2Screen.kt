package com.example.changarro.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun JobzzzDetail2Screen(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(title = { Text("Detalle del trabajo") })
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(16.dp)
        ) {
            Text("Trabajo: Reparación de puerta", style = MaterialTheme.typography.titleMedium)
            Text("Fecha: 12/07/2025", style = MaterialTheme.typography.bodyMedium)
            Text("Ubicación: Col. Centro", style = MaterialTheme.typography.bodyMedium)
            Spacer(modifier = Modifier.height(12.dp))
            Button(onClick = { /* Acción */ }) {
                Text("Aceptar trabajo")
            }
        }
    }
}
