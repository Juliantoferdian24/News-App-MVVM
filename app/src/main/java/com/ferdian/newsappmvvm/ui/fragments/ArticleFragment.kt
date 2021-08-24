package com.ferdian.newsappmvvm.ui.fragments

import android.os.Bundle
import android.view.View
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.ferdian.newsappmvvm.R
import com.ferdian.newsappmvvm.databinding.FragmentArticleBinding
import com.ferdian.newsappmvvm.databinding.FragmentSearchNewsBinding
import com.ferdian.newsappmvvm.ui.NewsActivity
import com.ferdian.newsappmvvm.ui.NewsViewModel

class ArticleFragment : Fragment(R.layout.fragment_article) {
    lateinit var viewModel: NewsViewModel
    val args: ArticleFragmentArgs by navArgs()

    val TAG = "ArticleFragment"
    private var _binding: FragmentArticleBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentArticleBinding.bind(view)

        viewModel = (activity as NewsActivity).viewModel

        val article = args.article
        binding.webView.apply {
            webViewClient = WebViewClient()
            loadUrl(article.url)
        }


    }
}