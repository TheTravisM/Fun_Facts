package io.travis.funfacts

import android.graphics.Color

class ColorWheel {
    // Fields or Member Variables - Properties about the object

    // Methods - Actions the object can take
    fun getColor(): Int {
        val colors = arrayOf(
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7"  // light gray
        )

        // Randomly select a fact
        val randomNumber = (0 until (colors.size)).random()
        val color = Color.parseColor(colors[randomNumber])
        return color

    }
}