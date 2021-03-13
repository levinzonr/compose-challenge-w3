package com.example.androiddevchallenge.ui.navigation

import androidx.navigation.NavHostController
import androidx.navigation.compose.navigate

object Destinations {
    const val Tasks = "tasks"
    const val Goals = "goals"
    const val TasksDetails = "tasks"
}

class Router(private val navHostController: NavHostController) {
    fun showTasks() { navHostController.navigate(Destinations.Tasks) }
    fun showSecond() { navHostController.navigate(Destinations.Goals) }
    fun navigateBack() { navHostController.popBackStack() }
    fun showTaskDetails() { navHostController.navigate(Destinations.TasksDetails) }
}