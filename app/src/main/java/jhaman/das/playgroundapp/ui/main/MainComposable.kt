package jhaman.das.playgroundapp.ui.main

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import jhaman.das.playgroundapp.ui.navigation.MainNavGraph

@Composable
fun MainComposable(
    navController: NavHostController = rememberNavController(),
) {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        contentColor = MaterialTheme.colorScheme.background,
        containerColor = MaterialTheme.colorScheme.background,
        content = { paddingValues ->
            Column(modifier = Modifier.padding(paddingValues)) {
                MainNavGraph(
                    navController = navController
                )
            }
        },
    )
}