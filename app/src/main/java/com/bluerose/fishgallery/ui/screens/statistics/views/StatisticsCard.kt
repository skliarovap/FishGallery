package com.bluerose.fishgallery.ui.screens.statistics.views

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bluerose.fishgallery.ui.theme.OnSecondaryColor
import com.bluerose.fishgallery.ui.theme.OnSurfaceColor
import com.bluerose.fishgallery.ui.theme.SurfaceColor
import com.bluerose.fishgallery.ui.theme.Typography
import com.bluerose.fishgallery.ui.utilis.dashedBorder

@SuppressLint("InvalidColorHexValue")
@Composable
fun StatisticsCard(
    label: String, //заголовок для карточки
    text: String, //основной текст для карточки
    major: String,
    modifier: Modifier = Modifier, //для персонализации UI-компонента (например, определение размера)
    shape: RoundedCornerShape,
    onClick: () -> Unit,
    isClickable: Boolean
){
    val customModifier = if (isClickable) modifier.clickable { onClick.invoke() } else modifier

    Column(
        modifier = customModifier
            .size(width = 366.dp, height = 128.dp)
            .background(color = SurfaceColor, shape = shape)
            .dashedBorder(
                3.dp,
                color = Color.Black.copy(0.2f),
                shape = shape,
                on = 11.dp,
                off = 10.dp
            )
            .clip(shape)
            .padding(start = 20.dp)
    ){
        Spacer(modifier=Modifier.size(24.dp))

        Text(
            style = Typography.bodySmall,
            color = Color(0xFFACACAC),
            text = label,
            fontSize = 20.sp
        )

        Row (
            modifier = Modifier.padding(top = 17.dp),
            verticalAlignment = Alignment.Bottom

        ) {
            Text(
                style = Typography.bodyLarge,
                color = OnSecondaryColor,
                text = text,
                fontSize = 32.sp
            )

            Text(
                modifier = Modifier.padding(bottom = 2.dp),
                style = Typography.bodyLarge,
                color = OnSurfaceColor,
                text = " $major",
                fontSize = 24.sp
            )
        }
    }
}

@Preview
@Composable
fun Prewiea(){
    StatisticsCard(
        label = "Наш улов",
        text = "1500+ ",
        major = "партнеров",
        modifier = Modifier.height(160.dp),
        shape = RoundedCornerShape (topStart = 16.dp, topEnd = 32.dp, bottomEnd = 16.dp),
        onClick = { println("Clickable") },
        isClickable = true
    )
}