package com.musicapplication.musicapp.navigation

sealed class Screen (val route: String){
    data object Home : Screen("home")
    data object Genre: Screen("genre")
    data object Profile: Screen("profile")
    data object DetailArtis: Screen("detail_artis")
}