package com.example.androiddevchallenge.ui.screens.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.ui.components.AppButton
import com.example.androiddevchallenge.ui.components.AppTextField
import com.example.androiddevchallenge.ui.navigation.Router

@Composable
fun LoginScreeen(router: Router) {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Image(
            painterResource(id = R.drawable.login),
            contentDescription = "",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.fillMaxSize()
        )
        val password = remember { mutableStateOf("") }
        val email = remember { mutableStateOf("") }
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
        ) {
            Text(text = "LOG IN", style = MaterialTheme.typography.h1)
            Spacer(modifier = Modifier.height(32.dp))
            AppTextField(
                value = email.value,
                onValueChange = { email.value = it },
                placeholder = "Email address"
            )
            Spacer(modifier = Modifier.height(8.dp))
            AppTextField(
                value = password.value,
                placeholder = "Password",
                onValueChange = { password.value = it })

            Spacer(modifier = Modifier.height(8.dp))


            AppButton(text = "LOG IN", modifier = Modifier.fillMaxWidth(), onClick = { router.showHome() })
            Spacer(modifier = Modifier.height(32.dp))
            Text(text = "Don't have account? Sign up")
        }
    }
}


@Preview(device = Devices.PIXEL_4)
@Composable
fun PreviewSecon() {
    LoginScreeen(Router(rememberNavController()))
}