package baseball.util

import java.lang.IllegalArgumentException

class UserInputHandler {
    companion object {
        fun handleAppFinishInput(userInput: String): Boolean {
            return when (userInput) {
                "1" -> false
                "2" -> true
                else -> throw IllegalArgumentException("FinishInput should be 1 or 2")
            }
        }

        fun handleGameInput(userInput: String): List<Int> {
            if (userInput.length != 3) {
                throw IllegalArgumentException("strInput must have a length of 3")
            }

            if (!userInput.all { it.isDigit() }) {
                throw IllegalArgumentException("strInput must contain only numeric characters")
            }

            if (userInput.contains('0')) {
                throw IllegalArgumentException("strInput must not contain 0")
            }

            if (userInput.toList().size != userInput.toSet().size) {
                throw IllegalArgumentException("strInput must not have duplicated number")
            }

            return userInput.toList().map { "$it".toInt() }
        }
    }
}