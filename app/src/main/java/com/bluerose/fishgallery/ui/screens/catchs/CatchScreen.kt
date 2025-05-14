package com.bluerose.fishgallery.ui.screens.catchs

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.bluerose.fishgallery.ui.screens.catchs.models.CatchEvent
import com.bluerose.fishgallery.ui.screens.catchs.views.CatchViewDisplay

@Composable
fun CatchScreen(
    navController: NavController
){
    CatchViewDisplay(
        navController = navController,
        dispatcher = {CatchEvent.CloseScreen}
    )
}