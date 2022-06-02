package com.example.lt20220614.counter

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lt20220614.preview.PreviewColumn

/**
 * increment されない
 */
@Composable
fun Counter1() {
    var count = 0

    Text(text = "count: $count", fontSize = 40.sp)
    Spacer(modifier = Modifier.size(20.dp))
    Button(onClick = { count++ }) {
        Text(text = "increment", fontSize = 30.sp)
    }
}

@Preview
@Composable
fun PreviewCounter1() {
    PreviewColumn {
        Counter1()
    }
}
