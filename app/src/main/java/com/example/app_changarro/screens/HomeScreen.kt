package com.example.changarro.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun HomeScreen(navController: NavController) {
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(16.dp)) {
        Text("Bienvenido a Home", style = MaterialTheme.typography.headlineSmall)
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = { navController.navigate("toolzzz") }) {
            Text("Ir a Toolzzz")
        }
    }
}
