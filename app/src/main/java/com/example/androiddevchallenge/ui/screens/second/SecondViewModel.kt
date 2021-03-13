package com.example.androiddevchallenge.ui.screens.second

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow

class SecondViewModel : ViewModel() {

    val stateFlow = MutableStateFlow(SecondViewState())

}