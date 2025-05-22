package com.bluerose.fishgallery.ui.theme.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.bluerose.fishgallery.ui.utilis.advancedShadow

@Composable
fun JetRoundImage(
    imagePath: String,
    modifier: Modifier = Modifier)
{
    AsyncImage(
        model = imagePath,
        contentDescription = "",
        modifier = modifier
            .size(360.dp, 160.dp)
            .clip(RoundedCornerShape(32.dp))
            .border(3.dp, Color.White, RoundedCornerShape(32.dp))
            .advancedShadow(Color.Black, alpha = 0.15f, 32.dp, 4.dp, 4.dp)

    )
}

@Preview
@Composable
fun Pree(){
    JetRoundImage(
        imagePath = "file:///android_asset/App1_Image1.jpg"
    )
}