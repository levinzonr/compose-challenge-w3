package com.example.androiddevchallenge.ui.navigation

import androidx.navigation.NavHostController
import androidx.navigation.compose.navigate

object Destinations {
    const val Login = "login"
    const val Goals = "goals"
    const val TasksDetails = "tasks"
}

class Router(private val navHostController: NavHostController) {
    fun showLogin() { navHostController.navigate(Destinations.Login) }
    fun showSecond() { navHostController.navigate(Destinations.Goals) }
    fun navigateBack() { navHostController.popBackStack() }
    fun showTaskDetails() { navHostController.navigate(Destinations.TasksDetails) }
}