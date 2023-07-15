package com.example.jccctextfieldwithstate

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.android.style.LetterSpacingSpanEm
import androidx.compose.ui.text.android.style.LineHeightSpan
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
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
                    TextComposable("Android")
                    ImageComposable()
                    ButtonComposable()
                }
            }
        }
    }
}

@Composable
fun TextComposable(name: String = "Android", modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name! I am Vaibhav Ranga and at present I am learning android app development on my laptop.",
        modifier = modifier.padding(10.dp),
        color = Color.Red,
        fontSize = 30.sp,
        fontStyle = FontStyle.Italic,
        textAlign = TextAlign.Justify,
    )
}

@Composable
fun ImageComposable() {
    Image(
        painter = painterResource(id = R.drawable.car_wheel),
        contentDescription = "Old style car",
        modifier = Modifier
            .width(150.dp)
            .height(150.dp),
        contentScale = ContentScale.Inside
    )
}

@Composable
fun ButtonComposable() {
    Button(
        onClick = { }, colors = ButtonDefaults.buttonColors(
            contentColor = Color.Green,
        ),
        enabled = true
    ) {
        Text(text = "Click me")
        Image(painter = painterResource(R.drawable.car_wheel), contentDescription = "Car wheel")
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextFieldComposable() {
    TextField(
        value = "Hello there!",
        onValueChange = {},
        label = { Text(text = "Enter username") }
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun Preview() {
    JCCCTextFieldWithStateTheme {
        TextFieldComposable()
    }
}
