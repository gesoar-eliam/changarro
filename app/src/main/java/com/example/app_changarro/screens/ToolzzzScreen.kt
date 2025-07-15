package com.example.changarro.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@ExperimentalMaterial3Api
@Composable
fun ToolzzzScreen(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(title = { Text("Herramientas") })
        }
    ) { paddingValues ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(16.dp)
        ) {
            items(5) { index ->
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 12.dp)
                        .clickable { navController.navigate("jobzzz_detail") },
                    shape = RoundedCornerShape(16.dp)
                ) {
                    Row(
                        modifier = Modifier
                            .padding(16.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Box(
                            modifier = Modifier
                                .size(60.dp)
                                .clip(RoundedCornerShape(8.dp))
                        ) {
                            // Usa imagen si tienes recurso
                            // Image(painter = painterResource(id = R.drawable.herramienta), contentDescription = null)
                            Text("🛠", modifier = Modifier.align(Alignment.Center))
                        }
                        Spacer(modifier = Modifier.width(16.dp))
                        Column {
                            Text("Herramienta #$index", style = MaterialTheme.typography.titleMedium)
                            Text("Categoría", style = MaterialTheme.typography.bodyMedium)
                        }
                    }
                }
            }
        }
    }
}
