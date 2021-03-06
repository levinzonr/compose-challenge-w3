/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.style.TextDecoration
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

    val annotatedString = with(AnnotatedString.Builder("Don't have account? ")) {
        pushStyle(SpanStyle(textDecoration = TextDecoration.Underline))
        append("Sign up")
        toAnnotatedString()
    }
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
                onValueChange = { password.value = it }
            )

            Spacer(modifier = Modifier.height(8.dp))

            AppButton(text = "LOG IN", modifier = Modifier.fillMaxWidth(), onClick = { router.showHome() })
            Spacer(modifier = Modifier.height(24.dp))
            Text(text = annotatedString)
        }
    }
}

@Preview(device = Devices.PIXEL_4)
@Composable
fun PreviewSecon() {
    LoginScreeen(Router(rememberNavController()))
}
