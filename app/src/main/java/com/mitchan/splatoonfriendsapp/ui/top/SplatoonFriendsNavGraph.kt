package com.mitchan.splatoonfriendsapp.ui.top

sealed class SplatoonFriendsNavGraph(val destination: String) {
    object WelcomeScreen: SplatoonFriendsNavGraph("welcome")
    object TopScreen: SplatoonFriendsNavGraph("top")
}
