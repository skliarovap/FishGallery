package com.bluerose.fishgallery.ui.theme.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bluerose.fishgallery.ui.theme.OnPrimaryColor
import com.bluerose.fishgallery.ui.theme.OnSurfaceColor
import com.bluerose.fishgallery.ui.theme.Shapes
import com.bluerose.fishgallery.ui.theme.Typography
import com.bluerose.fishgallery.ui.utilis.advancedShadow

@Composable
fun JetDialog(
    title: String = "Наши контакты", //шаблонное значение "Наши контакты"
    body: String = "E-mail: blue-rose@our.galaxy\nАдресат: Джонни Сильверхэд", //шаблонное значение "E-mail ..."
    buttonText: String = "ОК", //шаблонное значение "ОК"
    onClose: () -> Unit
) {
    Column(
        modifier = Modifier
            .height(149.dp)
            .advancedShadow(Color.Black, alpha = 0.1f, 24.dp, 4.dp, 4.dp)
            .clip(RoundedCornerShape(topStart = 64.dp, topEnd = 64.dp, bottomStart = 24.dp, bottomEnd = 24.dp))
            .background(Color.White)
            .padding(top = 19.dp)
    ) {
        Text(
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            text = title,
            color = OnPrimaryColor,
            style = Typography.bodyLarge,
            fontSize = 16.sp
        )

        Spacer(modifier = Modifier.height(2.dp))

        Divider(
            modifier = Modifier
                .width(123.dp)
                .align(Alignment.CenterHorizontally),
            color = OnSurfaceColor,
            thickness = 1.dp
        )

        Spacer(modifier = Modifier.height(9.dp))

        Text(
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            text = body,
            color = OnPrimaryColor,
            style = Typography.bodyMedium,
            fontSize = 14.sp,
            lineHeight = 14.sp
        )

        Spacer(modifier = Modifier.weight(1f))

        Button(
            onClick = onClose,
            colors = ButtonDefaults.buttonColors(
                containerColor = OnPrimaryColor,
                contentColor = Color.White),
            shape = Shapes.small,
            modifier = Modifier
                .fillMaxWidth()
                .height(48.dp)
        ) {
            Text(
                textAlign = TextAlign.Center,
                text = buttonText,
                style = Typography.bodyLarge,
                fontSize = 16.sp
            )
        }
    }
}

@Preview
@Composable
fun JetDialogPreview() {
    JetDialog(
        onClose = {}
    )
}