package com.example.learnconnect.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext

// Özel renk tanımları
private val CustomBlue = Color(0xff222d5a)
private val CustomWhite = Color(0xFFFFFFFF)

// Dark Mode Renk Paleti
private val DarkColorScheme = darkColorScheme(
    primary = CustomBlue,
    onPrimary = CustomWhite,
    secondary = BlueGrey80,
    tertiary = Cream80,
    background = Color(0xFF121212),
    onBackground = CustomWhite
)

// Light Mode Renk Paleti
private val LightColorScheme = lightColorScheme(
    primary = CustomBlue,
    onPrimary = CustomWhite,
    secondary = BlueGrey40,
    tertiary = Cream40,
    background = Color(0xFFFFFFFF),
    onBackground = Color(0xFF000000)
)

@Composable
fun LearnConnectTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }
        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}
