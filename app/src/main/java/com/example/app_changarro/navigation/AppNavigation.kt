package com.example.app_changarro.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.changarro.screens.HomeScreen
import com.example.changarro.screens.JobzzzDetailScreen
import com.example.changarro.screens.JobzzzScreen
import com.example.changarro.screens.JobzzzToolAddScreen
import com.example.changarro.screens.SplashScreen
import com.example.changarro.screens.ToolzzzScreen
import com.example.changarro.screens.JobzzzDetail2Screen

@ExperimentalMaterial3Api
@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    Scaffold(
        bottomBar = {
            val currentRoute = navController.currentBackStackEntry?.destination?.route
            if (currentRoute in listOf("home", "toolzzz", "jobzzz")) {

            }
        }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = "splash",
            modifier = Modifier.padding(innerPadding)
        ) {
            composable("splash") { SplashScreen(navController) }
            composable("home") { HomeScreen(navController) }
            composable("toolzzz") { ToolzzzScreen(navController) }
            composable("jobzzz") { JobzzzScreen(navController) }
            composable("jobzzz_detail") { JobzzzDetailScreen(navController) }
            composable("jobzzz_detail_2") { JobzzzDetail2Screen(navController) }
            composable("jobzzz_tool_add") { JobzzzToolAddScreen(navController) }
        }
    }
}

@Composable
fun JobzzzDetailScreen2(x0: NavHostController) {
    TODO("Not yet implemented")
}
