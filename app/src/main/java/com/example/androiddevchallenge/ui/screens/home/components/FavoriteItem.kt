package com.example.androiddevchallenge.ui.screens.home.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.request.ImageRequest
import com.example.androiddevchallenge.domain.Item
import com.example.androiddevchallenge.domain.ItemsRepository
import com.skydoves.landscapist.coil.CoilImage

@Composable
fun FavoriteItem(item: Item, modifier: Modifier = Modifier) {
    val height = 56.dp
    Card(

        shape = MaterialTheme.shapes.small,
        modifier = modifier
            .width(192.dp)
            .height(height)
    ) {
        Row(
            modifier = Modifier.fillMaxSize().background(MaterialTheme.colors.surface),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        ) {
            CoilImage(
                imageModel = item.imageUrl,
                contentScale = ContentScale.Crop,
                circularRevealedEnabled = true,
                modifier = Modifier.size(height)
            )
            Spacer(modifier = Modifier.width(16.dp))
            Text(text = item.title, style = MaterialTheme.typography.h3)
        }
    }
}

@Preview
@Composable
fun PreviewFavoriteItem() {
    FavoriteItem(item = ItemsRepository.getBodyItems().first())
}