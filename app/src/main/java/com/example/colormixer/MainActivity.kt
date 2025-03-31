// Main Activity
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
                ColorMixerScreen()
            }
        }
    }
}

// App Screen
@Composable
fun ColorMixerScreen() {
    // States: the values of the RGB colors
    var red by remember { mutableFloatStateOf(0f) }
    var green by remember { mutableFloatStateOf(0f) }
    var blue by remember { mutableFloatStateOf(0f) }

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
                tint = Color(red, green, blue)
            )
            Text(text = "Color Mixer", style = MaterialTheme.typography.headlineMedium)
            Icon(
                Icons.Filled.Favorite,
                "Title icon",
                tint = Color(red, green, blue)
            )
        }
        Spacer(modifier = Modifier.height(16.dp))

        // Display box of the mixed color: receives the three color states
        ColorDisplay(red, green, blue)

        Spacer(modifier = Modifier.height(8.dp))
        // Red slider
        ColorSlider(
            color = 0,
            rgbValue = (red * 255).toInt(),
            value = red,
            onSliderChange = { value -> red = value }
        )

        Spacer(modifier = Modifier.height(8.dp))
        // Green slider
        ColorSlider(
            color = 1,
            rgbValue = (green * 255).toInt(),
            value = green,
            onSliderChange = { value -> green = value }
        )

        Spacer(modifier = Modifier.height(8.dp))
        // Blue slider
        ColorSlider(
            color = 2,
            rgbValue = (blue * 255).toInt(),
            value = blue,
            onSliderChange = { value -> blue = value }
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