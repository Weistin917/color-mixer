package com.example.colormixer

import android.os.Bundle
import androidx.activity.*
import androidx.compose.runtime.*
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview
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
        Row (
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                Icons.Filled.Favorite,
                "Title icon",
                tint = Color.Magenta
            )
            Text(text = "Color Mixer", style = MaterialTheme.typography.headlineMedium)
            Icon(
                Icons.Filled.Favorite,
                "Title icon",
                tint = Color.Magenta
            )
        }
        Spacer(modifier = Modifier.height(16.dp))

        ColorDisplay(1f, 0f, 1f)

        Spacer(modifier = Modifier.height(8.dp))
        // Red slider
        ColorSlider(
            color = "Red",
            rgbValue = 255,
            value = 1f,
            onSliderChange = {}
        )

        Spacer(modifier = Modifier.height(8.dp))
        // Green slider
        ColorSlider(
            color = "Green",
            rgbValue = 0,
            value = 0f,
            onSliderChange = {}
        )

        Spacer(modifier = Modifier.height(8.dp))
        // Blue slider
        ColorSlider(
            color = "Blue",
            rgbValue = 255,
            value = 1f,
            onSliderChange = {}
        )

    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ColorMixerAppTheme {
        ColorMixerScreen()
    }
}