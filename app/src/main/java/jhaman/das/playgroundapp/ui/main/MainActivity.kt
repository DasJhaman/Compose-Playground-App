package jhaman.das.playgroundapp.ui.main

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import jhaman.das.playgroundapp.ui.main.MainComposable
import jhaman.das.playgroundapp.ui.theme.PlaygroundAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PlaygroundAppTheme {
                MainComposable()
            }
        }
    }
}