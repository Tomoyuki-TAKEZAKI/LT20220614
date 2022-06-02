package com.example.lt20220614.guessing

import android.content.Context
import com.example.lt20220614.R

object GuessingGameMessageGenerator {

    /**
     * Compares the guess and the hidden number and returns the result in a sentence
     */
    fun generate(
        context: Context,
        guess: String,
        hiddenNumber: Int,
    ): String = runCatching {
        guess.toInt()
    }.fold(
        onSuccess = { guessInt ->
            when {
                (guessInt !in (1..100)) -> context.getString(R.string.message_default)
                guessInt > hiddenNumber -> context.getString(R.string.message_greater_than_the_hidden_number)
                guessInt < hiddenNumber -> context.getString(R.string.message_less_than_the_hidden_number)
                else -> context.getString(R.string.message_correct_answer)
            }
        },
        onFailure = {
            context.getString(R.string.message_default)
        }
    )
}