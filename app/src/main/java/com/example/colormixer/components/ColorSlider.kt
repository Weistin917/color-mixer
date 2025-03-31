package com.example.colormixer.components

import androidx.compose.runtime.*
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun ColorSlider(
    color:String,
    rgbValue: Int,
    value:Float,
    onSliderChange: (Float) -> Unit
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(text = color, style = MaterialTheme.typography.bodyLarge)
        Text(text = rgbValue.toString(), style = MaterialTheme.typography.bodyLarge)
    }
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        Slider(
            value = value,
            onValueChange = {onSliderChange(it)}
        )
    }
}