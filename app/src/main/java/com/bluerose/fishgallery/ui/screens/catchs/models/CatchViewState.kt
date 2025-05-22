package com.bluerose.fishgallery.ui.screens.catchs.models

sealed class CatchViewState {
    data object Loading: CatchViewState()
    data class Error(
        val icon:Int,
        val description:String
    ): CatchViewState()
    data class Display(
        val listOfCatch: List<String>
    ): CatchViewState()
}