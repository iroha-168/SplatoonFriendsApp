package com.mitchan.splatoonfriendsapp.ui.top

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.mitchan.splatoonfriendsapp.R

enum class TopScreenNavGraph(val route: String, @StringRes val labelResId: Int, @DrawableRes val iconResId: Int ) {
    HOME("home", R.string.navigation_label_home, R.drawable.ic_home),
    VIDEO("video", R.string.navigation_label_video, R.drawable.ic_video),
    PROFILE("profile", R.string.navigation_label_profile, R.drawable.ic_profile)
}