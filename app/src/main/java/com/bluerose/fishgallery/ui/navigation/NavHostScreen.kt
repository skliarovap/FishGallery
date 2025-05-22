package com.bluerose.fishgallery.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.bluerose.fishgallery.domain.navigation.NavScreen
import com.bluerose.fishgallery.ui.screens.catchs.views.CatchViewDisplay
import com.bluerose.fishgallery.ui.screens.statistics.views.StatisticsViewDisplay

@Composable
fun NavHostScreen() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = NavScreen.Statistics,

        builder = {
            composable<NavScreen.Statistics> {
                StatisticsViewDisplay(
                    navController = navController,
                    dispatcher = { navController.navigate(NavScreen.Catch) }
                )
            }

            composable<NavScreen.Catch> {
                CatchViewDisplay(
                    navController = navController,
                    dispatcher = { navController.navigateUp() }
                )
            }

        }
    )
}