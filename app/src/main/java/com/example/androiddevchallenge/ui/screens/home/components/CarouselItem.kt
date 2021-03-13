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
