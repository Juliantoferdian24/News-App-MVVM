package com.ferdian.newsappmvvm.ui

import androidx.lifecycle.ViewModel
import com.ferdian.newsappmvvm.repositories.NewsRepository

class NewsViewModel(
    val newsRepository : NewsRepository
) : ViewModel() {
}