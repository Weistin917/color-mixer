// Color Slider
package com.example.colormixer.components

import androidx.compose.runtime.*
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

/*
 * Params:
 * color: index for the color name list
 * rgbValue: the value of the color in the range [0, 255]
 * value: tha value of the color in the range [0, 1]
 * onSliderChange: function to be called upon when the slider changes
 * */
@Composable
fun ColorSlider(
    color:Int,
    rgbValue: Int,
    value:Float,
    onSliderChange: (Float) -> Unit
) {
    val colorNames = listOf("Red", "Green", "Blue")
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        // Labels for the color's name and value in range [0, 255]
        Text(text = colorNames[color], style = MaterialTheme.typography.bodyLarge)
        Text(text = rgbValue.toString(), style = MaterialTheme.typography.bodyLarge)
    }
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        Slider(
            value = value,
            onValueChange = {onSliderChange(it)},
            // Adjust the slider's colors according to the corresponding color and the value it has.
            colors = SliderDefaults.colors(
                thumbColor = Color(
                    red = if (color == 0) value else 0f,
                    green = if (color == 1) value else 0f,
                    blue = if (color == 2) value else 0f
                ),
                activeTrackColor = Color(
                    red = if (color == 0) value else 0f,
                    green = if (color == 1) value else 0f,
                    blue = if (color == 2) value else 0f
                ),
                inactiveTrackColor = MaterialTheme.colorScheme.secondaryContainer
            )
        )
    }
}