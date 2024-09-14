package com.example.animalspotter.ui.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Text
import com.example.animalspotter.ui.theme.CustomRed
import androidx.navigation.NavHostController
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.Image
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.res.painterResource
import com.example.animalspotter.R

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
fun SubmitButton(
    navController: NavHostController,
    password: String,
    confirmPassword: String
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        FilledTonalButton(
            onClick = {
                if (password == confirmPassword) {
                    navController.navigate("dashboard")
                } else {
                    println("Passwords do not match")
                }
            },
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


@Composable
fun GoogleSignInButton() {
    Button(
        onClick = { /* Google Sign-In logic */ },
        colors = ButtonDefaults.buttonColors(containerColor = Color.White),
        modifier = Modifier
            .fillMaxWidth()
            .height(55.dp),
        shape = RoundedCornerShape(24.dp),
        contentPadding = PaddingValues(0.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.web_light_rd_na),
                contentDescription = "Google Sign-In",
                modifier = Modifier
                    .size(300.dp)
                    .padding(top = 8.dp, end = 8.dp)
            )
        }
    }
}

