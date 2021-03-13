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

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.Action

@Composable
fun AppButton(
    text: String,
    modifier: Modifier = Modifier,
    isEnabled: Boolean = true,
    secondary: Boolean = false,
    onClick: Action = {}
) {
    val backgroundColor =
        if (secondary) MaterialTheme.colors.secondary else MaterialTheme.colors.primary

    val colors = ButtonDefaults.buttonColors(backgroundColor = backgroundColor)

    Button(
        onClick = onClick,
        enabled = isEnabled,
        colors = colors,
        modifier = modifier.height(72.dp),
        shape = MaterialTheme.shapes.medium
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(text = text.toUpperCase(), style = MaterialTheme.typography.button)
        }
    }
}

@Preview
@Composable
fun AppButtonPreview() {
    AppButton("Button")
}

@Preview
@Composable
fun AppButtonPreviewDisabled() {
    AppButton("Disabeld Button", isEnabled = false)
}
