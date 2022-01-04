package by.victorskurchik.compliment.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import by.victorskurchik.compliment.domain.usecases.GetComplimentUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import timber.log.Timber
import javax.inject.Inject

class MainViewModel @Inject constructor(
    private val getComplimentUseCase: GetComplimentUseCase
) : ViewModel() {

    private val _compliment = MutableStateFlow("Initial compliment")
    val compliment: StateFlow<String>
        get() = _compliment

    fun onMainViewClicked() {
        viewModelScope.launch {
            Timber.d("Main view clicked")
            val nextCompliment = getComplimentUseCase()
            _compliment.value = nextCompliment.message
        }
    }
}