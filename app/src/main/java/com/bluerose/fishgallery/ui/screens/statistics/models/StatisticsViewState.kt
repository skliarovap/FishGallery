package com.bluerose.fishgallery.ui.screens.statistics.models

sealed class StatisticsViewState {
    data object Loading : StatisticsViewState()
    data class Error(
        val icon: Int,
        val description: String
    ) : StatisticsViewState()
    data class Display(
        val ourCatch: String,
        val ourProfit: String,
        val ourPartners: String
    ) : StatisticsViewState()
}