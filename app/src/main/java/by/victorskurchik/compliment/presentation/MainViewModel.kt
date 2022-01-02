package by.victorskurchik.compliment.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import timber.log.Timber
import kotlin.random.Random

class MainViewModel : ViewModel() {

    private val _compliment = MutableStateFlow("Initial compliment")
    val compliment: StateFlow<String>
        get() = _compliment

    fun onMainViewClicked() {
        viewModelScope.launch {
            Timber.d("Main view clicked")
            _compliment.value = Random.nextInt().toString()
        }
    }
}