package baseball.ball

class Balls(balls: List<Ball>){
    private val ballCount = balls.count { it == Ball.BALL }
    private val strikeCount = balls.count { it == Ball.STRIKE }

    override fun toString(): String {
        return when {
            (ballCount == 0 && strikeCount == 0) -> "낫싱"
            (ballCount == 0) -> "${strikeCount}스트라이크"
            (strikeCount == 0) -> "${ballCount}볼"
            else -> "${ballCount}볼 ${strikeCount}스트라이크"
        }
    }

    fun isEnd(): Boolean {
        return strikeCount == 3
    }
}