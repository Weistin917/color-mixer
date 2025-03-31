package com.example.colormixer.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.runtime.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.colormixer.R

@Composable
fun ColorDisplay() {
    Box (
        modifier = Modifier
            .size(250.dp)
            .clip(shape = RoundedCornerShape(20.dp))
            .background(Color.Magenta)
    ) {
        Image(
            painter = painterResource(id = R.drawable.snoopy),
            contentDescription = null
        )
    }
}