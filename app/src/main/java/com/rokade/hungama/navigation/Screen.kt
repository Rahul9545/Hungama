package com.rokade.hungama.navigation

sealed class Screen(val route: String) {
    object Splash : Screen("Splash_Screen")
    object Login : Screen("Login_Screen")
}