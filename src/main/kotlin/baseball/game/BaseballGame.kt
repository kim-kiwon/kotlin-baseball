package baseball.game

import baseball.ball.Ball
import baseball.ball.Balls
import camp.nextstep.edu.missionutils.Console

class BaseballGame(val answer: List<Int>) {
    fun play() {
        var isEnd = false

        printStartMessage()
        while(!isEnd) {
            val userInput = receiveUserInput()
            val balls = compareWithAnswer(userInput)

            println(balls)
            isEnd = balls.isEnd()
        }
        printEndMessage()
    }

    private fun printStartMessage() {
        println("숫자 야구 게임을 시작합니다.")
    }

    private fun receiveUserInput(): List<Int> {
        println("숫자를 입력해주세요 : ")
        val strInput = Console.readLine()

        validateStrInput(strInput)
        return strInput.toList().map { "$it".toInt() }
    }

    private fun validateStrInput(strInput: String) {
        TODO("Validate strInput. All element should be numeric string.")
    }

    private fun compareWithAnswer(userInput: List<Int>): Balls {
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

    private fun printEndMessage() {
        println("3개의 숫자를 모두 맞히셨습니다! 게임 종료")
    }
}