package com.example.androiddevchallenge.ui.screens.first

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow

class FirstViewModel : ViewModel() {

    val stateFlow = MutableStateFlow(FirstViewState())

}