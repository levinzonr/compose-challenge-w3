package com.example.androiddevchallenge.ui.screens.home.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.request.ImageRequest
import coil.transform.CircleCropTransformation
import com.example.androiddevchallenge.domain.Item
import com.example.androiddevchallenge.domain.ItemsRepository
import com.skydoves.landscapist.coil.CoilImage

@Composable
fun CarouselItem(item: Item) {
    val request = ImageRequest.Builder(LocalContext.current).data(item.imageUrl)
        .transformations(CircleCropTransformation())
        .build()

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        CoilImage(
            imageRequest = request,
            circularRevealedEnabled = true,
            modifier = Modifier.size(88.dp)
        )
        Box(contentAlignment = Alignment.BottomCenter, modifier = Modifier.height(24.dp)) {
            Text(
                text = item.title,
                style = MaterialTheme.typography.h3,
                textAlign = TextAlign.Center
            )
        }

    }
}

@Preview
@Composable
fun PreviewCarouselItem() {
    CarouselItem(item = ItemsRepository.getBodyItems().first())
}