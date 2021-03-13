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
package com.example.androiddevchallenge.domain

object ItemsRepository {
    fun getFavoritedItems(): List<Item> {
        return listOf(
            Item(
                title = "Short mantras",
                imageUrl = "https://images.pexels.com/photos/4992463/pexels-photo-4992463.jpeg?auto=compress&cs=tinysrgb&dpr=2&w=500"
            ),
            Item(
                title = "Nature meditations",
                imageUrl = "https://images.pexels.com/photos/3571551/pexels-photo-3571551.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260"
            ),

            Item(
                title = "Stress and anxiety",
                imageUrl = "https://images.pexels.com/photos/1557238/pexels-photo-1557238.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260"
            ),

            Item(
                title = "Self-massage",
                imageUrl = "https://images.pexels.com/photos/1029604/pexels-photo-1029604.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260"
            ),

            Item(
                title = "Overwhelmed",
                imageUrl = "https://images.pexels.com/photos/3560044/pexels-photo-3560044.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260"
            ),
            Item(
                title = "Nightly and down",
                imageUrl = "https://images.pexels.com/photos/924824/pexels-photo-924824.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260"
            ),
        )
    }

    fun getBodyItems(): List<Item> {
        return listOf(
            Item(
                title = "Inversions",
                imageUrl = "https://images.pexels.com/photos/317157/pexels-photo-317157.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260"
            ),
            Item(
                title = "Quick Yoga",
                imageUrl = "https://images.pexels.com/photos/1812964/pexels-photo-1812964.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260"
            ),

            Item(
                title = "Stretching",
                imageUrl = "https://images.pexels.com/photos/4056723/pexels-photo-4056723.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260"
            ),

            Item(
                title = "Tabata",
                imageUrl = "https://images.pexels.com/photos/4662438/pexels-photo-4662438.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260"
            ),

            Item(
                title = "HITT",
                imageUrl = "https://images.pexels.com/photos/999309/pexels-photo-999309.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260"
            ),

            Item(
                title = "Pre-natal yoga",
                imageUrl = "https://images.pexels.com/photos/396133/pexels-photo-396133.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260"
            ),

        )
    }

    fun getMindItems(): List<Item> {
        return listOf(
            Item(
                title = "Meditate",
                imageUrl = "https://images.pexels.com/photos/3822622/pexels-photo-3822622.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260"
            ),

            Item(
                title = "With kids",
                imageUrl = "https://images.pexels.com/photos/3094230/pexels-photo-3094230.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260"
            ),

            Item(
                title = "Aromatheropy",
                imageUrl = "https://images.pexels.com/photos/4498318/pexels-photo-4498318.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260"
            ),

            Item(
                title = "On the go",
                imageUrl = "https://images.pexels.com/photos/1241348/pexels-photo-1241348.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260"
            ),

            Item(
                title = "With Pets",
                imageUrl = "https://images.pexels.com/photos/4056535/pexels-photo-4056535.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260"
            ),

            Item(
                title = "High Stress",
                imageUrl = "https://images.pexels.com/photos/897817/pexels-photo-897817.jpeg?auto=compress&cs=tinysrgb&dpr=2&h=750&w=1260"
            ),

        )
    }
}
