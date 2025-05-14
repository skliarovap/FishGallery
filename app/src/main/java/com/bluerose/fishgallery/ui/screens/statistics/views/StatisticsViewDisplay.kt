package com.bluerose.fishgallery.ui.screens.statistics.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.bluerose.fishgallery.R
import com.bluerose.fishgallery.ui.screens.statistics.models.StatisticsEvent
import com.bluerose.fishgallery.ui.theme.OnPrimaryColor
import com.bluerose.fishgallery.ui.theme.PrimaryColor
import com.bluerose.fishgallery.ui.theme.Typography
import com.bluerose.fishgallery.ui.theme.components.JetRoundIcon

@Composable
fun StatisticsViewDisplay(
    //viewState: StatisticsViewState,
    navController: NavController,
    dispatcher: (StatisticsEvent) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = PrimaryColor)
            .padding(16.dp)
    ) {
        Column(
            modifier = Modifier.padding(start = 8.dp, top = 16.dp, end = 8.dp)
        ) {
            Row(
                verticalAlignment = Alignment.Bottom
            ) {
                Text(
                    modifier = Modifier.padding(bottom = 2.dp),
                    text = "Компания ",
                    fontSize = 24.sp,
                    style = Typography.labelSmall,
                    color = OnPrimaryColor
                )
                Text(
                    text = "“Blue Rose”",
                    fontSize = 32.sp,
                    style = Typography.labelSmall,
                    color = OnPrimaryColor
                )
            }

            Spacer(modifier = Modifier.height(32.dp))

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(24.dp)
            ) {
                StatisticsCard(
                    label = stringResource(R.string.our_catch_title),
                    text = "~ 108 000 000",
                    major = "тонн",
                    shape = RoundedCornerShape(topStart = 16.dp, topEnd = 32.dp, bottomEnd = 16.dp),
                    onClick = { dispatcher.invoke(StatisticsEvent.OpenCatchScreen) },
                    isClickable = true,
                )

                StatisticsCard(
                    label = stringResource(R.string.our_profit_title),
                    text = "> 5 400 000",
                    major = "кредитов",
                    shape = RoundedCornerShape(topStart = 16.dp, topEnd = 32.dp, bottomEnd = 16.dp),
                    onClick = { dispatcher.invoke(StatisticsEvent.OpenCatchScreen) },
                    isClickable = true
                )

                StatisticsCard(
                    label = stringResource(R.string.our_partners_title),
                    text = "1 500+",
                    major = "партнеров",
                    modifier = Modifier.height(160.dp),
                    shape = RoundedCornerShape(topStart = 16.dp, topEnd = 32.dp, bottomEnd = 16.dp),
                    onClick = {},
                    isClickable = false
                )
            }
        }

        Spacer(modifier = Modifier.weight(1f))

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.Bottom,
            horizontalArrangement = Arrangement.End
        ) {
            Text(
                modifier = Modifier.align(Alignment.CenterVertically),
                text = "С заботой, Blue Rose",
                fontSize = 24.sp,
                textAlign = TextAlign.Center,
                color = OnPrimaryColor,
                style = Typography.labelSmall
            )

            Spacer(modifier = Modifier.width(16.dp))

            JetRoundIcon(
                vectorDrawableId = R.drawable.blueroselogotipe,
                iconSize = 60.dp
            )
        }
    }
}

/*
@Preview
@Composable
fun Prewieqq() {
    StatisticsViewDisplay(
        viewState = TODO(),
        navController =,
        dispatcher = TODO(),
    )
}
 */