package com.ranggoo.janmangruffy.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ranggoo.janmangruffy.domain.GetCurrentScheduleUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val getCurrentScheduleUseCase: GetCurrentScheduleUseCase
) : ViewModel() {

    fun getCurrentSchedule(){
        viewModelScope.launch {
            val data = getCurrentScheduleUseCase("US","2014-12-01")
            Log.d("Test","$data")
        }
    }
}