package com.mitchan.splatoonfriendsapp.ui.account

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mitchan.splatoonfriendsapp.R
import com.mitchan.splatoonfriendsapp.ui.theme.SplatoonFriendsAppTheme

@Composable
fun WelcomeScreen() {
    Scaffold(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(100.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_foreground),
                contentDescription = null,
                contentScale = ContentScale.Fit,
                modifier = Modifier.size(200.dp)
                    .background(color = Color.Magenta),
                colorFilter = ColorFilter.tint(color = MaterialTheme.colors.primary)
            )

            Column(
                modifier = Modifier.weight(1f),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Bottom
            ) {
                Button(onClick = { /*TODO*/ }) {
                    Text(text = stringResource(id = R.string.welcome_create_account_button_label))
                }

                Button(onClick = { /*TODO*/ }) {
                    Text(text = stringResource(id = R.string.welcome_sign_in_button_label))
                }

                Spacer(modifier = Modifier.height(64.dp))
            }
        }
    }
}

@Composable
@Preview
private fun WelcomeScreenPreview() {
    SplatoonFriendsAppTheme {
        WelcomeScreen()
    }
}