package com.bluerose.fishgallery.ui.screens.statistics.models

sealed class StatisticsAction {
    data class ShowDialog(
        val title: String,
        val subtitle: String,
        val textConfirmButton: String
    ) : StatisticsAction()
}