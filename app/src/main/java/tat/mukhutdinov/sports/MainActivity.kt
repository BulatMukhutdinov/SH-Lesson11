package tat.mukhutdinov.sports

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Surface
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass
import androidx.compose.ui.platform.LocalLayoutDirection
import tat.mukhutdinov.sports.ui.SportsApp
import tat.mukhutdinov.sports.ui.theme.SportsTheme

/**
 * Activity for Sports app
 */
@OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)
        setContent {
            SportsTheme {
                val layoutDirection = LocalLayoutDirection.current

                Surface {
                    val windowSize = calculateWindowSizeClass(this)
                    SportsApp(
                        windowSize = windowSize.widthSizeClass,
                    )
                }
            }
        }
    }
}
