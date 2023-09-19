package com.example.heartconnect.features.presentation.screens.chat.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.heartconnect.components.CustomNetworkImage
import com.example.heartconnect.components.CustomText
import com.example.heartconnect.ui.theme.HSizedBox1
import com.example.heartconnect.ui.theme.VSizedBox0

@Composable
@Preview
fun ConvoComponent() {
    Box(modifier = Modifier
        .clickable {
            //execute function
//            onClick()
        }) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            HSizedBox1()
            CustomNetworkImage(
                imageUrl = "https://img.freepik" +
                        ".com/free-photo/closeup-shot-siberian-tiger-jungle_181624-16309" +
                        ".jpg?size=626&ext=jpg", modifier = Modifier.clip(CircleShape),
                parentmodifier = Modifier.size(60.dp)
            )
            HSizedBox1()
            Column(verticalArrangement = Arrangement.SpaceBetween) {
                CustomText(data = "Damon Salvatore", fontWeight = FontWeight.W400, fontSize = 18)
                VSizedBox0()
                CustomText(
                    data = "Tap to chat ...", fontWeight = FontWeight.W400, fontSize = 12,
                    color = Color.LightGray
                )
            }
        }
    }

}