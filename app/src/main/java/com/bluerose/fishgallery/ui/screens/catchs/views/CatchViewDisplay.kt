package com.bluerose.fishgallery.ui.screens.catchs.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.bluerose.fishgallery.ui.screens.catchs.models.CatchEvent
import com.bluerose.fishgallery.ui.theme.OnPrimaryColor
import com.bluerose.fishgallery.ui.theme.PrimaryColor
import com.bluerose.fishgallery.ui.theme.components.JetIconButton
import com.microsoft.fluent.mobile.icons.R

@Composable
fun CatchViewDisplay(
    navController: NavController,
    //viewState: CatchViewState,
    dispatcher: (CatchEvent) -> Unit
) {
    val scrollState = rememberScrollState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(PrimaryColor)
            .verticalScroll(scrollState)
            .padding(24.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,

            ) {
            JetIconButton(
                vectorDrawableId = R.drawable.ic_fluent_chevron_left_16_filled,
                shape = RoundedCornerShape(
                    topEnd = 8.dp,
                    topStart = 8.dp,
                    bottomStart = 8.dp,
                    bottomEnd = 8.dp
                ),
                contentPadding = PaddingValues(2.dp),
                onClick = {dispatcher.invoke(CatchEvent.CloseScreen)}
            )
            Row(
                modifier = Modifier
                    .padding(end = 48.dp)
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
            ) {
                Text(
                    text = "Наш улов",
                    fontSize = 24.sp,
                    color = OnPrimaryColor
                )
            }
        }

        Spacer(modifier = Modifier.size(24.dp))

        Column(
            verticalArrangement = Arrangement.spacedBy(24.dp)
        ) {
            CatchCard(
                label = "Призрачный дельфи",
                text = "50 000 000 тонн",
                imagePath = "file:///android_asset/App1_Image1.jpg"
            )

            CatchCard(
                label = "Алмазный ус",
                text = "548 000 000 тонн",
                imagePath = "file:///android_asset/App1_Image2.jpg"
            )

            CatchCard(
                label = "Шестиперая аку",
                text = "10 000 000 тонн",
                imagePath = "file:///android_asset/App1_Image3.jpg"
            )
        }


    }
}

//@Preview
//@Composable
//fun Prewieeq() {
//    CatchViewDisplay(
//        viewState = TODO(),
//        dispatcher = TODO()
//    )
//}