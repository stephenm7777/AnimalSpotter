package com.example.animalspotter

import android.os.Build
import android.os.Bundle
import android.view.WindowInsetsController
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.annotation.RequiresApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.animalspotter.ui.theme.AnimalSpotterTheme
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.Color
import com.example.animalspotter.ui.theme.CustomYellow


class MainActivity : ComponentActivity() {
    @RequiresApi(Build.VERSION_CODES.R)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        //setContent is what sends it to the emulator
        setContent {
            AnimalSpotterTheme {
                Scaffold(
                    modifier = Modifier
                        .fillMaxSize()
                ) { innerPadding ->
                    Greeting(
                        name = "l",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

//actual app
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
        Text(
            text = "Hello my name is $name!",
            modifier = modifier.padding(24.dp)
        )
}

//for demo purposes
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AnimalSpotterTheme {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(CustomYellow)
        )
        Greeting("Daddy")
    }
}