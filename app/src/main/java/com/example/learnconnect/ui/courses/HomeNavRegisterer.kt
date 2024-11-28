package com.example.learnconnect.ui.courses

import androidx.compose.runtime.collectAsState
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.learnconnect.core.navigation.NavRegisterer
import com.example.learnconnect.core.navigation.Screen
import com.example.learnconnect.ui.profile.ProfileViewModel

class MyCoursesNavRegisterer : NavRegisterer {
    override fun registerGraph(
        navGraphBuilder: NavGraphBuilder,
        navController: NavController
    ) {
        navGraphBuilder.composable<Screen.MyCoursesScreen> {
            val viewModel = hiltViewModel<ProfileViewModel>()
            MyCoursesScreen(
                uiState = viewModel.uiState.collectAsState().value,
                onFavoriteClick = { course -> viewModel.toggleFavorite(course) },
                onCourseClick = { courseId -> }
            )
        }
    }
}