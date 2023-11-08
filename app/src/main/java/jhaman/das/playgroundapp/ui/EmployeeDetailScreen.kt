package jhaman.das.playgroundapp.ui

import androidx.compose.foundation.clickable
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun EmployeeDetailScreen(onClick: () -> Unit){
    Text(text = "I am main employee", color = Color.Black, modifier = Modifier.clickable { onClick() })
}