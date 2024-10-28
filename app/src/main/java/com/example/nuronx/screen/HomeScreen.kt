package com.example.nuronx.screen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen() {

    var showModal by remember {
        mutableStateOf(false)
    }
    // Main Scaffold for the Home Screen
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(text = "Home", fontSize = 22.sp, fontWeight = FontWeight.Bold)
                },
                actions = {
                    IconButton(onClick = {/* Profile Action */
                    }) {
                        Icon(Icons.Filled.AccountCircle, contentDescription = "Profile")
                    }
                    IconButton(onClick = { showModal = true }) {
                        Icon(Icons.Filled.Notifications, contentDescription = "Friend Requests")
                    }
                }
            )
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = { /* TODO: Add new action */ },
                containerColor = MaterialTheme.colorScheme.primary
            ) {
                Icon(Icons.Filled.Person, contentDescription = "Add Friends")
            }
        }
    ) { paddingValues ->
        // Main content inside Scaffold
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            contentAlignment = Alignment.Center
        ) {
            Text(text = "Welcome to Home Screen!", fontSize = 18.sp)
        }
        // If the modal sheet should be shown
        if (showModal) {
            // your code here ...
        }
    }
}