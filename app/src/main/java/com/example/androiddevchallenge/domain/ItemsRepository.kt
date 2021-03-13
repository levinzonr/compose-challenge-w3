package com.example.androiddevchallenge.domain

object ItemsRepository {
    fun getBodyItems() : List<Item> {
        return listOf(
            Item(
                title = "Short mantras",
                imageUrl = "https://images.pexels.com/photos/3571551/pexels-photo-3571551.jpeg?auto=compress&cs=tinysrgb&h=750&w=1260"
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

}