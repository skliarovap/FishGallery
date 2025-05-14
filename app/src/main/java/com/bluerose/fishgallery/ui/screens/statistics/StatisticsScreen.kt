package com.bluerose.fishgallery.ui.screens.statistics

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.navigation.NavController
import com.bluerose.fishgallery.ui.screens.statistics.models.StatisticsAction
import com.bluerose.fishgallery.ui.screens.statistics.models.StatisticsEvent
import com.bluerose.fishgallery.ui.screens.statistics.views.StatisticsViewDisplay
import com.bluerose.fishgallery.ui.theme.components.JetDialog

@Composable
fun StatisticsScreen(
    navController: NavController
) {
    val viewAction = remember { mutableStateOf<StatisticsAction?>(null) }

    when (val action = viewAction.value) {
        is StatisticsAction.ShowDialog -> {
            JetDialog { }
        }

        else -> {

        }
    }

    StatisticsViewDisplay(
        navController = navController,
        dispatcher = {StatisticsEvent.OpenCatchScreen}
    )
}