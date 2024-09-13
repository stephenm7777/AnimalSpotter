package com.example.animalspotter.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.draw.clip
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.animalspotter.ui.components.HomeButton
import com.example.animalspotter.ui.components.SubmitButton
import com.example.animalspotter.ui.components.Symbol
import com.example.animalspotter.ui.theme.CustomRed
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import com.example.animalspotter.ui.components.GoogleSignInButton

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignUp(navController: NavHostController) {

    var name by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var confirmPassword by remember { mutableStateOf("") }

    val screenHeight = LocalConfiguration.current.screenHeightDp.dp
    val scrollState = rememberScrollState()
    val focusManager = LocalFocusManager.current

    Box (
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState)
            .pointerInput(Unit){
                detectTapGestures ( onTap = {
                    focusManager.clearFocus()
                })
            }
            .background(Color.White)
            .offset(y = 75.dp),
        contentAlignment = Alignment.Center
    ){

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 16.dp, end = 16.dp)
                .offset(y = (-90).dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)

        ) {
            Text(
                text = "Welcome",
                style = TextStyle(
                    fontSize = 32.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = CustomRed
                ),
                modifier = Modifier
                    .offset(y=(-40).dp)
            )
            Text(
                text = "Thank you for signing up",
                style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Normal,
                    color = CustomRed
                ),
                modifier = Modifier
                    .offset(y=(-40).dp)
            )
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.White, RoundedCornerShape(33.dp))
                    .border(1.dp, Color.Gray, RoundedCornerShape(33.dp))
                    .clip(RoundedCornerShape(33.dp))
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp)
                        .padding(vertical = 8.dp)
                ) {
                    Icon(
                        imageVector = Icons.Filled.Person,
                        contentDescription = "Name Icon",
                        tint = Color.Gray,
                        modifier = Modifier
                            .align(Alignment.CenterVertically)
                            .size(27.dp)
                    )
                    TextField(
                        value = name,
                        onValueChange = { name = it },
                        label = { Text("Username") },
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color.Transparent)
                            .offset(x=(-10).dp),
                        colors = TextFieldDefaults.textFieldColors(
                            containerColor = Color.Transparent,
                            focusedIndicatorColor = Color.Transparent,
                            unfocusedIndicatorColor = Color.Transparent
                        ),
                    )
                }
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.White, RoundedCornerShape(33.dp))
                    .border(1.dp, Color.Gray, RoundedCornerShape(33.dp))
                    .clip(RoundedCornerShape(33.dp))
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 16.dp)
                ) {
                    Icon(
                        imageVector = Icons.Filled.Email,
                        contentDescription = "Email Icon",
                        tint = Color.Gray,
                        modifier = Modifier
                            .align(Alignment.CenterVertically)
                            .size(27.dp)

                    )
                    TextField(
                        value = email,
                        onValueChange = { email = it },
                        label = { Text("Email") },
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color.Transparent)
                            .offset(x=(-10).dp),
                        colors = TextFieldDefaults.textFieldColors(
                            containerColor = Color.Transparent,
                            focusedIndicatorColor = Color.Transparent,
                            unfocusedIndicatorColor = Color.Transparent
                        ),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
                    )
                }
            }

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.White, RoundedCornerShape(33.dp))
                    .border(1.dp, Color.Gray, RoundedCornerShape(33.dp))
                    .clip(RoundedCornerShape(33.dp))
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 16.dp)
                        .padding(vertical = 8.dp)
                ) {
                    Icon(
                        imageVector = Icons.Filled.Lock,
                        contentDescription = "Password Icon",
                        tint = Color.Gray,
                        modifier = Modifier
                            .align(Alignment.CenterVertically)
                            .size(27.dp)
                    )
                    TextField(
                        value = password,
                        onValueChange = { password = it },
                        label = { Text("Password") },
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color.Transparent)
                            .offset(x=(-10).dp),
                        colors = TextFieldDefaults.textFieldColors(
                            containerColor = Color.Transparent,
                            focusedIndicatorColor = Color.Transparent,
                            unfocusedIndicatorColor = Color.Transparent
                        ),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                        visualTransformation = PasswordVisualTransformation()
                    )
                }
            }

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.White, RoundedCornerShape(33.dp))
                    .border(1.dp, Color.Gray, RoundedCornerShape(33.dp))
                    .clip(RoundedCornerShape(33.dp))
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp)
                        .padding(vertical = 8.dp)
                ) {
                    Icon(
                        imageVector = Icons.Filled.Lock,
                        contentDescription = "Password Icon",
                        tint = Color.Gray,
                        modifier = Modifier
                            .align(Alignment.CenterVertically)
                            .size(27.dp)

                    )
                    TextField(
                        value = confirmPassword,
                        onValueChange = { confirmPassword = it },
                        label = { Text("Confirm Password") },
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color.Transparent)
                            .offset(x=(-10).dp),
                        colors = TextFieldDefaults.textFieldColors(
                            containerColor = Color.Transparent,
                            focusedIndicatorColor = Color.Transparent,
                            unfocusedIndicatorColor = Color.Transparent
                        ),
                        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
                        visualTransformation = PasswordVisualTransformation()
                    )
                }
            }

            SubmitButton(navController = navController)
            Text(
                text = "Already have an account? Log in",
                style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Light,
                    color = CustomRed,
                ),
                modifier = Modifier
                    .padding(top = 5.dp)
            )
            Text(
                text = " - or Sign up with - ",
                style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Light,
                    color = CustomRed
                ),
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
                    .padding(top = 5.dp, end = 5.dp )
            )

            GoogleSignInButton()
        }
        Symbol(
            modifier = Modifier
                .align(Alignment.TopEnd)
                .offset(y=(-70).dp, x = 10.dp)
        )

    }

}

@Preview(showBackground = true)
@Composable
fun SignUpPreview() {
    SignUp(navController = rememberNavController())
}