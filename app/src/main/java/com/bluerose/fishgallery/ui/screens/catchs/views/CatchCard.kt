package com.bluerose.fishgallery.ui.screens.catchs.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bluerose.fishgallery.ui.theme.OnPrimaryColor
import com.bluerose.fishgallery.ui.theme.PrimaryColor
import com.bluerose.fishgallery.ui.theme.Typography
import com.bluerose.fishgallery.ui.theme.components.JetRoundImage

@Composable
fun CatchCard(
    label: String, //заголовок для карточки
    text: String, //основной текст для карточки;
    imagePath: String, //путь к изображению для карточки;
    modifier: Modifier = Modifier, //для персонализации UI-компонента (например, определение размера).
) {
    Column(
        modifier = Modifier
            .background(PrimaryColor)
            .size(width = 366.dp, height = 165.dp)
    ) {
        JetRoundImage(
            imagePath = imagePath,
            modifier = Modifier
                .size(width = 366.dp, height = 136.dp)
        )

        Spacer(modifier = Modifier.size(10.dp))

        Row(
            modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center

        ) {
            Text(
                modifier = modifier.size(width = 173.dp, height = 19.dp),
                text = label,
                fontSize = 17.sp,
                style = Typography.bodySmall,
                color = OnPrimaryColor
                )

            Text(
                modifier = modifier.size(width = 173.dp, height = 19.dp),
                text = text,
                fontSize = 15.sp,
                style = Typography.labelSmall,
                color = OnPrimaryColor,
                textAlign = TextAlign.End
            )
        }
    }

}

@Preview
@Composable
fun Prewiee() {
    CatchCard(
        label = "Призрачный дельфи",
        text = "50 000 000 тонн",
        imagePath = "file:///android_asset/App1_Image1.jpg",
    )
}