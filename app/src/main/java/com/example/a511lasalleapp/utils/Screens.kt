package com.example.a511lasalleapp.utils

sealed class Screens(val route: String) {
    object Home : Screens(route = "home")
    object Grades : Screens(route = "grades")
    object Calendar : Screens(route = "calendar")
    object Settings : Screens(route = "settings")
    object NewsDetail : Screens(route = "news-detail")
    object Payments : Screens(route = "payments")
}
