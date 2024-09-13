package com.example.animalspotter.ui.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.FilledTonalButton
import androidx.compose.ui.Alignment
import androidx.compose.material3.Text
import com.example.animalspotter.ui.theme.CustomRed
import androidx.navigation.NavHostController

@Composable
fun LoginButton(navController: NavHostController){
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        FilledTonalButton(
            onClick = { navController.navigate("login") },
            colors = ButtonDefaults.filledTonalButtonColors(
                containerColor = CustomRed,
                contentColor = Color.White
            ),
            modifier = Modifier
                .align(Alignment.Center)
                .offset(y = 200.dp, x = (-80).dp)
                .padding(16.dp)
        ) {
            Text("Login")
        }
    }

}

@Composable
fun SignUpButton(navController: NavHostController){
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        FilledTonalButton(
            onClick = { navController.navigate("signup") },
            colors = ButtonDefaults.filledTonalButtonColors(
                containerColor = CustomRed,
                contentColor = Color.White
            ),
            modifier = Modifier
                .align(Alignment.Center)
                .offset(y = 200.dp, x = 80.dp)
                .padding(16.dp)
        ) {
            Text("Sign Up")
        }
    }
}

@Composable
fun HomeButton(navController: NavHostController){
    Box(
        modifier = Modifier
            .fillMaxSize()
    ){
        FilledTonalButton(
            onClick = { navController.navigate("home")},
            colors = ButtonDefaults.filledTonalButtonColors(
                containerColor = CustomRed,
                contentColor = Color.White
            ),
            modifier = Modifier
                .align(Alignment.Center)
                .padding(16.dp)
        ) {
            Text("Home")
        }
    }
}

@Composable
fun SubmitButton(navController: NavHostController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        FilledTonalButton(
            onClick = { navController.navigate("home") },
            colors = ButtonDefaults.filledTonalButtonColors(
                containerColor = CustomRed,
                contentColor = Color.White
            ),
            modifier = Modifier
                .align(Alignment.Center)
                .fillMaxWidth()
        ) {
            Text("Submit")
        }
    }
}