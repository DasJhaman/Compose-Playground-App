package jhaman.das.playgroundapp.ui.main

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import jhaman.das.playgroundapp.domain.GetUsersListUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class MainViewModel(private val getUsersListUseCase: GetUsersListUseCase) : ViewModel() {

    private val _uiData = MutableStateFlow(MainScreenUiData())
    val uiData = _uiData.asStateFlow()

    init {
        getUserData()
    }

    private fun getUserData() {
        viewModelScope.launch {
            getUsersListUseCase().collect {
                Log.e("Data", it.joinToString())
                _uiData.update { prev ->
                    prev.copy(userList = it)
                }
            }
        }
    }
}