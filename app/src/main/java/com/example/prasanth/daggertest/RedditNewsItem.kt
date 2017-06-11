package com.example.prasanth.daggertest;

/**
 * Created by Prasanth on 6/11/2017.
 */

data class RedditNewsItem(
        val author: String,
        val title: String,
        val numComments: Int,
        val created: Long,
        val thumbnail: String,
        val url: String
)
    : ViewType {
    override fun getViewType() = AdapterConstants.NEWS
}