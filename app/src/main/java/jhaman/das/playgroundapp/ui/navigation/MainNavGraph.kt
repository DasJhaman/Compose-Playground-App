package jhaman.das.playgroundapp.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController

@Composable
fun MainNavGraph(
    navController: NavHostController = rememberNavController(),
) {
    NavHost(
        navController = navController,
        startDestination = ScreenRoutes.MainScreen
    ) {

        mainScreen(onClick = { navController.navigateToOtherScreen() })

        employeeDetailScreen()

    }
}