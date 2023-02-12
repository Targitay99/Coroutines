package ru.netology.coroutines.dto

data class PostWithComments(
    val author: Author,
    val post: Post,
    val comments: List<Comment>,
)
