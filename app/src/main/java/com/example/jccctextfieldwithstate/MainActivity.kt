package com.example.jccctextfieldwithstate

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jccctextfieldwithstate.ui.theme.JCCCTextFieldWithStateTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JCCCTextFieldWithStateTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                }
            }
        }
    }
}

@Composable
fun TextExample(name: String) {
    Text(
        text = "Hello $name! I am learning android app development on my MacBook.",
        modifier = Modifier.padding(10.dp),
        color = Color.Red,
        fontSize = 30.sp,
        fontStyle = FontStyle.Italic,
        textAlign = TextAlign.Justify,
    )
}

@Composable
fun ImageExample() {
    Image(
        painter = painterResource(id = R.drawable.car_wheel),
        contentDescription = "Car wheel",
        contentScale = ContentScale.Inside,
        modifier = Modifier
            .alpha(0.5F)
            .size(50.dp, 50.dp)
    )
}

@Composable
fun ButtonExample() {
    Button(
        onClick = { },
        colors = ButtonDefaults.buttonColors(
            containerColor = Color.Blue,
            contentColor = Color.White
        ),
        shape = ButtonDefaults.shape
    ) {
        Text(text = "Click me")
        Image(
            painter = painterResource(id = R.drawable.car_wheel),
            contentDescription = "Car wheel"
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextFieldExample() {
    val state = remember {
        mutableStateOf("")
    }
    TextField(
        value = state.value,
        onValueChange = {
            state.value = it
        },
        label = { Text(text = "Enter your name") }
    )
}

@Composable
fun ColumnExample() {
    Column(
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "A")
        Text(text = "B")
    }
}

@Composable
fun RowExample() {
    Row(
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = "X", fontSize = 24.sp)
        Text(text = "Y", fontSize = 24.sp)
    }
}


@Composable
fun BoxExample() {
    Box(
        contentAlignment = Alignment.CenterStart
    ) {
        Image(
            painter = painterResource(id = R.drawable.car_wheel),
            contentDescription = "Car wheel"
        )
        Text(text = "Some random text to demonstrate box layout", color = Color.Red)
    }
}

@Composable
fun ListItemView() {
    Row() {
        Image(
            painter = painterResource(id = R.drawable.baseline_account_circle_512),
            contentDescription = "Account image",
            modifier = Modifier.size(60.dp)
        )
        Column() {
            Text(text = "John Doe", fontSize = 20.sp, fontWeight = FontWeight.Bold)
            Text(text = "Software developer", fontSize = 20.sp, fontWeight = FontWeight.Thin)
        }
    }
}

@Composable
fun ModifierExample(modifier: Modifier) {
    Text(
        text = "Hello",
        color = Color.White,
        modifier = modifier
            .clickable { }
            .background(Color.Blue)
            .size(200.dp)
            .padding(36.dp)
            .border(4.dp, Color.Red)
            .clip(CircleShape)
            .background(Color.Yellow)
    )
}

@Composable
fun CircularImageExample() {
    Image(
        painter = painterResource(id = R.drawable.world_famous_monuments),
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .size(80.dp)
            .clip(CircleShape)
            .border(2.dp, Color.Black, CircleShape),
        contentDescription = "World famous monuments",
    )
}

@Preview(showSystemUi = true)
@Composable
fun MainActivityPreviewFunction() {
    JCCCTextFieldWithStateTheme {

    }
}
