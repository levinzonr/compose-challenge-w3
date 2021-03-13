package com.example.androiddevchallenge.ui.screens.third

import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Device
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ThirdScreen() {
    Scaffold() {
        Text(text = "Second")
    }
}


@Preview(device = Devices.PIXEL_4)
@Composable
fun PreviewSecon() {
    ThirdScreen()
}