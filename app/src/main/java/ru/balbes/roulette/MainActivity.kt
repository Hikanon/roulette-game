package ru.balbes.roulette

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import ru.balbes.roulette.rule.screen.RuleScreen
import ru.balbes.roulette.ui.theme.GreenBG
import ru.balbes.roulette.ui.theme.RouletteTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RouletteTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = GreenBG
                ) {
                    RuleScreen()
                }
            }
        }
    }
}
