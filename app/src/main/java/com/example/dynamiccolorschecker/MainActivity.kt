package com.example.dynamiccolorschecker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.dynamiccolorschecker.ui.theme.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DynamicColorsCheckerTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ColorBoxes()
                }
            }
        }
    }
}

val groupedItems = mapOf(
    "NEUTRAL1" to NEUTRAL1,
    "NEUTRAL2" to NEUTRAL2,
    "ACCENT1" to ACCENT1,
    "ACCENT2" to ACCENT2,
)

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun ColorBoxes() {
    LazyColumn {
        groupedItems.forEach { (category, items) ->
            stickyHeader {
                Header(category = category)
            }

            items(items) {item ->
                ColorBox(item = item)
            }
        }
    }
}

@Composable
fun Header(category : String) {
    Box(modifier = Modifier
        .background(Color.DarkGray)
        .fillMaxWidth()
        .padding(8.dp)) {
        Text(text = category, color = Color.White, style = TextStyle(fontWeight = FontWeight.Bold))
    }
}

@Composable
fun ColorBox(item: ColorMap) {
    Row(
        Modifier
            .fillMaxWidth()
            .height(60.dp)
            .background(colorResource(id = item.res))) {
        Text(text = item.name)
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    DynamicColorsCheckerTheme {
        ColorBoxes()
    }
}