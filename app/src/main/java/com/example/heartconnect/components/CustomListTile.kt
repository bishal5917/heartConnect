package com.example.heartconnect.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForwardIos
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.heartconnect.ui.theme.HSizedBox1
import com.example.heartconnect.ui.theme.Primary
import com.example.heartconnect.ui.theme.VSizedBox1

@Composable
fun CustomListTile(
    modifier: Modifier = Modifier, title: String, leadingIcon: ImageVector,
    onClick: () -> Unit
) {
    Box(modifier = Modifier
        .padding(16.dp)
        .clickable {
            //execute function
            onClick()
        }) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                HSizedBox1()
                Icon(
                    imageVector = leadingIcon,
                    contentDescription = "Favorite Icon",
                    modifier = Modifier.size(25.dp),
                    tint = Primary
                )
                HSizedBox1()
                CustomText(data = title, fontWeight = FontWeight.W400, fontSize = 14)
            }
            Icon(
                imageVector = Icons.Default.ArrowForwardIos,
                contentDescription = "Favorite Icon",
                modifier = Modifier.size(15.dp),
                tint = Primary
            )
        }
    }
}