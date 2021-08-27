package com.example.dynamiccolorschecker.ui.theme

import androidx.annotation.ColorRes
import androidx.compose.ui.graphics.Color
import com.example.dynamiccolorschecker.R

val Purple200 = Color(0xFFBB86FC)
val Purple500 = Color(0xFF6200EE)
val Purple700 = Color(0xFF3700B3)
val Teal200 = Color(0xFF03DAC5)

data class ColorMap(val name: String, @ColorRes val res: Int)

val NEUTRAL1 = arrayListOf(
    ColorMap("neutral1_0", R.color.neutral1_0),
    ColorMap("neutral1_50", R.color.neutral1_50),
    ColorMap("neutral1_100", R.color.neutral1_100),
    ColorMap("neutral1_200", R.color.neutral1_200),
    ColorMap("neutral1_300", R.color.neutral1_300),
    ColorMap("neutral1_400", R.color.neutral1_400),
    ColorMap("neutral1_500", R.color.neutral1_500),
    ColorMap("neutral1_600", R.color.neutral1_600),
    ColorMap("neutral1_700", R.color.neutral1_700),
    ColorMap("neutral1_800", R.color.neutral1_800),
    ColorMap("neutral1_900", R.color.neutral1_900),
    ColorMap("neutral1_1000", R.color.neutral1_1000),
)

val NEUTRAL2 = arrayListOf(
    ColorMap("neutral2_0", R.color.neutral2_0),
    ColorMap("neutral2_50", R.color.neutral2_50),
    ColorMap("neutral2_100", R.color.neutral2_100),
    ColorMap("neutral2_200", R.color.neutral2_200),
    ColorMap("neutral2_300", R.color.neutral2_300),
    ColorMap("neutral2_400", R.color.neutral2_400),
    ColorMap("neutral2_500", R.color.neutral2_500),
    ColorMap("neutral2_600", R.color.neutral2_600),
    ColorMap("neutral2_700", R.color.neutral2_700),
    ColorMap("neutral2_800", R.color.neutral2_800),
    ColorMap("neutral2_900", R.color.neutral2_900),
    ColorMap("neutral2_1000", R.color.neutral2_1000),
)

val ACCENT1 = arrayListOf(
    ColorMap("accent1_0", R.color.accent1_0),
    ColorMap("accent1_50", R.color.accent1_50),
    ColorMap("accent1_100", R.color.accent1_100),
    ColorMap("accent1_200", R.color.accent1_200),
    ColorMap("accent1_300", R.color.accent1_300),
    ColorMap("accent1_400", R.color.accent1_400),
    ColorMap("accent1_500", R.color.accent1_500),
    ColorMap("accent1_600", R.color.accent1_600),
    ColorMap("accent1_700", R.color.accent1_700),
    ColorMap("accent1_800", R.color.accent1_800),
    ColorMap("accent1_900", R.color.accent1_900),
    ColorMap("accent1_1000", R.color.accent1_1000),
)

val ACCENT2 = arrayListOf(
    ColorMap("accent2_0", R.color.accent2_0),
    ColorMap("accent2_50", R.color.accent2_50),
    ColorMap("accent2_100", R.color.accent2_100),
    ColorMap("accent2_200", R.color.accent2_200),
    ColorMap("accent2_300", R.color.accent2_300),
    ColorMap("accent2_400", R.color.accent2_400),
    ColorMap("accent2_500", R.color.accent2_500),
    ColorMap("accent2_600", R.color.accent2_600),
    ColorMap("accent2_700", R.color.accent2_700),
    ColorMap("accent2_800", R.color.accent2_800),
    ColorMap("accent2_900", R.color.accent2_900),
    ColorMap("accent2_1000", R.color.accent2_1000),
)
