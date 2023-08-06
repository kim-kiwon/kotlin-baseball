package baseball.game

import baseball.ball.Ball
import baseball.ball.Balls

class Referee(private val answer: List<Int>, private val userInput: List<Int>) {
    fun compareWithAnswer(): Balls {
        val balls = mutableListOf<Ball>()

        for (i in userInput.indices) {
            when {
                userInput[i] == answer[i] -> balls.add(Ball.STRIKE)
                userInput[i] in answer -> balls.add(Ball.BALL)
                else -> Unit
            }
        }

        return Balls(balls)
    }
}