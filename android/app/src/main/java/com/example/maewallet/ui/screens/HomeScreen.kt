package com.example.maewallet.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.unit.dp
import com.example.maewallet.ui.components.FeaturedSection
import com.example.maewallet.ui.components.HeaderSection
import com.example.maewallet.ui.components.QuickActionsSection
import com.example.maewallet.ui.components.WalletCard
import com.example.maewallet.ui.theme.Background
import com.example.maewallet.ui.theme.GradientEnd
import com.example.maewallet.ui.theme.GradientStart

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    val scrollState = rememberScrollState()
    
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(
                brush = Brush.verticalGradient(
                    colors = listOf(GradientStart, GradientEnd, Background),
                    startY = 0f,
                    endY = 800f
                )
            )
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(scrollState)
                .padding(horizontal = 16.dp),
            verticalArrangement = Arrangement.spacedBy(24.dp)
        ) {
            HeaderSection()
            
            WalletCard()
            
            QuickActionsSection()
            
            FeaturedSection()
            
            // Add some bottom padding for better scrolling
            Box(modifier = Modifier.padding(bottom = 16.dp))
        }
    }
}
