package com.example.androiddevchallenge.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
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


