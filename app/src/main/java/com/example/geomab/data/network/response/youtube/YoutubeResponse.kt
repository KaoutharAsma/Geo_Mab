package com.example.geomab.data.network.response.youtube



data class YoutubeResponse(
    val etag: String,
    val items: ArrayList<Item>,
    val kind: String,
    val nextPageToken: String,
    val pageInfo: PageInfo,
    val regionCode: String
)