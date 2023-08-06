package baseball.game

import baseball.util.UserInputHandler
import baseball.util.UserViewer
import camp.nextstep.edu.missionutils.Console

class BaseballGame(private val answer: List<Int>) {
    fun play() {
        var isEnd = false

        while(!isEnd) {
            UserViewer.printReceiveNumberMessage()
            val userInput = Console.readLine()
            val userNumbers = UserInputHandler.handleGameInput(userInput)

            val referee = Referee(answer, userNumbers)
            val balls = referee.compareWithAnswer()

            println(balls)
            isEnd = balls.isEnd()
        }
        UserViewer.printGameFinishMessage()
    }
}