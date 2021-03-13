package com.example.androiddevchallenge.ui.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.material.Button
import androidx.compose.material.ButtonColors
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