package com.mitchan.splatoonfriendsapp.ui.top

import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController

@Composable
fun TopScreen() {
    val navController = rememberNavController()
    Scaffold(bottomBar = {
        BottomNavigation {
            val navBackStackEntry by navController.currentBackStackEntryAsState()
            val currentDestination = navBackStackEntry?.destination
            TopScreenNavGraph.values().forEach { screen ->
                BottomNavigationItem(
                    icon = { Icon(painter = painterResource(id = screen.iconResId), contentDescription = null)},
                    label = { Text(text = stringResource(id = screen.labelResId))},
                    selected = currentDestination?.hierarchy?.any { it.route == screen.route } == true,
                    onClick = {
                        navController.navigate(screen.route) {
                            popUpTo(navController.graph.findStartDestination().id) {
                                saveState = true
                            }
                            launchSingleTop = true
                            restoreState = true
                        }
                    }
                )
            }
        }
    }) { innerPadding ->
        NavHost(navController, TopScreenNavGraph.HOME.route, Modifier.padding(innerPadding)) {
            composable(TopScreenNavGraph.HOME.route) {
                Text(text = "home")
            }
            composable(TopScreenNavGraph.VIDEO.route) { /* TODO: add VideosScreen */ }
            composable(TopScreenNavGraph.PROFILE.route) { /* TODO: add ProfileListScreen */ }
        }
    }
}