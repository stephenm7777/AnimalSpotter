package com.example.animalspotter

import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.RequiresApi
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.example.animalspotter.ui.navigation.NavGraph
import com.example.animalspotter.ui.components.LoginButton
import com.example.animalspotter.ui.components.LogoImage
import com.example.animalspotter.ui.components.SignUpButton
import com.example.animalspotter.ui.theme.AnimalSpotterTheme

class MainActivity : ComponentActivity() {
    @RequiresApi(Build.VERSION_CODES.R)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContent {
            AnimalSpotterTheme {
                val navController = rememberNavController()
                NavGraph(navController = navController)
            }
        }
    }
}
