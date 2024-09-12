package com.example.animalspotter.ui.screens

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.example.animalspotter.ui.components.LoginButton
import com.example.animalspotter.ui.components.LogoImage
import com.example.animalspotter.ui.components.SignUpButton
import com.example.animalspotter.ui.theme.AnimalSpotterTheme

@Composable
fun Home(navController: NavHostController){
    AnimalSpotterTheme {
        LogoImage()
        LoginButton(navController = navController)
        SignUpButton(navController = navController)
    }
}