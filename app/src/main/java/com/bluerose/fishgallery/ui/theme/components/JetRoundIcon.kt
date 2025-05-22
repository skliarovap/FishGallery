package com.bluerose.fishgallery.ui.theme.components

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.bluerose.fishgallery.R
import com.bluerose.fishgallery.ui.theme.OnPrimaryColor

@Composable
fun JetRoundIcon(
    vectorDrawableId: Int, // идентификатор векторного изображения
    modifier: Modifier = Modifier,
    iconSize:Dp = 100.dp,
) {
    Box(
        modifier = modifier
            .clip(CircleShape)
            .clickable{}
            .size(iconSize)
            .border(width = 2.dp, color = OnPrimaryColor, shape = CircleShape),
        Alignment.Center
    ){
        Icon(
            imageVector = ImageVector.vectorResource(vectorDrawableId),
            contentDescription = "",
            tint = OnPrimaryColor
        )
    }
}

@Preview(showBackground = false)
@Composable
fun Previewa(){
    JetRoundIcon(
        vectorDrawableId = R.drawable.blueroselogotipe,
        modifier = Modifier
    )
}
