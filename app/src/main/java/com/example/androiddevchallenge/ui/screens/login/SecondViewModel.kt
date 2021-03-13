package com.example.androiddevchallenge.ui.screens.login

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow

class SecondViewModel : ViewModel() {

    val stateFlow = MutableStateFlow(SecondViewState())

}