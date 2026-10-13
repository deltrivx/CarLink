package net.easyconn.gwmec.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import net.easyconn.gwmec.CarlinkPalette

private fun color(value: Int) = Color(value)

private fun darkScheme(palette: CarlinkPalette) = darkColorScheme(
    primary = color(palette.accent),
    onPrimary = color(palette.onAccent),
    background = color(palette.background),
    onBackground = color(palette.primaryText),
    surface = color(palette.surface),
    onSurface = color(palette.primaryText),
    error = color(palette.danger),
)

private fun lightScheme(palette: CarlinkPalette) = lightColorScheme(
    primary = color(palette.accent),
    onPrimary = color(palette.onAccent),
    background = color(palette.background),
    onBackground = color(palette.primaryText),
    surface = color(palette.surface),
    onSurface = color(palette.primaryText),
    error = color(palette.danger),
)

@Composable
fun XcertplayTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val palette = CarlinkPalette.of(darkTheme)
    val colorScheme = if (darkTheme) darkScheme(palette) else lightScheme(palette)

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}
