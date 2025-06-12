package com.example.nudge

import androidx.compose.foundation.Image
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource

// creating a login screen
@Composable
fun LoginScreen(){
    Image(
        painter = painterResource(id = R.drawable.simplenudgelogo),
        contentDescription = "login"
    )
}