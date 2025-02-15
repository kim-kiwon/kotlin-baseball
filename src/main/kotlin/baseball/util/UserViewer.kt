package baseball.util

class UserViewer {
    companion object {
        fun printAppBeginMessage() {
            println("숫자 야구 게임을 시작합니다.")
        }

        fun printAppFinishMessage() {
            println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.")
        }

        fun printReceiveNumberMessage() {
            print("숫자를 입력해주세요 : ")
        }

        fun printGameFinishMessage() {
            println("3개의 숫자를 모두 맞히셨습니다! 게임 종료")
        }
    }
}