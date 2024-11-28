package com.example.learnconnect.ui.profile

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewScreenSizes
import androidx.compose.ui.unit.dp
import com.example.learnconnect.domain.model.Course
import com.example.learnconnect.ui.profile.component.CourseSection
import com.example.learnconnect.ui.profile.component.LogoutButton
import com.example.learnconnect.ui.profile.component.ProfileHeader

@Composable
fun ProfileScreen(
    uiState: ProfileUiState,
    onCourseClick: (String) -> Unit,
    onLogoutClick: () -> Unit,
    onFavoriteClick: (Course) -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .verticalScroll(rememberScrollState()) // Scrollable content
    ) {
        // Profile Header
        ProfileHeader(
            userName = uiState.userName,
            email = uiState.email
        )

        // Favourite Courses Section
        CourseSection(
            title = "Favourite Courses",
            courses = uiState.favoriteCourses,
            onCourseClick = onCourseClick,
            onFavoriteClick = onFavoriteClick,
            modifier = Modifier
        )

        // Spacer to push the button to the bottom
        Spacer(modifier = Modifier.weight(1f))

        // Logout Button at the bottom
        Button(
            onClick = onLogoutClick,
            modifier = modifier
                .fillMaxWidth()
                .padding(16.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = MaterialTheme.colorScheme.secondary
            )
        ) {
            Icon(
                imageVector = Icons.Default.ExitToApp,
                contentDescription = null,
                modifier = Modifier.padding(end = 8.dp)
            )
            Text("")
        }
    }
}




