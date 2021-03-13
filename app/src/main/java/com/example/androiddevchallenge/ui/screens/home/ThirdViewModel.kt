package com.example.androiddevchallenge.ui.screens.home

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow

class ThirdViewModel : ViewModel() {

    val stateFlow = MutableStateFlow(SecondViewState())

}