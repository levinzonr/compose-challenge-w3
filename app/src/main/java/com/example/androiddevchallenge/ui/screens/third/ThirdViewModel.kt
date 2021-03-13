package com.example.androiddevchallenge.ui.screens.third

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow

class ThirdViewModel : ViewModel() {

    val stateFlow = MutableStateFlow(SecondViewState())

}