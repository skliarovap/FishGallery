package com.bluerose.fishgallery.ui.screens.statistics.models

sealed class StatisticsEvent {
    data object ReloadScreen : StatisticsEvent()
    data object OpenCatchScreen : StatisticsEvent()
}