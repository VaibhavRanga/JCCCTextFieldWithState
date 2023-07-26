package com.example.jccctextfieldwithstate.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jccctextfieldwithstate.R

@Composable
fun ListItem(image: Int, title: String, subtitle: String) {
    Card(modifier = Modifier.padding(8.dp)) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(id = image),
                contentDescription = "Account image",
                modifier = Modifier
                    .size(60.dp)
                    .padding(8.dp)
                    .weight(0.2f)
            )
            Column(
                verticalArrangement = Arrangement.Center,
                modifier = Modifier.weight(0.8f)
            ) {
                Text(
                    text = title,
                    style = MaterialTheme.typography.headlineMedium
                )
                Text(
                    text = subtitle,
                    style = MaterialTheme.typography.bodyMedium
                )
            }
        }
    }
}

@Composable
fun RecyclerView() {
    LazyColumn {
        items(getItemList()) {
            ListItem(image = it.image, title = it.title, subtitle = it.subtitle)
        }
    }
}

data class Category(
    val image: Int,
    val title: String,
    val subtitle: String
)

fun getItemList(): List<Category> {
    return listOf(
        Category(R.drawable.baseline_account_circle_512, "Programming", "Learn different languages"),
        Category(R.drawable.baseline_account_circle_512, "Technology", "News about technology"),
        Category(R.drawable.baseline_account_circle_512, "Full stack development", "From backend to frontend"),
        Category(R.drawable.baseline_account_circle_512, "Dev ops", "Deploy CI/ CD etc."),
        Category(R.drawable.baseline_account_circle_512, "AI/ ML", "Basic artificial intelligence"),
        Category(R.drawable.baseline_account_circle_512, "Programming", "Learn different languages"),
        Category(R.drawable.baseline_account_circle_512, "Technology", "News about technology"),
        Category(R.drawable.baseline_account_circle_512, "Full stack development", "From backend to frontend"),
        Category(R.drawable.baseline_account_circle_512, "Dev ops", "Deploy CI/ CD etc."),
        Category(R.drawable.baseline_account_circle_512, "AI/ ML", "Basic artificial intelligence"),
        Category(R.drawable.baseline_account_circle_512, "Programming", "Learn different languages"),
        Category(R.drawable.baseline_account_circle_512, "Technology", "News about technology"),
        Category(R.drawable.baseline_account_circle_512, "Full stack development", "From backend to frontend"),
        Category(R.drawable.baseline_account_circle_512, "Dev ops", "Deploy CI/ CD etc."),
        Category(R.drawable.baseline_account_circle_512, "AI/ ML", "Basic artificial intelligence")
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun PreviewFunction() {

}
