package baseball.game

import camp.nextstep.edu.missionutils.Console

class BaseballGame(val answer: List<Int>) {
    fun play() {
        var isAnswer = false

        printStartMessage()
        while(!isAnswer) {
            val userInput = receiveUserInput()
            isAnswer = compareWithAnswer(userInput)
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

    private fun compareWithAnswer(userInput: List<Int>): Boolean {
        TODO("compare with userInput and answer")
        TODO("compareWithAnswer should return Ball and Strike info.")
    }

    private fun printEndMessage() {
        println("3개의 숫자를 모두 맞히셨습니다! 게임 종료")
    }
}