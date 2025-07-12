package com.example.changarro.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun JobzzzScreen(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(title = { Text("Trabajos disponibles") })
        },
        floatingActionButton = {
            FloatingActionButton(onClick = { navController.navigate("jobzzz_tool_add") }) {
                Text("+")
            }
        }
    ) { paddingValues ->
        LazyColumn(
            contentPadding = paddingValues,
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            items(5) { i ->
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 8.dp)
                        .clickable { navController.navigate("jobzzz_detail_2") }
                ) {
                    Column(modifier = Modifier.padding(16.dp)) {
                        Text("Trabajo #$i", style = MaterialTheme.typography.titleMedium)
                        Text("Detalles breves del trabajo.", style = MaterialTheme.typography.bodyMedium)
                    }
                }
            }
        }
    }
}
