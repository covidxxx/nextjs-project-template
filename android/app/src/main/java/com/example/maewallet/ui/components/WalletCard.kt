package com.example.maewallet.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.maewallet.ui.theme.BlueAccent
import com.example.maewallet.ui.theme.CardBackground
import com.example.maewallet.ui.theme.GradientEnd
import com.example.maewallet.ui.theme.GradientStart
import com.example.maewallet.ui.theme.TextOnPrimary
import com.example.maewallet.ui.theme.TextSecondary

@Composable
fun WalletCard(modifier: Modifier = Modifier) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = Color.Transparent),
        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(GradientStart, GradientEnd),
                        startY = 0f,
                        endY = 400f
                    ),
                    shape = RoundedCornerShape(16.dp)
                )
                .padding(24.dp)
        ) {
            Column(
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                // Wallet title and account number
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    Text(
                        text = "MAE Wallet",
                        color = TextOnPrimary,
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold
                    )
                    
                    Text(
                        text = "0143 5654 8122",
                        color = TextSecondary,
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Normal
                    )
                }
                
                // Balance section
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = "RM 73.13",
                        color = TextOnPrimary,
                        fontSize = 32.sp,
                        fontWeight = FontWeight.Bold
                    )
                    
                    IconButton(
                        onClick = { /* Handle visibility toggle */ },
                        modifier = Modifier.size(32.dp)
                    ) {
                        Icon(
                            imageVector = Icons.Default.Visibility,
                            contentDescription = "Toggle balance visibility",
                            tint = TextOnPrimary,
                            modifier = Modifier.size(20.dp)
                        )
                    }
                }
                
                // View All Accounts button
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    TextButton(
                        onClick = { /* Handle view all accounts */ }
                    ) {
                        Text(
                            text = "View All Accounts",
                            color = BlueAccent,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Medium
                        )
                    }
                }
            }
        }
    }
}
