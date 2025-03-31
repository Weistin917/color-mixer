package com.example.colormixer.components

import androidx.compose.runtime.*
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun ColorSlider() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(text = "Color", style = MaterialTheme.typography.bodyLarge)
        Text(text = "#Value", style = MaterialTheme.typography.bodyLarge)
    }
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        Slider(
            value = 0f,
            onValueChange = {}
        )
    }
}