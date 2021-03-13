package com.example.androiddevchallenge.ui.navigation

import androidx.navigation.NavHostController
import androidx.navigation.compose.navigate

object Destinations {
    const val Login = "login"
    const val Home = "home"
    const val Welcome = "welcome"
}

class Router(private val navHostController: NavHostController) {
    fun showLogin() { navHostController.navigate(Destinations.Login) }
    fun showWelcome() { navHostController.navigate(Destinations.Welcome) }
    fun showHome() { navHostController.navigate(Destinations.Home) }
    fun navigateBack() { navHostController.popBackStack() }
}