package com.example.nudge

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff

// Custom font variable
val GeorgeRounded = FontFamily(Font(R.font.georgerounded))

@Composable
fun LoginScreen() {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.nudge_white))
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(WindowInsets.statusBars.asPaddingValues())
                .padding(horizontal = 24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Top: Logo + Tagline
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxWidth()
            ) {
                Spacer(modifier = Modifier.height(24.dp))

                Image(
                    painter = painterResource(id = R.drawable.homescreennudge),
                    contentDescription = "login logo",
                    modifier = Modifier.size(width = 400.dp, height = 200.dp)
                )

                Spacer(modifier = Modifier.height(12.dp))

                Text(
                    text = "Reconnect with What Matters",
                    fontSize = 24.sp,
                    fontFamily = GeorgeRounded,
                    color = colorResource(id = R.color.nudge_blue)
                )
            }

            Spacer(modifier = Modifier.height(48.dp))


            // Centered Fields and Buttons
            Column(
                modifier = Modifier
                    .widthIn(max = 300.dp)
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 4.dp)
            ) {
                Text(
                    text = "Login",
                    fontSize = 24.sp,
                    fontFamily = GeorgeRounded,
                    color = colorResource(id = R.color.nudge_blue),
                    modifier = Modifier.align(Alignment.Center)
                )
            }
                OutlinedTextField(
                    value = email,
                    onValueChange = { email = it },
                    label = {
                        Text("Email", fontFamily = GeorgeRounded, color = colorResource(id = R.color.nudge_blue))
                    },
                    textStyle = androidx.compose.ui.text.TextStyle(
                        color = colorResource(id = R.color.black), // Or another dark color you prefer
                        fontFamily = GeorgeRounded
                    ),
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedBorderColor = colorResource(id = R.color.nudge_blue),
                        focusedBorderColor = colorResource(id = R.color.nudge_blue),
                        unfocusedLabelColor = colorResource(id = R.color.nudge_blue),
                        focusedLabelColor = colorResource(id = R.color.nudge_blue),
                        cursorColor = colorResource(id = R.color.nudge_blue),
                        unfocusedTextColor = colorResource(id = R.color.black),
                        focusedTextColor = colorResource(id = R.color.black),
                        unfocusedContainerColor = colorResource(id = R.color.nudge_white),
                        focusedContainerColor = colorResource(id = R.color.nudge_white)
                    ),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 8.dp)
                )

                Spacer(modifier = Modifier.height(16.dp))

                var passwordVisible by remember { mutableStateOf(false) }

                OutlinedTextField(
                    value = password,
                    onValueChange = { password = it },
                    label = {
                        Text("Password", fontFamily = GeorgeRounded, color = colorResource(id = R.color.nudge_blue))
                    },
                    textStyle = androidx.compose.ui.text.TextStyle(
                        color = colorResource(id = R.color.black),
                        fontFamily = GeorgeRounded
                    ),
                    visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),
                    trailingIcon = {
                        val icon = if (passwordVisible) Icons.Default.VisibilityOff else Icons.Default.Visibility
                        val description = if (passwordVisible) "Hide password" else "Show password"
                        Icon(
                            imageVector = icon,
                            contentDescription = description,
                            modifier = Modifier.clickable { passwordVisible = !passwordVisible },
                            tint = colorResource(id = R.color.nudge_blue)
                        )
                    },
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedBorderColor = colorResource(id = R.color.nudge_blue),
                        focusedBorderColor = colorResource(id = R.color.nudge_blue),
                        unfocusedLabelColor = colorResource(id = R.color.nudge_blue),
                        focusedLabelColor = colorResource(id = R.color.nudge_blue),
                        cursorColor = colorResource(id = R.color.nudge_blue),
                        unfocusedTextColor = colorResource(id = R.color.black),
                        focusedTextColor = colorResource(id = R.color.black),
                        unfocusedContainerColor = colorResource(id = R.color.nudge_white),
                        focusedContainerColor = colorResource(id = R.color.nudge_white)
                    ),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 8.dp)
                )
                Text(
                    text = "Forgot Password?",
                    color = colorResource(id = R.color.nudge_blue),
                    fontFamily = GeorgeRounded,
                    fontSize = 14.sp,
                    modifier = Modifier
                        .align(Alignment.End)
                        .padding(top = 8.dp, bottom = 16.dp)
                        .clickable{/* TODO: Handle Forgot Password */}
                )



                Spacer(modifier = Modifier.height(12.dp))

                Button(
                    onClick = { /* TODO: Handle login */ },
                    colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.nudge_blue)),
                    shape = RectangleShape,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(text = "Login", color = colorResource(id = R.color.nudge_white), fontFamily = GeorgeRounded)
                }

                Spacer(modifier = Modifier.height(12.dp))

                OutlinedButton(
                    onClick = { /* TODO: Handle skip */ },
                    colors = ButtonDefaults.outlinedButtonColors(contentColor = colorResource(id = R.color.nudge_blue)),
                    shape = RectangleShape,
                    border = BorderStroke(2.dp, colorResource(id = R.color.nudge_blue)),
                    modifier = Modifier.fillMaxWidth()
                        .clickable{
                            /* TODO: Handle login */
                        }
                ) {
                    Text(text = "Skip Login", fontFamily = GeorgeRounded)
                }
                Spacer(modifier = Modifier.height(12.dp))

                // New "Create Account" button
                OutlinedButton(
                    onClick = { /* TODO: Handle create account */ },
                    colors = ButtonDefaults.outlinedButtonColors(contentColor = colorResource(id = R.color.nudge_blue)),
                    shape = RectangleShape,
                    border = BorderStroke(2.dp, colorResource(id = R.color.nudge_blue)),
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(text = "Create Account", fontFamily = GeorgeRounded)
                }
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp)
                        .clickable { /* TODO: Handle Google login */ },
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.google_sign),
                        contentDescription = "Sign in with Google",
                        modifier = Modifier
                            .height(48.dp)
                            .fillMaxWidth()
                    )
                }



            }
        }

    }

}
