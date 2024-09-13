package com.example.animalspotter.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.AbsoluteAlignment
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.animalspotter.R

@Composable
fun LogoImage(modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.biospot_high_resolution_logo_transparent)
    Box(
        modifier = modifier
            .fillMaxSize()
    ) {
        Image(
            painter = image,
            contentDescription = "logo",
            modifier = Modifier
                .size(320.dp)
                .align(Alignment.Center)
                .offset(y = (-100).dp)
        )
    }
}

@Composable
fun Symbol(modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.biospot_favicon_color)
    Box(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Image(
            painter = image,
            contentDescription = "symbol",
            modifier = Modifier
                .size(100.dp)
                .align(Alignment.TopEnd)
        )
    }
}