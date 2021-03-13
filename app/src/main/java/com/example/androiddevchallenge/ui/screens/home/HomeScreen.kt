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
package com.example.androiddevchallenge.ui.screens.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.BottomAppBar
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.FabPosition
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.FloatingActionButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Spa
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.domain.Item
import com.example.androiddevchallenge.domain.ItemsRepository
import com.example.androiddevchallenge.ui.components.AppTextField
import com.example.androiddevchallenge.ui.screens.home.components.CarouselItem
import com.example.androiddevchallenge.ui.screens.home.components.FavoriteItem
import com.example.androiddevchallenge.ui.theme.MyTheme

@Composable
fun HomeScreen() {
    val search = remember { mutableStateOf("") }
    Scaffold(
        topBar = {
            Box(modifier = Modifier.padding(top = 56.dp, start = 16.dp, end = 16.dp)) {
                AppTextField(
                    value = search.value,
                    onValueChange = { search.value = it },
                    icon = Icons.Default.Search,
                    placeholder = "Search"
                )
            }
        },
        bottomBar = {
            BottomAppBar(
                elevation = 8.dp,
                backgroundColor = MaterialTheme.colors.background
            ) {
                BottomNavigationItem(
                    label = { Text(text = "HOME", style = MaterialTheme.typography.caption) },
                    selected = true,
                    onClick = { /*TODO*/ },
                    icon = { Icon(imageVector = Icons.Default.Spa, "") }
                )
                BottomNavigationItem(
                    label = { Text(text = "PROFILE", style = MaterialTheme.typography.caption) },
                    selected = false,
                    onClick = { /*TODO*/ },
                    icon = { Icon(imageVector = Icons.Default.AccountCircle, "") }
                )
            }
        },
        floatingActionButton = {
            FloatingActionButton(

                backgroundColor = MaterialTheme.colors.primary,
                contentColor = MaterialTheme.colors.onPrimary,
                elevation = FloatingActionButtonDefaults.elevation(0.dp),
                onClick = { /*TODO*/ }
            ) {
                Icon(imageVector = Icons.Default.PlayArrow, contentDescription = "")
            }
        },
        isFloatingActionButtonDocked = true,
        floatingActionButtonPosition = FabPosition.Center

    ) {

        LazyColumn(verticalArrangement = Arrangement.spacedBy(32.dp), contentPadding = PaddingValues(start = 16.dp)) {
            item("grid") {
                Grid(
                    title = "Favorited Collections",
                    items = ItemsRepository.getFavoritedItems()
                )
            }
            item("carousel1") {
                Carousel(
                    title = "Align you body",
                    items = ItemsRepository.getBodyItems()
                )
            }
            item("carousel2") {
                Carousel(
                    title = "Align your mind",
                    items = ItemsRepository.getMindItems()
                )
            }
        }
    }
}

@Composable
fun Grid(title: String, items: List<Item>) {
    Column {
        Header(text = title)
        Spacer(modifier = Modifier.height(8.dp))
        LazyRow(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
            items(items.count() / 2) { index ->
                Column() {
                    FavoriteItem(item = items[index * 2])
                    Spacer(modifier = Modifier.height(8.dp))
                    items.getOrNull(index * 2 + 1)?.let {
                        FavoriteItem(item = it)
                    }
                }
            }
        }
    }
}

@Composable
fun Carousel(title: String, items: List<Item>) {
    Column {
        Header(text = title)
        Spacer(modifier = Modifier.height(8.dp))
        LazyRow(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
            items(items.count()) { index ->
                CarouselItem(item = items[index])
            }
        }
    }
}

@Composable
fun Header(text: String) {
    Box(contentAlignment = Alignment.BottomCenter, modifier = Modifier.padding(top = 24.dp)) {
        Text(
            text = text.toUpperCase(),
            style = MaterialTheme.typography.h2,
        )
    }
}

@Preview(device = Devices.PIXEL_4)
@Composable
fun PreviewSecon() {
    MyTheme() {
        HomeScreen()
    }
}
