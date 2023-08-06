package baseball.ball

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BallsTest {
    private lateinit var balls: Balls

    @Test
    fun `Balls toString test for nothing`() {
        balls = Balls(listOf())
        assertThat(balls.toString()).isEqualTo("낫싱")
    }

    @Test
    fun `Balls toString test for 2Strike`() {
        balls = Balls(listOf(Ball.STRIKE, Ball.STRIKE))
        assertThat(balls.toString()).isEqualTo("2스트라이크")
    }

    @Test
    fun `Balls toString test for 2Ball`() {
        balls = Balls(listOf(Ball.BALL, Ball.BALL))
        assertThat(balls.toString()).isEqualTo("2볼")
    }

    @Test
    fun `Balls toString test for Strike-Ball-Strike`() {
        balls = Balls(listOf(Ball.STRIKE, Ball.BALL, Ball.STRIKE))
        assertThat(balls.toString()).isEqualTo("1볼 2스트라이크")
    }

    @Test
    fun `Balls isEnd test for 2Strike 1Ball`() {
        balls = Balls(listOf(Ball.STRIKE, Ball.STRIKE, Ball.BALL))
        assertThat(balls.isEnd()).isFalse()
    }

    @Test
    fun `Balls isEnd test for 3Strike`() {
        balls = Balls(listOf(Ball.STRIKE, Ball.STRIKE, Ball.STRIKE))
        assertThat(balls.isEnd()).isTrue()
    }
}