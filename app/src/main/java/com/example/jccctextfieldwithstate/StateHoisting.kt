package com.example.jccctextfieldwithstate

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun NotificationsParent() {
    val count = remember { mutableStateOf(0) }
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Notifications(count.value) { count.value++ }
        Messages(count.value)
    }
}

@Composable
fun Notifications(count: Int, increment: () -> Unit) {
    Column {
        Text(text = "You have sent $count notifications")
        Button(onClick = {increment()}) {
            Text(text = "Send notifications")
        }
    }
}

@Composable
private fun Messages(count: Int) {
    Card(
        elevation = CardDefaults.cardElevation(defaultElevation = 8.dp),
    ) {
        Text(
            text = "Messages sent so far $count",
            fontSize = 20.sp,
            modifier = Modifier.padding(all = 10.dp)
        )
    }
}