package com.example.lt20220614.guessing

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lt20220614.preview.PreviewColumn


/**
 * 推測ゲーム ver.1
 * x: 入力文字列が表示されない
 */
@Composable
fun GuessingGame() {
    val hiddenNumber = (1..100).random()
    println("debug: hiddenNumber $hiddenNumber")
    var guess = ""
    val message = GuessingGameMessageGenerator.generate(
        context = LocalContext.current,
        guess = guess,
        hiddenNumber = hiddenNumber,
    )

    TextField(
        value = guess,
        onValueChange = { guess = it },
    )
    Spacer(modifier = Modifier.size(20.dp))
    Text(text = message, fontSize = 20.sp)
}

@Preview
@Composable
fun PreviewGuessingGame() {
    PreviewColumn(modifier = Modifier.fillMaxSize()) {
        GuessingGame()
    }
}
