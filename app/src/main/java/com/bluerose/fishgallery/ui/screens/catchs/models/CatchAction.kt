package com.bluerose.fishgallery.ui.screens.catchs.models

sealed class CatchAction {
    data class ShowDialog(
        val title: String,
        val subtitle: String,
        val textConfirmButton: String) : CatchAction()
}