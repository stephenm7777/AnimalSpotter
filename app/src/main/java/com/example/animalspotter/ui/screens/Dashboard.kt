package com.example.animalspotter.ui.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.animalspotter.ui.components.HomeButton

@Composable
fun Dashboard(navController: NavHostController){
        HomeButton(navController = navController)
}

@Preview(showBackground = true)
@Composable
fun DashboardPreview() {
    Dashboard(navController = rememberNavController())
}