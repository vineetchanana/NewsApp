package com.example.newsapi.article

import com.example.newsapi.SourceX

data class Article(
    val author: String,
    val content: String,
    val description: String,
    val publishedAt: String,
    val source: SourceX,
    val title: String,
    val url: String,
    val urlToImage: String
)