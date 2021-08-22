package com.ferdian.newsappmvvm.repositories

import com.ferdian.newsappmvvm.api.RetrofitInstance
import com.ferdian.newsappmvvm.db.ArticleDatabase

class NewsRepository(
    val db: ArticleDatabase
) {
    suspend fun getBreakingNews(countryCode: String, page: Int) =
        RetrofitInstance.api.getBreakingNews(countryCode, page)
}