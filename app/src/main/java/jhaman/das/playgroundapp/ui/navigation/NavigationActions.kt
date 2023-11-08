package jhaman.das.playgroundapp.ui.navigation

import androidx.navigation.NavController
import jhaman.das.playgroundapp.ui.navigation.ScreenRoutes.EmployeeDetail


fun NavController.navigateToOtherScreen() {
    this.navigate(EmployeeDetail)
}
