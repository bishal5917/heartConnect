package com.example.heartconnect.navigation

import javax.annotation.meta.When

enum class AllScreen {
    SplashScreen, LoginScreen, RegisterScreen, MainScreen, HomeScreen, ChatScreen, ProfileScreen,
    MessageScreen;

    companion object {
        fun fromRoute(route: String?): AllScreen = when (route?.substringBefore("/")) {
            SplashScreen.name -> SplashScreen
            LoginScreen.name -> LoginScreen
            RegisterScreen.name -> RegisterScreen
            MainScreen.name -> MainScreen
            HomeScreen.name -> HomeScreen
            ChatScreen.name -> ChatScreen
            ProfileScreen.name -> ProfileScreen
            MessageScreen.name -> MessageScreen
            null -> LoginScreen
            else -> throw IllegalArgumentException("Invalid Route")
        }
    }
}