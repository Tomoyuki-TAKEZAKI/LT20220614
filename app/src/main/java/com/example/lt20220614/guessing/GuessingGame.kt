package com.example.lt20220614.guessing

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lt20220614.preview.PreviewColumn


/**
 * 推測ゲーム
 * x: 最初に決定した乱数がテキストフィールドへの入力ごとに変化してしまう！
 */
@Composable
fun GuessingGame() {
    val hiddenNumber = (1..100).random()
    println("debug: hiddenNumber $hiddenNumber")

    var guess by remember { mutableStateOf("") }
    TextField(
        value = guess,
        onValueChange = { guess = it },
    )
    // region display message
    val message: String = runCatching {
        guess.toInt()
    }.fold(
        onSuccess = { guessInt ->
            when {
                (guessInt !in (1..100)) -> "Please enter a value between 1 and 100"
                guessInt > hiddenNumber -> "Greater than the hidden number"
                guessInt < hiddenNumber -> "Less than the hidden number"
                else -> "Is the correct answer"
            }
        },
        onFailure = {
            "Please enter a value between 1 and 100"
        }
    )
    Spacer(modifier = Modifier.size(20.dp))
    Text(text = message, fontSize = 20.sp)
    // endregion
}

@Preview
@Composable
fun PreviewGuessingGame() {
    PreviewColumn {
        GuessingGame()
    }
}
