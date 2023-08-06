package baseball.util

import camp.nextstep.edu.missionutils.Randoms

class AnswerGenerator {
    companion object {
        fun generate(): List<Int> {
            val answer = mutableListOf<Int>()
            while (answer.size < 3) {
                val randomNumber = Randoms.pickNumberInRange(1, 9)
                if (!answer.contains(randomNumber)) {
                    answer.add(randomNumber)
                }
            }
            return answer
        }
    }
}