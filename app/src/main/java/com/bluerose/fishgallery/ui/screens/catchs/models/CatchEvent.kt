package com.bluerose.fishgallery.ui.screens.catchs.models

sealed class CatchEvent {
    data object EnterScreen : CatchEvent()
    data object ReloadScreen : CatchEvent()
    data object CloseScreen : CatchEvent()
}