package com.bluerose.fishgallery.ui.theme.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bluerose.fishgallery.ui.theme.OnPrimaryColor
import com.bluerose.fishgallery.ui.utilis.dashedBorder

@Composable
fun JetIconButton(
    vectorDrawableId: Int, //идентификатор векторного изображения, которое отобразит UI-компонент (например, рыбку)
    modifier: Modifier = Modifier, //для персонализации UI-компонента (например, определение размера)
    shape: RoundedCornerShape, //для персонализации UI-компонента (например, определение размера)
    contentPadding: PaddingValues = PaddingValues(12.dp), //для задания внутренних отступов
    onClick: () -> Unit
){
    Box(
        modifier = modifier
            .size(48.dp)
            .clickable(onClick = onClick)
            .clip(shape = shape)
            .dashedBorder(
                width = 2.dp,
                color = OnPrimaryColor,
                shape = shape,
                on = 7.dp,
                off = 7.dp)
            .padding(contentPadding),
        contentAlignment = Alignment.Center
    ){
        Icon(
            modifier = modifier.size(24.dp),
            imageVector = ImageVector.vectorResource(vectorDrawableId),
            contentDescription = "",
            tint = OnPrimaryColor
        )
    }
}

@Preview
@Composable
fun Previewq(){
    JetIconButton(
        vectorDrawableId = com.microsoft.fluent.mobile.icons.R.drawable.ic_fluent_chevron_left_16_filled,
        shape = RoundedCornerShape(topEnd = 8.dp, topStart = 8.dp, bottomStart = 8.dp, bottomEnd = 8.dp),
        contentPadding = PaddingValues(2.dp),
        onClick = {}
    )
}