package com.example.changarro.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.changarro.screens.*

@Composable
fun AppNavigation(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "splash") {
        composable("splash") { SplashScreen(navController) }
        composable("home") { HomeScreen(navController) }
        composable("toolzzz") { ToolzzzScreen(navController) }
        composable("jobzzz") { JobzzzScreen(navController) }
        composable("jobzzz_detail") { JobzzzDetailScreen(navController) }
        composable("jobzzz_tool_add") { JobzzzToolAddScreen(navController) }
        composable("jobzzz_detail_2") { JobzzzDetail2Screen(navController) }
    }
}
