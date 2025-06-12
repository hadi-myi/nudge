package com.example.nudge

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
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

// Custom font variable
val GeorgeRounded = FontFamily(Font(R.font.georgerounded))

@Composable
fun LoginScreen() {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

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
        ) {
            OutlinedTextField(
                value = email,
                onValueChange = { email = it },
                label = { Text("Email Address") },
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(16.dp))

            OutlinedTextField(
                value = password,
                onValueChange = { password = it },
                label = { Text("Password") },
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(24.dp))

            Button(
                onClick = { /* TODO: Handle login */ },
                colors = ButtonDefaults.buttonColors(containerColor = colorResource(id = R.color.nudge_blue)),
                shape = RectangleShape,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = "Login", color = colorResource(id = android.R.color.white), fontFamily = GeorgeRounded)
            }

            Spacer(modifier = Modifier.height(12.dp))

            OutlinedButton(
                onClick = { /* TODO: Handle skip */ },
                colors = ButtonDefaults.outlinedButtonColors(contentColor = colorResource(id = R.color.nudge_blue)),
                shape = RectangleShape,
                border = BorderStroke(2.dp, colorResource(id = R.color.nudge_blue)),
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = "Skip Login", fontFamily = GeorgeRounded)
            }


        }
    }
}
