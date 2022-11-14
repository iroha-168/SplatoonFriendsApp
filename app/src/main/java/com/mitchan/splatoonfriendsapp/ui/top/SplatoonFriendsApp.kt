package com.mitchan.splatoonfriendsapp.ui.top

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.mitchan.splatoonfriendsapp.ui.account.WelcomeScreen

@Composable
fun SplatoonFriendsApp() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = SplatoonFriendsNavGraph.TopScreen.destination) {
        composable(SplatoonFriendsNavGraph.TopScreen.destination) { TopScreen() }
        composable(SplatoonFriendsNavGraph.WelcomeScreen.destination) { WelcomeScreen() }
    }
}