package baseball

import baseball.game.BaseballGame
import baseball.util.AnswerGenerator
import baseball.util.UserInputHandler
import baseball.util.UserViewer
import camp.nextstep.edu.missionutils.Console

fun main() {
    UserViewer.printAppBeginMessage()

    var isFinish = false

    while(!isFinish) {
        val answer = AnswerGenerator.generate()
        val baseballGame = BaseballGame(answer)
        baseballGame.play()

        UserViewer.printAppFinishMessage()
        val userInput = Console.readLine()
        isFinish = UserInputHandler.handleAppFinishInput(userInput);
    }
}
