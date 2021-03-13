package com.example.androiddevchallenge.ui.screens.first

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.animatedVectorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.rememberNavController
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.ui.components.AppButton
import com.example.androiddevchallenge.ui.navigation.Router

@Composable
fun WelcomeScreen(router: Router, viewModel: FirstViewModel) {
    Box(contentAlignment = Alignment.Center, modifier = Modifier.fillMaxSize()) {
        Image(painterResource(id = R.drawable.welcome), contentDescription = "",contentScale = ContentScale.FillBounds, modifier = Modifier.fillMaxSize())
        Column(verticalArrangement = Arrangement.Center, modifier = Modifier.fillMaxWidth()) {
            Image(painterResource(id = R.drawable.logo), contentDescription = "logo", modifier = Modifier.fillMaxWidth())
            Spacer(modifier = Modifier.height(32.dp))
            AppButton(text = "Sign up", modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp))
            Spacer(modifier = Modifier.height(8.dp))
            AppButton(text = "Log In", secondary = true, modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp))
        }
    }
}


@Preview(device = Devices.PIXEL_4)
@Composable
fun PreviewWelcomeScreen() {
    WelcomeScreen(router = Router(rememberNavController()), viewModel())
}

