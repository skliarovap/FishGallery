package com.bluerose.fishgallery.domain.navigation

import kotlinx.serialization.Serializable


@Serializable
sealed class NavScreen {
    @Serializable data object Statistics : NavScreen()
    @Serializable data object Catch : NavScreen()
    @Serializable data class Page(val id: Int) : NavScreen()
}
