package com.mitchan.splatoonfriendsapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.mitchan.splatoonfriendsapp.ui.theme.SplatoonFriendsAppTheme
import com.mitchan.splatoonfriendsapp.ui.top.SplatoonFriendsApp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SplatoonFriendsAppTheme {
                // A surface container using the 'background' color from the theme
                SplatoonFriendsApp()
            }
        }
    }
}
