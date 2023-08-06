package baseball

import baseball.game.BaseballGame
import baseball.util.AnswerGenerator
import camp.nextstep.edu.missionutils.Console
import java.lang.IllegalArgumentException

fun main() {
    printBeginMessage()

    var isFinish = false

    while(!isFinish) {
        val answer = AnswerGenerator.generate()
        val baseballGame = BaseballGame(answer)
        baseballGame.play()

        printFinishMessage()
        isFinish = receiveFinishInput()
    }
}

fun printBeginMessage() {
    println("숫자 야구 게임을 시작합니다.")
}

fun printFinishMessage() {
    println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.")
}

fun receiveFinishInput(): Boolean {
    return when (Console.readLine()) {
        "1" -> false
        "2" -> true
        else -> throw IllegalArgumentException("FinishInput should be 1 or 2")
    }
}
