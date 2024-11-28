package com.example.learnconnect.data.local.mock

import com.example.learnconnect.domain.model.Video

object MockVideoData {
    val videos = listOf(
        Video(
            id = "1",
            title = "Artificial Intelligence and Deep Learning",
            onlineUrl = "https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/BigBuckBunny.mp4",
            offlineUrl = "asset:///videos/ai_intro.mp4"
        ),
        Video(
            id = "2",
            title = "Blockchain and Cryptocurrency Development",
            onlineUrl = "https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ElephantsDream.mp4",
            offlineUrl = "asset:///videos/blockchain_basics.mp4"
        ),
        Video(
            id = "3",
            title = "Web Development with React.js",
            onlineUrl = "https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ElephantsDream.mp4",
            offlineUrl = "asset:///videos/react_intro.mp4"
        ),
        Video(
            id = "4",
            title = "Data Science with Python",
            onlineUrl = "https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ElephantsDream.mp4",
            offlineUrl = "asset:///videos/datascience_basics.mp4"
        ),
        Video(
            id = "5",
            title = "Cybersecurity Fundamentals",
            onlineUrl = "https://commondatastorage.googleapis.com/gtv-videos-bucket/sample/ElephantsDream.mp4",
            offlineUrl = "asset:///videos/cybersecurity_intro.mp4"
        )

    )
}