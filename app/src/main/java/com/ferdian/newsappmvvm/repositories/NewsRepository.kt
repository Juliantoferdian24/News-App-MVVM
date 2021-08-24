package com.ferdian.newsappmvvm.repositories

import com.ferdian.newsappmvvm.api.RetrofitInstance
import com.ferdian.newsappmvvm.db.ArticleDatabase
import com.ferdian.newsappmvvm.models.Article

class NewsRepository(
    val db: ArticleDatabase
) {
    suspend fun getBreakingNews(countryCode: String, page: Int) =
        RetrofitInstance.api.getBreakingNews(countryCode, page)

    suspend fun searchForNews(searchQuery: String, pageNumber: Int) =
        RetrofitInstance.api.searchForNews(searchQuery, pageNumber)

    suspend fun upsert(article: Article) = db.getArticleDao().upsert(article)

    fun getSavedNews() = db.getArticleDao().getAllArticles()

    suspend fun deleteArticle(article: Article) = db.getArticleDao().deleteArticle(article)
}