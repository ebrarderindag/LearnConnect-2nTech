package com.example.learnconnect.data.local.mock

import com.example.learnconnect.data.local.entity.CourseEntity

object MockCourseData {
   fun getMockCourses() = listOf(
       CourseEntity(
           id = "1",
           title = "Artificial Intelligence and Deep Learning",
           description = "Explore artificial intelligence applications, deep learning, neural networks, computer vision, and natural language processing.",
           thumbnailUrl = "https://example.com/ai.jpg",
           instructorName = "Emre Özdemir",
           duration = "30 hours"
       ),
       CourseEntity(
           id = "2",
           title = "Blockchain and Cryptocurrency Development",
           description = "Dive into blockchain technology, smart contracts, Ethereum, and cryptocurrencies with a comprehensive guide.",
           thumbnailUrl = "https://example.com/blockchain.jpg",
           instructorName = "Seda Arslan",
           duration = "35 hours"
       ),
       CourseEntity(
           id = "3",
           title = "Web Development with React.js",
           description = "Build dynamic and interactive web applications using the modern JavaScript library React.js.",
           thumbnailUrl = "https://example.com/react-web.jpg",
           instructorName = "Ali Veli",
           duration = "28 hours"
       ),
       CourseEntity(
           id = "4",
           title = "Data Science with Python",
           description = "Learn data analysis, data cleaning, visualization, and machine learning techniques using Python for data science.",
           thumbnailUrl = "https://example.com/datascience.jpg",
           instructorName = "Murat Korkmaz",
           duration = "40 hours"
       ),
       CourseEntity(
           id = "5",
           title = "Cybersecurity Fundamentals",
           description = "Gain fundamental knowledge in protecting against cyber-attacks, security protocols, and network security practices.",
           thumbnailUrl = "https://example.com/cybersecurity.jpg",
           instructorName = "Feyza Yılmaz",
           duration = "20 hours"
       )

   )
}