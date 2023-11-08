package jhaman.das.playgroundapp.ui.navigation

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import jhaman.das.playgroundapp.ui.EmployeeDetailScreen
import jhaman.das.playgroundapp.ui.main.MainScreen
import jhaman.das.playgroundapp.ui.navigation.ScreenRoutes.EmployeeDetail
import jhaman.das.playgroundapp.ui.navigation.ScreenRoutes.MainScreen

fun NavGraphBuilder.mainScreen(onClick: () -> Unit) {
    composable(route = MainScreen) {
        MainScreen(onClick = onClick)
    }
}

fun NavGraphBuilder.employeeDetailScreen() {
    composable(route = EmployeeDetail) {
        EmployeeDetailScreen(onClick = {})
    }
}