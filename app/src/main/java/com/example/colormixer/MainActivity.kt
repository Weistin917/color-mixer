package com.example.colormixer

import android.os.Bundle
import androidx.activity.*
import androidx.compose.runtime.*
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.colormixer.ui.theme.ColorMixerAppTheme
import com.example.colormixer.components.*

class MainActivity :ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ColorMixerAppTheme {

            }
        }
    }
}

@Composable
fun ColorMixerScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment =Alignment.CenterHorizontally
    ) {
        Text(text = "Color Mixer", style = MaterialTheme.typography.headlineMedium)
        Spacer(modifier = Modifier.height(16.dp))

        ColorDisplay()

        Row () {
            Spacer(modifier = Modifier.height(8.dp))
            // Red slider
            ColorSlider()

            Spacer(modifier = Modifier.height(8.dp))
            // Green slider
            ColorSlider()

            Spacer(modifier = Modifier.height(8.dp))
            // Blue slider
            ColorSlider()
        }
    }
}