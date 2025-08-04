package com.example.maewallet

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import com.example.maewallet.ui.components.BottomNavigationBar
import com.example.maewallet.ui.screens.HomeScreen

@Composable
fun MAEWalletApp() {
    var selectedTab by remember { mutableIntStateOf(0) }

    Scaffold(
        bottomBar = {
            BottomNavigationBar(
                selectedTab = selectedTab,
                onTabSelected = { selectedTab = it }
            )
        }
    ) { paddingValues ->
        when (selectedTab) {
            0 -> HomeScreen(modifier = Modifier.padding(paddingValues))
            1 -> AccountsScreen(modifier = Modifier.padding(paddingValues))
            2 -> ScanScreen(modifier = Modifier.padding(paddingValues))
            3 -> ExpensesScreen(modifier = Modifier.padding(paddingValues))
            4 -> ApplyScreen(modifier = Modifier.padding(paddingValues))
        }
    }
}

@Composable
fun AccountsScreen(modifier: Modifier = Modifier) {
    // Placeholder for Accounts screen
}

@Composable
fun ScanScreen(modifier: Modifier = Modifier) {
    // Placeholder for Scan screen
}

@Composable
fun ExpensesScreen(modifier: Modifier = Modifier) {
    // Placeholder for Expenses screen
}

@Composable
fun ApplyScreen(modifier: Modifier = Modifier) {
    // Placeholder for Apply screen
}
