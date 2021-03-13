package com.example.androiddevchallenge.ui.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldColors
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp

@Composable
fun AppTextField(
    value: String,
    onValueChange: (String) -> Unit,
    placeholder: String,
    modifier: Modifier = Modifier,
    icon: ImageVector? = null
) {
    val colors = TextFieldDefaults.textFieldColors(backgroundColor = MaterialTheme.colors.surface)
    TextField(value = value,
        colors = colors,
        singleLine = true,
        modifier = modifier
            .fillMaxWidth()
            .height(56.dp),
        leadingIcon = { icon?.let { Icon(imageVector = icon, contentDescription = "") } },
        onValueChange = onValueChange, placeholder = {
            Text(text = placeholder, style = MaterialTheme.typography.body1)
        })
}

