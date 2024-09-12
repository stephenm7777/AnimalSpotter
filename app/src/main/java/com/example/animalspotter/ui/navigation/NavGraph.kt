package com.example.animalspotter.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.animalspotter.ui.screens.LoginScreen
import com.example.animalspotter.ui.screens.SignUp
import com.example.animalspotter.ui.screens.Home

@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "home") {
        composable("login") { LoginScreen(navController) }
        composable("signup") { SignUp(navController) }
        composable("home") { Home(navController) }
    }
}