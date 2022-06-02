package com.example.lt20220614.sample

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.lt20220614.preview.PreviewColumn

@Composable
fun SampleText() {
    Text(text = "Hello, World!")
}

@Preview
@Composable
fun PreviewSampleText(){
    PreviewColumn {
        SampleText()
    }
}

@Composable
fun SampleColumn() {
    Column {
        Text("Engineer LT#1 Android")
        Text("Organized by U-NEXT")
    }
}

@Preview
@Composable
fun PreviewSampleColumn() {
    PreviewColumn {
        SampleColumn()
    }
}