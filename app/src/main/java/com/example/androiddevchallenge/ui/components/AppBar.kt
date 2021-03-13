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
package com.example.androiddevchallenge.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp

@Composable
fun AppBar(
    name: String,
    navigationIcon: ImageVector? = null,
    onNavIconPressed: () -> Unit = {}
) {
    TopAppBar(
        modifier = Modifier.height(Dp(65f)),
        navigationIcon = {
            NavigationIcon(
                navigationIcon = navigationIcon,
                onNavIconPressed = onNavIconPressed
            )
        },
        title = {
            Row(horizontalArrangement = Arrangement.Center, modifier = Modifier.fillMaxWidth(0.8f)) {
                Text(name, style = MaterialTheme.typography.h6, textAlign = TextAlign.Center)
            }
        }
    )
}

@Composable
private fun NavigationIcon(navigationIcon: ImageVector?, onNavIconPressed: () -> Unit) {
    navigationIcon?.let { resource ->
        Row(
            Modifier.fillMaxSize(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Image(
                imageVector = navigationIcon,
                contentDescription = "",
                modifier = Modifier
                    .clickable(onClick = onNavIconPressed)
            )
        }
    }
}

@Preview
@Composable
fun PreviewAppBar() {
    AppBar(name = "App Bar", navigationIcon = Icons.Default.ArrowBack)
}
