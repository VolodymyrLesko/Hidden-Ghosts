package com.game.hiddenghosts

import androidx.annotation.DrawableRes

data class GhostCardModel(
    @DrawableRes
    var icon: Int = R.drawable.icon_ghost_wrong,
    var isVisible: Boolean = false,
    var isSelected: Boolean = false,
    var isRight: Boolean = false,
)