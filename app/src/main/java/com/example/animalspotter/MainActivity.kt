package com.example.animalspotter

import android.media.tv.TvContract.Channels.Logo
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.animalspotter.ui.theme.AnimalSpotterTheme
import androidx.compose.ui.unit.dp

//My Customs
import com.example.animalspotter.ui.components.CustomButton
import com.example.animalspotter.ui.theme.CustomYellow
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.ui.Alignment

class MainActivity : ComponentActivity() {
    @RequiresApi(Build.VERSION_CODES.R)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        //setContent is what sends it to the emulator
        setContent {
            AnimalSpotterTheme {
                    LogoImage()
            }
        }
    }
}

@Composable
fun LogoImage(modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.biospot_high_resolution_logo_transparent)
    Box(
        modifier = modifier
            .fillMaxSize()
    ) {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                .size(320.dp)
                .align(Alignment.Center)
                .offset(y = (-100).dp)
        )
    }
}

@Composable
fun Button(){
    
}

//for demo purposes
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AnimalSpotterTheme {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
        )

        LogoImage()
    }
}
